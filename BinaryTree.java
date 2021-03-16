import java.util.EmptyStackException;


public class BinaryTree<T> implements BinaryTreeInterface<T> {
    
    private BinaryNode<T> root;

    public BinaryTree() {
        root = null;
    } //end default constructor

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    } //end constructor

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    } //end constructor

    /** Sets this binary tree to a new one-node binary tree.
     * @param rootData The object that is the data for the new tree's root.
     */
    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    /** Sets this binary tree to a new binary tree.
     * @param rootData The object that is the data for the new tree's root.
     * @param leftTree The left subtree of the new tree.
     * @param rightTree The right subtree of the new tree.
     */
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                    BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree<T>)leftTree,
                                  (BinaryTree<T>)rightTree);
    }

    /** Sets a new binary tree.
     * @param rootData The object that is the data for the new tree's root.
     * @param leftTree The left subtree of the new tree.
     * @param rightTree The right subtree of the new tree.
     */
    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        root = new BinaryNode<>(rootData);
        
        if ((leftTree != null) && !leftTree.isEmpty())
            root.setLeftChild(leftTree.root);

        if ((rightTree != null) && !rightTree.isEmpty())
        {
            if (rightTree != leftTree)
                root.setRightChild(rightTree.root);
            else
                root.setRightChild(rightTree.root.copy());
        }
        if ((leftTree != null) && (leftTree != this))
            leftTree.clear();

        if((rightTree != null) && (rightTree != this))
            rightTree.clear();
    }

    /** Performs postorder traversal of the whole tree. */
    public void postorderTraverse() {
        postorderTraverse(root);
    }

    /** Performs postorder traversal of a subtree rooted at a given node.
     * @param node The location of the root of the subtree 
     */
    private void postorderTraverse(BinaryNode<T> node) {
        if (node != null) {
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    /** Calls BinaryNode.postorderTraverse_binaryNodeMethod() 
     * to perform postorder traversal of the whole tree. */
    public void postorderTraverse_callBinaryNodeMethod() {
        root.postorderTraverse_binaryNodeMethod();
    }

    /** Calls BinaryNode.getHeight_binaryNodeMethod() to 
     * return the height of the whole tree. */
    public int getHeight_callBinaryNodeMethod() {
        return root.getHeight_binaryNodeMethod();
    }

    /** Calls the method getNumberOfNodes(BinaryNode<T> node) to 
     * return the number of nodes of the whole tree. */
    public int getNumberOfNodes() {
        return getNumberOfNodes(root);
    }
    
    /** Returns the number of nodes of a subtree rooted at a given node. 
     * @param node The location of the root
    */
    private int getNumberOfNodes(BinaryNode<T> node) {
        int leftNumber = 0;
        int rightNumber = 0;

        if (node.getLeftChild() != null)
            leftNumber = getNumberOfNodes(node.getLeftChild());
        if (node.getRightChild() != null)
            rightNumber = getNumberOfNodes(node.getRightChild());

        return 1 + leftNumber + rightNumber;
    }

    /** Returns the height of the whole tree. */
    public int getHeight() {
        return getHeight(root);
    }

    /** A Recursive Method in the BinaryTree Class  
    * Computes the height of the subtree rooted at this node.
   @return  The height of the subtree rooted at this node. */
   private int getHeight(BinaryNode<T> node)
   {
      int height = 0;
      if (node != null)
         height = 1 + Math.max(getHeight(node.getLeftChild()),
                               getHeight(node.getRightChild()));
      return height;
   }

    /** Sets the root to null, hence the tree becomes empty. */
    public void clear() {
        root = null;
    }

    /** Sets the root data.
     * @param rootData The object that is the data for the new tree's root.
     */
    public void setRootData(T rootData)
    {
      root.setData(rootData);
    }

    /** Gets the root data. */
    public T getRootData(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            return root.getData();
    }

    /** Checks whether the root is empty.
     * @return True if the root is empty, otherwise false.
     */
    public boolean isEmpty() {
        return root == null;
    }

    
}
