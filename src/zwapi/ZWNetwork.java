package zwapi;

import zwapi.nodes.ZWNode;
import zwapi.nodes.ZWNetworkController;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import zwapi.cmd.ZWCmdClass;
import zwapi.events.ZWEvent;
import zwapi.nodes.ZWEZMotionSensor;
import zwapi.nodes.ZWSensor;

/**
 * The Network class models a z-wave network. In order to communicate with your physical z-wave network, the network must first be modeled
 * by adding nodes to the network using addNode().
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWNetwork implements SerialPortEventListener {

    private Map<Integer, ZWNode> nodes = new HashMap<Integer, ZWNode>();
    private ZWNetworkController networkController;

    /**
     * The constructor.
     * @param networkController The static controller for the z-wave network. aka the usbstick.
     */
    public ZWNetwork(ZWNetworkController networkController) {
        this.networkController = networkController;
        networkController.setEventListener(this);
    }
    /**
     *
     * @return The ZWNetworkController
     */
    public ZWNetworkController getNetworkController() {
        return networkController;
    }
    /**
     *
     * @return The Map of nodes in the network with z-wave node id's as index
     */
    public Map<Integer, ZWNode> getNodes() {
        return nodes;
    }
    /**
     * Adds the zWNode to the network
     * @param node The node to be added
     */
    public void addNode(ZWNode node) {
        nodes.put(node.getID(), node);
        node.setNetwork(this);
    }
    /**
     * Adds alist of nodes to the network
     * @param nodeList
     */
    public void addNodes(ZWNode... nodeList) {
        for (ZWNode node : nodeList) {
            addNode(node);
        }
    }
    /**
     * Removes a node from the network
     * @param node
     * @return The removed node.
     */
    public ZWNode removeNode(ZWNode node) {
        node.setNetwork(null);
        return nodes.remove(node.getID());
    }
    /**
     * Removes a node by its z-wave node id.
     * @param id z-wave node id
     * @return The removed node
     */
    public ZWNode removeNode(int id) {
        return nodes.remove(id);
    }
    /**
     *
     * @param id The z-wave node id
     * @return The node
     */
    public ZWNode getNode(int id) {
        return nodes.get(id);
    }
    /**
     * Sends data to a node in the z-wave network
     * @param dst The destination node
     * @param data The date to be sent
     * @return The ZWframe sent
     */
    public ZWFrame sendData(byte dst, byte[] data) {
        byte[] payload = new byte[data.length + 2];
        payload[0] = dst;
        payload[1] = (byte) data.length;
        System.arraycopy(data, 0, payload, 2, data.length);

        ZWFrame zm = new ZWFrame(ZWFrame.REQUEST, ZWFrame.ZW_SEND_DATA, payload, true);
        System.out.println("== message send ==\n" + zm);
        networkController.send(zm.getBytes());
        return zm;
    }
    /**
     * not quite sure what this does maybe David knows
     * @param arg0
     */
    public void serialEvent(SerialPortEvent arg0) {
        int data;

        try {
            ZWFrame message = null;
            while ((data = networkController.getInputStream().read()) > -1) {

                if (message == null) {

                    if (data == 0x01) { //SOF
                        message = new ZWFrame();
                    } else {
                        //TODO data not part of message (ACK / NACK / Cancel / ...)
                        if (data == ZWFrame.ACK) {
                            System.out.println("Acknowledge recieved");
                        } else if (data == ZWFrame.NAK) {
                            System.err.println("Not-Acknowledged recieved");
                        } else if (data == ZWFrame.CAN) {
                            System.err.println("Cancel recieved");
                        } else {
                            System.out.printf("0x%02X\n", data);
                        }
                    }
                } else {
                    boolean done = message.digest((byte) data);
                    if (done) {
                        //TODO msg done
//                        System.out.println("== message recieved ==\n" + message);
                        networkController.sendAck();
                        ZWCmdClass cmd;
                        switch (message.command) {
                            case 0x15: //getVersion response
                                ZWEvent event = new ZWEvent(networkController,(byte)0x86, (byte) 0x12, message.payload);
                                networkController.fireZWVersionEvent(event);
                                break;
                            case 0x04: // application command
                                cmd = ZWCmdClass.commandHandler(message.payload);
                                fireEvent(cmd);
                                
                                break;
                            case 0x49: // application slave update (unsolicited node information frame)
                                cmd = ZWCmdClass.commandHandler(message.payload);
                                fireEvent2(message.command, message.payload);
                                fireEvent(cmd);
                                break;
                        }

                        message = null;
                        break;


                        //determine incomming message

                        //Version response

                        //Configuration report

                        //assosiation report

                        //sensor event
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    public void fireEvent2(byte command, byte[] payload) {
        if (payload[0] == -124) {
            byte[] data = new byte[payload.length-2];
            System.arraycopy(payload, 2, data, 0, payload.length -2);
            if (nodes.containsKey((int) payload[1])) {
                ZWNode node = nodes.get((int)payload[1]);
                ZWEvent event = new ZWEvent(node, command, payload[0], data);
                node.fireZWNodeInfoEvent(event);
            }
        }
    }
    
    public void fireEvent(ZWCmdClass cmd){
        ZWEvent event = new ZWEvent(nodes.get((int)cmd.node),cmd.cmdClass,cmd.cmd,cmd.data);
        switch(cmd.cmdClass){
            case (byte)0x20: //basic
                nodes.get((int)cmd.node).fireZWBasicEvent(event);
                break;
            case (byte)0x70: // configuration
                ((ZWSensor) nodes.get((int) cmd.node)).fireZWConfigurationEvent(event);
                break;
            case (byte)0x85: // association
                ((ZWSensor)nodes.get((int)cmd.node)).fireZWAssociationEvent(event);
                break;
            case (byte) 0x31: //sensor multilevel
                ((ZWEZMotionSensor) nodes.get((int) cmd.node)).fireZWSensorMultilevelEvent(event);
                break;
            case (byte)0x26: // switch multilevel
                ((ZWEZMotionSensor) nodes.get((int) cmd.node)).fireZWSwitchMultilevelEvent(event);
                break;
            case (byte)0x84: // wake up
                ((ZWEZMotionSensor) nodes.get((int) cmd.node)).fireZWWakeUpEvent(event);
                break;
            case (byte)0x86: // version
                nodes.get((int) cmd.node).fireZWVersionEvent(event);
                break;
        }
    }
}
