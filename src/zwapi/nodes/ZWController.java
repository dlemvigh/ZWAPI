package zwapi.nodes;


/**
 * The class used to model a z-wave controller
 * @author Andreas Møller
 * @author David Emil Lemvigh
 */
public class ZWController extends ZWNode {
    /**
     * The constructor
     * @param id The z-wave node id for the static controller
     */
    public ZWController(int id) {
        super(id);
    }
}
