import java.util.Iterator;
import java.util.NoSuchElementException;

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

    public void postorderTraverse(BinaryNode<T> node) {
        if (node != null) {
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    public void postorderTraverse_callBinaryNodeMethod() {
        BinaryNode<T> thing = new BinaryNode<>();
        thing.postorderTraverse_binaryNodeMethod();
    }

    public int getNumberOfNodes() {
        int leftNumber = 0;
        int rightNumber = 0;

        if (leftChild != null)
            leftNumber = leftChild.getNumberOfNodes();
        if (rightChild != null)
            rightNumber = rightChild.getNumberOfNodes();

        return 1 + leftNumber + rightNumber;
    }
}
