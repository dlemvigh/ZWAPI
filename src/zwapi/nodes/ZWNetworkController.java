package zwapi.nodes;

import zwapi.ZWFrame;
import java.io.InputStream;
import java.io.OutputStream;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEventListener;
import java.io.IOException;
import java.util.TooManyListenersException;

/**
 * Model of the Z-Wave serial controller for communicating with the Z-Wave network
 *
 * @author David Lemvigh
 * @author Andreas Møller
 */
public class ZWNetworkController extends ZWController {

    private InputStream in;
    private OutputStream out;
    private CommPort commPort;
    private SerialPort serialPort;

    /**
     * Constructor for the network controller. <br/>
     * Also opens the connection to the port, and input/output-streams.
     * @param id node ID on in the Z-Wave network
     * @param portName name of the port the serial device is connected to.
     *  Can be set to null or blank, in which case the default os port with be assumed.
     * @throws Exception wrong port, occupied port, IOExceptions, all that good jazz.
     */
    public ZWNetworkController(int id, String portName) throws Exception {
        super(id);

        if (portName == null || portName.equals("")) {
            if (System.getProperty("os.name").equals("Mac OS X")) {
                portName = "/dev/tty.PL2303-00001004";
            } else if (System.getProperty("os.name").equals("Linux")) {
                portName = "/dev/ttyUSB0";
            }
        }
        System.out.println(portName);
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if (portIdentifier.isCurrentlyOwned()) {
            System.out.println("Error: Port is currently in use");
        } else {
            commPort = portIdentifier.open(this.getClass().getName(), 2000);

            if (commPort instanceof SerialPort) {
                serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

                in = serialPort.getInputStream();
                out = serialPort.getOutputStream();

            } else {
                System.out.println("Error: Only serial ports are handled by this example.");
            }
        }

    }

    public InputStream getInputStream() {
        return in;
    }

    public OutputStream getOutputStream() {
        return out;
    }

    public void setEventListener(SerialPortEventListener listener) {
        try {
            serialPort.addEventListener(listener);
            serialPort.notifyOnDataAvailable(true);
        } catch (TooManyListenersException ex) {
            System.err.println("Couldn't add listener to z-wave input stream");
        }
    }

    public void send(byte[] data) {
        try {
            out.write(data);
        } catch (IOException ex) {
            System.err.println("Unable to send data:\n" + ZWFrame.bytes2string(data));
            ex.printStackTrace();
        }
    }

    public void setDefault() {
        ZWFrame zm = new ZWFrame(ZWFrame.REQUEST, ZWFrame.ZW_SET_DEFAULT, null);
        send(zm.getBytes());
    }

    /**
     * requests a version report from the network controller
     */
    public void getVersion() {
        ZWFrame zm = new ZWFrame(ZWFrame.REQUEST, ZWFrame.ZW_VERSION, null);
        send(zm.getBytes());
    }

    /**
     * Network controller broadcasts it's node information frame
     */
    public void sendNodeInfo() {
        byte[] payload = {ZWFrame.NODE_BROADCAST};
        ZWFrame zm = new ZWFrame(ZWFrame.REQUEST, ZWFrame.ZW_SEND_NODE_INFO, payload, true); //send node information
        send(zm.getBytes());
    }

    public void sendAck() {
        try {
            out.write(ZWFrame.ACK);
        } catch (IOException ex) {
            System.err.println("Unable to send Acknowledge");
            ex.printStackTrace();
        }
    }

    public void sendNak() {
        try {
            out.write(ZWFrame.NAK);
        } catch (IOException ex) {
            System.err.println("Unable to send Not-Acknowledged");
            ex.printStackTrace();
        }
    }

}
