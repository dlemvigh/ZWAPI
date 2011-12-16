

package zwapi.cmd;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author David Lemvigh
 * @author Andreas Møller
 */
public class ZWCmdClassBasic {

    public static byte cmdClass = 0x20;
    public static String name = "Command Class Basic";

    public static Map<Byte,String> commands = new HashMap<Byte,String>();

    static {
        commands.put((byte) 0x01, "Basic Set");
        commands.put((byte) 0x02, "Basic Get");
        commands.put((byte) 0x03, "Basic Report");
    }

    public static byte cmd;
    public static byte value;
    /**
     *
     * @param command
     * @param data
     */
    public ZWCmdClassBasic(byte command, byte[] data) {
        this.cmd = command;
        switch (command) {
            case 1:
            case 3:
                value = data[0];
                break;
        }
    }

}
