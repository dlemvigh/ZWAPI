package zwapi;

/**
 *
 * The NoAffiliatedNetwork exception is thrown if a node tries to communicate via z-wave, without having an affiliated network.
 * @author David Lemvigh
 * @author Andreas Møller
 * @author Andreas Møller
 */
public class NoAssociatedNetworkException extends Exception{
    public NoAssociatedNetworkException(){
        super();
    }
    /**
     *  
     * @return the error string
     */
    public String getError(){
        return "The node object has no associated network. Add the node to a network before calling z-wave methods";
    }

}
