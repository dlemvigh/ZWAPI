package zwapi.nodes;

import zwapi.NoAssociatedNetworkException;

/**
 * This class i used to model a z-wave appliance module.
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWApplianceModule extends ZWSlave {
    /**
     * The constructor
     * @param id The z-wave node id
     */
    public ZWApplianceModule(int id) {
        super(id);
    }
    /**
     * Send a basic on to the appliance module
     * @throws NoAffiliatedNetworkException if no network i associated with the node
     */
    public void on() throws NoAssociatedNetworkException {
        basicSet(true);
    }
    /**
     * Sends a basic off to the appliance module
     * @throws NoAssociatedNetworkException if no network is associated with the node
     */
    public void off() throws NoAssociatedNetworkException {
        basicSet(false);
    }
}
