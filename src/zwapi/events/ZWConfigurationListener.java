package zwapi.events;

import java.util.EventListener;

/**
 * The listener interface for receiving ZWConfigurationEvents
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public interface ZWConfigurationListener extends EventListener{
    /**
     *  Method called when a ZWConfigurationEvent occurs.
     * @param event
     */
    public void ZWConfigurationEventOccurred(ZWEvent event);

}
