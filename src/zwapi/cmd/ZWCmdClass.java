
package zwapi.cmd;

/**
 * Z-Wave Command Class <br/>
 * A struct for recieving commands from the z-wave network.
 * @author David Lemvigh
 * @author Andreas Møller
 */
public class ZWCmdClass {

    /**
     * recieve status: <br/>
     * xxxx00xx if singlecast<br/>
     * xxxx01xx if multicast<br/>
     * xxxx10xx if broadcast<br/>
     */
    public byte rxStatus;

    /** Node id of sender */
    public byte node;
    /** Command Class */
    public byte cmdClass;
    /** Command */
    public byte cmd;
    /** command specific data (if any) */
    public byte[] data;
    /**
     * 
     * @param payload
     * @return
     */
    /**
     * Parses the payload of a recieved frama from the Z-Wave network
     * @param payload
     * @return the parsed information
     */
    public static ZWCmdClass commandHandler(byte[] payload) {
        ZWCmdClass msg = new ZWCmdClass();
        int idx = 0;

        msg.rxStatus = payload[idx++];
        msg.node = payload[idx++];

        int length = payload[idx++] -2;
        msg.data = new byte[length];

        msg.cmdClass = payload[idx++];
        msg.cmd = payload[idx++];

        System.arraycopy(payload, idx, msg.data, 0, length);

        return msg;
    }

    public boolean isMultiCast() {
        return (4 & rxStatus) > 0;
    }

    public boolean isBroadCast() {
        return (8 & rxStatus) > 0;
    }

    public boolean isSingleCast() {
        return ! (isMultiCast() || isBroadCast());
    }
}
