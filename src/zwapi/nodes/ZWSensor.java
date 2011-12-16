package zwapi.nodes;

import zwapi.ZWFrame;
import zwapi.NoAssociatedNetworkException;
import zwapi.events.ZWAssociationListener;
import zwapi.events.ZWConfigurationListener;
import zwapi.events.ZWEvent;

/**
 * This class is used to model a sensor node in a z-wave network.
 * <p>
 * Sensors can set associations,
 * nodes to which basic set commands are sendwhen motion is detected. Sensors can also have configuration
 * parameters which can be set (parameters are adressed by ID, and is specific to the fabricator's implementation.
 * </p>
 * <p>
 * Sensors recieve events when a configuration or association report is recieved, 
 * and when the network controller recieves a basic set from the sensor.
 * </p>
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWSensor extends ZWNode {

    /**
     * The constructor
     * @param id
     */
    public ZWSensor(int id) {
        super(id);
    }

    /**
     * Sets a configuration parameter for the sensor
     * @param param
     * @param value
     * @throws NoAssociatedNetworkException
     */
    public void setConfigurationParameter(byte param, byte value) throws NoAssociatedNetworkException {
        if (network == null) {
            throw new NoAssociatedNetworkException();
        }
        byte[] cmd = {ZWFrame.COMMAND_CLASS_CONFIGURATION, ZWFrame.CONFIGURATION_SET, param, 1, value};
        network.sendData(this.id, cmd);
    }

    /**
     * 
     * @param param
     * @throws NoAssociatedNetworkException
     */
    public void getConfigurationParameter(byte param) throws NoAssociatedNetworkException {
        if (network == null) {
            throw new NoAssociatedNetworkException();
        }
        byte[] cmd = {ZWFrame.COMMAND_CLASS_CONFIGURATION, ZWFrame.CONFIGURATION_GET, param};
        network.sendData(this.id, cmd);
    }

    /**
     * Returns the list of associations for the sensor
     * @param group The group containing the z-wave sensor
     * @throws NoAssociatedNetworkException
     */
    public void getAssociation(byte group) throws NoAssociatedNetworkException {
        if (network == null) {
            throw new NoAssociatedNetworkException();
        }
        byte[] cmd = {ZWFrame.COMMAND_CLASS_ASSOCIATION, ZWFrame.ASSOCIATION_GET, group};
        network.sendData(this.id, cmd);
    }

    /**
     *  Sets an association between the sensor and a target node
     * @param dst The target
     * @param group The group containing the nodes
     * @throws NoAssociatedNetworkException
     */
    public void setAssociation(byte dst, byte group) throws NoAssociatedNetworkException {
        if (network == null) {
            throw new NoAssociatedNetworkException();
        }
        byte[] cmd = new byte[]{ZWFrame.COMMAND_CLASS_ASSOCIATION, ZWFrame.ASSOCIATION_SET, group, dst};
        network.sendData(this.id, cmd);
    }

    /**
     * Removes an association from the sensor
     * @param dst
     * @param group
     * @throws NoAssociatedNetworkException
     */
    public void removeAssociation(byte dst, byte group) throws NoAssociatedNetworkException {
        if (network == null) {
            throw new NoAssociatedNetworkException();
        }
        byte[] cmd = new byte[]{ZWFrame.COMMAND_CLASS_ASSOCIATION, ZWFrame.ASSOCIATION_REMOVE, group, dst};
        network.sendData(this.id, cmd);
    }
     /**
     *
     * @param listener
     */
    public void addZWConfigurationListener(ZWConfigurationListener listener) {
        listeners.add(ZWConfigurationListener.class, listener);
    }
    /**
     *
     * @param listener
     */
    public void removeZWConfigurationListener(ZWConfigurationListener listener) {
        listeners.remove(ZWConfigurationListener.class, listener);
    }
    /**
     * fire a ZWConfigurationEvent
     * @param event
     */
    public void fireZWConfigurationEvent(ZWEvent event) {
        Object[] l = listeners.getListenerList();
        // loop through each listener and pass on the event if needed
        int numListeners = l.length;
        for (int i = 0; i < numListeners; i += 2) {
            if (l[i] == ZWConfigurationListener.class) {
                // pass the event to the listeners event dispatch method
                ((ZWConfigurationListener) l[i + 1]).ZWConfigurationEventOccurred(event);
            }
        }
        fireZWEvent(event);
    }
    /**
     *
     * @param listener
     */
    public void addZWAssociationListener(ZWAssociationListener listener) {
        listeners.add(ZWAssociationListener.class, listener);
    }
    /**
     *
     * @param listener
     */
    public void removeZWAssociationListener(ZWAssociationListener listener) {
        listeners.remove(ZWAssociationListener.class, listener);
    }
    /**
     * fire a ZWAssociationEvent
     * @param event
     */
    public void fireZWAssociationEvent(ZWEvent event) {
        Object[] l = listeners.getListenerList();
        // loop through each listener and pass on the event if needed
        int numListeners = l.length;
        for (int i = 0; i < numListeners; i += 2) {
            if (l[i] == ZWAssociationListener.class) {
                // pass the event to the listeners event dispatch method
                ((ZWAssociationListener) l[i + 1]).ZWAssociationEventOccurred(event);
            }
        }
        fireZWEvent(event);
    }
}
