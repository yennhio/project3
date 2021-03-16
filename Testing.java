import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
    
        public void createTree(BinaryTree<String> tree) {
        // Leaves:
            BinaryTree<String> dTree = new BinaryTree<>("D");
		    BinaryTree<String> gTree = new BinaryTree<>("G");
		    BinaryTree<String> hTree = new BinaryTree<>("H");

		// Subtrees:
            BinaryTree<String> fTree = new BinaryTree<>("F", hTree, null);
		    BinaryTree<String> eTree = new BinaryTree<>("E", gTree, null);
		    BinaryTree<String> bTree = new BinaryTree<>("B", dTree, null);
		    BinaryTree<String> cTree = new BinaryTree<>("C", eTree, fTree);
        
        //Root:    
            tree.setTree("A", bTree, cTree);
        }

        BinaryTree<String> aTree = new BinaryTree<>();  

        /**
         *      A
         *     / \
         *    B   C
         *   /   / \ 
         *  D   E   F
         *     /   /
         *    G   H
         */

    /**Tests BinaryTree.postorderTraverse() which calls 
     * BinaryNode.postorderTraverse(BinaryNode<T> node) 
     * for postorder traversal of the whole tree
    */
    @Test
    public void testPostorderTraverse() {
        createTree(aTree);
        aTree.postorderTraverse();    
    }

    /** Tests BinaryTree.postorderTraverse_callBinaryNodeMethod()
     * which calls BinaryNode.postorderTraverse_binaryNodeMethod()
     * to perform postorder traversal of the whole tree
     */
    @Test
    public void testPostorderTraverse_callBinaryNodeMethod() {
        createTree(aTree);
        aTree.postorderTraverse_callBinaryNodeMethod();    
    }

    /** Tests BinaryTree.getHeight() 
     * Computes the height of the tree
     */
    @Test
    public void testGetHeight() {
        createTree(aTree);
        assertEquals(4, aTree.getHeight());
    }

    /** Tests BinaryTree.getHeight_callBinaryNodeMethod() 
     * Computes the height of the tree
     */
    @Test
    public void testGetHeight_callBinaryNodeMethod() {
        createTree(aTree);
        assertEquals(4, aTree.getHeight_callBinaryNodeMethod());
    }

    /** Tests BinaryTree.getNumberOfNodes() 
     * Computes the number of nodes in the tree
     */
    @Test
    public void testGetNumberOfNodes() {
        createTree(aTree);
        assertEquals(8, aTree.getNumberOfNodes());
    }

    

    
    
}
