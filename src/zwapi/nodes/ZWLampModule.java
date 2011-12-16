package zwapi.nodes;

import zwapi.events.ZWSwitchMultilevelListener;
import zwapi.NoAssociatedNetworkException;
import zwapi.events.ZWEvent;

/**
 * The class used to model a Z-wave lamp module.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWLampModule extends ZWApplianceModule {

    /**
     * The constructor
     * @param id The z-wave node id
     */
    public ZWLampModule(int id) {
        super(id);
    }

    /**
     * Sets the lighting level of the lamp module
     * @param level
     * @throws NoAssociatedNetworkException
     */
    public void setLevel(int level) throws NoAssociatedNetworkException {
        basicSet((byte) level);
    }

    /**
     * sets the lighting level of the lamp module
     * @param level
     * @throws NoAssociatedNetworkException
     */
    public void setLevel(byte level) throws NoAssociatedNetworkException {
        basicSet(level);
    }

    public void startLevelChange() {
        //not gonna happen
    }

    public void stopLevelChange() {
        //can't be bothered
    }

    /**
     * 
     * @param listener
     */
    public void addZWSwitchMultilevelListener(ZWSwitchMultilevelListener listener) {
        listeners.add(ZWSwitchMultilevelListener.class, listener);
    }

    /**
     * 
     * @param listener
     */
    public void removeZWSwitchMultilevelListener(ZWSwitchMultilevelListener listener) {
        listeners.remove(ZWSwitchMultilevelListener.class, listener);
    }

    /**
     * 
     * @param event
     */
    protected void fireZWSwitchMultilevelEvent(ZWEvent event) {
        Object[] l = listeners.getListenerList();
        // loop through each listener and pass on the event if needed
        int numListeners = l.length;
        for (int i = 0; i < numListeners; i += 2) {
            if (l[i] == ZWSwitchMultilevelListener.class) {
                // pass the event to the listeners event dispatch method
                ((ZWSwitchMultilevelListener) l[i + 1]).ZWSwitchMultilevelEventOccurred(event);
            }
        }
        fireZWEvent(event);
    }
}
