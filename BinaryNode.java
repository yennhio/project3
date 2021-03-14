public class BinaryNode<T> {
    
    private T data;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;
    BinaryNode<T> someTree = new BinaryNode<>();

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

    public T getLeftMostData() {
        if (leftChild == null)
            return data;
        else   
            return leftChild.getLeftMostData();
    }

    public T getRightMostData() {
        if (rightChild == null)
            return data;
        else   
            return rightChild.getRightMostData();
    }

    public BinaryNode<T> removeLeftMost() {
        if (leftChild == null) {
            return rightChild;
        }
        else {
            leftChild.leftChild.removeLeftMost();
            return this;
        }
    }

    public BinaryNode<T> removeRightMost() {
        if (rightChild == null) {
            return leftChild;
        }
        else {
            rightChild.rightChild.removeRightMost();
            return this;
        }
    }

    public void postorderTraverse_binaryNodeMethod() {
        if (getLeftChild() != null) {
            getLeftChild().postorderTraverse_binaryNodeMethod();
            getRightChild().postorderTraverse_binaryNodeMethod();
            System.out.println(getData());
        }
    }

    public int getHeight_binaryNodeMethod() {
        int height = 0;

        if (someTree != null)
            height = 1 + Math.max(getLeftChild().getHeight_binaryNodeMethod(),
                                  getRightChild().getHeight_binaryNodeMethod());
        return height;
    }
}
