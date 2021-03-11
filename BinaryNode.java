public class BinaryNode<T> {
    private T data;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    public BinaryNode() {
        this(null);
    } //end default constructor

    public BinaryNode(T dataPortion) {
        this(dataPortion, null, null);
    } //end constructor

    public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, BinaryNode<T> newRightChild) {
        data = dataPortion;
        leftChild = newLeftChild;
        rightChild = newRightChild;
    } //end constructor
 
    /** Retrieves the data portion of this node
     * @return the object in the data portion of the node
     */
    public T getData() {
        return data;
    }

    /** Sets the data portion of this node
     * @param newData the data object
     */
    public void setData(T newData) {
        data = newData;
    }

    /** Retrieves the left child of this node
     * @return The node that is this node's left child
     */
    public BinaryNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode<T> newRightChild) {
        rightChild = newRightChild;
    }

    /** Detects whether this node has a left child
     * @return True if the node has a left child
     */
    public boolean hasRightChild() {
        return rightChild != null;
    }

    /** Retrieves the left child of this node
     * @return The node that is this node's left child
     */
    public BinaryNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode<T> newLeftChild) {
        leftChild = newLeftChild;
    }

    /** Detects whether this node has a left child
     * @return True if the node has a left child
     */
    public boolean hasLeftChild() {
        return leftChild != null;
    }

    /** Detects whether this node is a leaf
     * @return True if the node is a leaf
     */
    public boolean isLeaf() {
        return (leftChild == null) && (rightChild == null);
    }
    
    public BinaryNode<T> copy() {
        BinaryNode<T> newRoot = new BinaryNode<>(data);
        if (leftChild != null) 
            newRoot.setLeftChild(leftChild.copy());
        if (rightChild != null) 
            newRoot.setRightChild(rightChild.copy());
        
        return newRoot;
    }

    public void postorderTraverse_binaryNodeMethod() {
        BinaryTree<T> example = new BinaryTree<>();
        example.postorderTraverse();
    }
}
