package binarysearhtree;

/**
 * Juan Pastelin Brioso 
 * 
 * @version 1.0 
 * @param <D> tipo de generico a utilizar
 */
public interface Tree<D extends Comparable> {
    
    public abstract boolean isEmpty();
    public abstract int cardinality();
    public abstract boolean member(D elt);
    public abstract NonEmptyBST<D> add(D elt);
    
}