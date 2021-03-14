import java.util.EmptyStackException;


public class BinaryTree<T> implements BinaryTreeInterface<T> {
    
    private BinaryNode<T> root;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    public BinaryTree() {
        root = null;
    } //end default constructor

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    } //end constructor

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    } //end constructor

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

    public void postorderTraverse() {
        postorderTraverse(root);
    }

    private void postorderTraverse(BinaryNode<T> node) {
        if (node != null) {
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    public void postorderTraverse_callBinaryNodeMethod() {
        root.postorderTraverse_binaryNodeMethod();
    }

    public int getHeight_callBinaryNodeMethod() {
        return root.getHeight_binaryNodeMethod();
    }

    public int getNumberOfNodes() {
        return getNumberOfNodes(root);
    }
    
    private int getNumberOfNodes(BinaryNode<T> node) {
        int leftNumber = 0;
        int rightNumber = 0;

        if (leftChild != null)
            leftNumber = getNumberOfNodes(leftChild);
        if (rightChild != null)
            rightNumber = getNumberOfNodes(rightChild);

        return 1 + leftNumber + rightNumber;
    }

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

    public void clear() {
        root = null;
    }

    public void setRootData(T rootData)
    {
      root.setData(rootData);
    }

    public T getRootData(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            return root.getData();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                    BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree<T>)leftTree,
                                  (BinaryTree<T>)rightTree);
    }
}
