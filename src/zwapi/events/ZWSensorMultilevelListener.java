
package zwapi.events;

import java.util.EventListener;

/**
 * The listener interface for receiving ZWSensorMultilevelEvents
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public interface ZWSensorMultilevelListener extends EventListener{
    /**
     * The method triggered when an ZWSensorMultilevelEvent occurs.
     * @param event
     */
    public void ZWSensorMultilevelEventOccurred(ZWEvent event);

}
