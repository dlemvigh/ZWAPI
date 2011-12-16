package zwapi.events;

import java.util.EventListener;

/**
 * The listener interface for recieving ZWBasicEvents
 * @author Andreas Møller
 */
public interface ZWBasicListener extends EventListener {
    /**
     * The method called when a ZWBasicEvent occurs;
     * @param event
     */
    public void ZWBasicEventOccurred(ZWEvent event);
}