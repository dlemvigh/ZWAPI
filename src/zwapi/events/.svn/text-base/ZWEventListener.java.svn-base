package zwapi.events;

import java.util.EventListener;
/**
 * If a class wishes to receive communication from a z-wave network, it must implement the ZWEventListener interface, or a sub interface of this.
 * When ever the USB interface receives a message from a node in the network, a ZWEvent is generated, based on the message received.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public interface ZWEventListener extends EventListener {
    /**
     * The method called when a ZWEvent occurs.
     * @param event
     */
    public void ZWEventOccurred(ZWEvent event);
}