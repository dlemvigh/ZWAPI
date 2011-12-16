package zwapi.nodes;

import zwapi.NoAssociatedNetworkException;
import zwapi.events.ZWEvent;
import zwapi.events.ZWSensorMultilevelListener;
import zwapi.events.ZWSwitchMultilevelListener;
import zwapi.events.ZWWakeUpListener;

/**
 * An extension of the basic ZWSensor for the EZMotion sensor.
 * The only difference is the spefic calls to configuration parameters, instead of their IDs.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWEZMotionSensor extends ZWSensor{
    /**
     * The constructor
     * @param id The z-wave node id.
     */
    public ZWEZMotionSensor(int id) {
        super(id);
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
     * Fire a ZWSwitchMultilevelEvent
     * @param event
     */
    public void fireZWSwitchMultilevelEvent(ZWEvent event) {
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
    /**
     * 
     * @param listener
     */
    public void addZWSensorMultilevelListener(ZWSensorMultilevelListener listener) {
        listeners.add(ZWSensorMultilevelListener.class, listener);
    }
    /**
     * 
     * @param listener
     */
    public void removeZWSensorMultilevelListener(ZWSensorMultilevelListener listener) {
        listeners.remove(ZWSensorMultilevelListener.class, listener);
    }
    /**
     * fire a ZWSensorMultilevelEvent
     * @param event
     */
    public void fireZWSensorMultilevelEvent(ZWEvent event) {
        Object[] l = listeners.getListenerList();
        // loop through each listener and pass on the event if needed
        int numListeners = l.length;
        for (int i = 0; i < numListeners; i += 2) {
            if (l[i] == ZWSensorMultilevelListener.class) {
                // pass the event to the listeners event dispatch method
                ((ZWSensorMultilevelListener) l[i + 1]).ZWSensorMultilevelEventOccurred(event);
            }
        }
        fireZWEvent(event);
    }

   
    
    
    /**
     *
     * @param listener
     */
    public void addZWWakeUpListener(ZWWakeUpListener listener) {
        listeners.add(ZWWakeUpListener.class, listener);
    }
    /**
     * 
     * @param listener
     */
    public void removeZWWakeUpListener(ZWWakeUpListener listener) {
        listeners.remove(ZWWakeUpListener.class, listener);
    }
    /**
     * fire a ZWWakeUpEvent
     * @param event
     */
    public void fireZWWakeUpEvent(ZWEvent event) {
        Object[] l = listeners.getListenerList();
        // loop through each listener and pass on the event if needed
        int numListeners = l.length;
        for (int i = 0; i < numListeners; i += 2) {
            if (l[i] == ZWWakeUpListener.class) {
                // pass the event to the listeners event dispatch method
                ((ZWWakeUpListener) l[i + 1]).ZWWakeUpEventOccurred(event);
            }
        }
        fireZWEvent(event);
    }
    
    
    /**
     * Set the sensor sensitivity
     * @param value
     * @throws NoAssociatedNetworkException
     */
    public void setSensitivity(byte value) throws NoAssociatedNetworkException {
        setConfigurationParameter((byte) 1, value);
    }
    /**
     *
     * @throws NoAssociatedNetworkException
     */
    public void getSensitivity() throws NoAssociatedNetworkException {
        getConfigurationParameter((byte) 1);
    }
    /**
     * Sets the duration the node should stay on after wake-up
     * @param value duration in seconds
     * @throws NoAssociatedNetworkException
     */
    public void setOnTime(byte value) throws NoAssociatedNetworkException {
        setConfigurationParameter((byte) 2, value);
    }
    
    public void setOnTime(int value) throws NoAssociatedNetworkException {
        setOnTime((byte) value);
    }
    /**
     *
     * @throws NoAssociatedNetworkException
     */
    public void getOnTime() throws NoAssociatedNetworkException {
        getConfigurationParameter((byte) 2);
    }
    /**
     * nooo clue
     * @param value
     * @throws NoAssociatedNetworkException
     */
    public void setOnValue(byte value) throws NoAssociatedNetworkException {
        setConfigurationParameter((byte) 6, value);
    }
    /**
     * 
     * @throws NoAssociatedNetworkException
     */
    public void getOnValue() throws NoAssociatedNetworkException {
        getConfigurationParameter((byte) 6);
    }
    //TODO get temperature
}
