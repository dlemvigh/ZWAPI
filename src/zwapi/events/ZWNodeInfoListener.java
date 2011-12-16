package zwapi.events;

import java.util.EventListener;
/**
 * The listener interface for receiving ZWNodeInfoEvents.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public interface ZWNodeInfoListener extends EventListener{
    /**
     * The method triggered when a ZWNodeInfoEvent occurs.
     * @param event
     */
    public void ZWNodeInfoEventOccurred(ZWEvent event);
}
