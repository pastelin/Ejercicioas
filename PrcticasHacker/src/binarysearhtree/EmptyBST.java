package binarysearhtree;

/**
 *
 * @author Juan Pastelin Brioso
 * 
 * @version 1.0 
 */
public class EmptyBST<D extends Comparable> implements Tree<D>  {
    
    public EmptyBST() {
        
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public int cardinality() {
        return 0;
    }
    
    public boolean member(D elt) {
        return false;
    }
    
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }

    
}
