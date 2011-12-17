package zwapi.events;

import java.util.EventObject;
import zwapi.nodes.ZWNode;

/**
 * The ZWEvent object is the basis of any ZWEvent. All communication recieved from a z-wave network
 * is handled by implementing listeners of either this event, or subclasses.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWEvent extends EventObject{
    protected byte commmandClass, command;
    protected byte[] data;

    /**
     *
     * @param source
     * @param commandClass
     * @param command
     * @param data
     */
    public ZWEvent(ZWNode source, byte commandClass, byte command, byte [] data){
        super(source);
        this.command = command;
        this.commmandClass = commandClass;
        this.data = data;
    }
    public byte getCommandClass(){return commmandClass;}
    public byte getCommand(){return command;}
    public byte[] getData(){return data;}

}

