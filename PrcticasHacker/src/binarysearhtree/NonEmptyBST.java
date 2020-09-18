package binarysearhtree;

/**
 *
 * @author XME6301_1
 */
class NonEmptyBST<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D elt) {

        this.data = elt;
        this.left = new EmptyBST<D>();
        this.right = new EmptyBST<D>();

    }
    
    public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
        
        this.data = elt;
        this.left = leftTree;
        this.right = rightTree;
        
    }

    public boolean isEmpty() {
        return false;
    }

    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D elt) {

        if (data == elt) {

            return true;

        } else {

            if (elt.compareTo(data) < 0) {

                return this.left.member(elt);
                
            } else {
                
                return this.right.member(elt);
                
            }
 
        }

    }
    
    public NonEmptyBST<D> add(D elt) {
        
        if (data == elt) {
            
            return this;
        
        } else {
            
            if (elt.compareTo(data) < 0) {
                
                return new NonEmptyBST(data, left.add(elt), right);
                
            } else {
                
                return new NonEmptyBST(data, left, right.add(elt));
                
            }
        } 
        
    }
    
}
