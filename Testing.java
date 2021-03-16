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
            tree.setTree("A", bTree, cTree);
        }

        BinaryTree<String> aTree = new BinaryTree<>();  

    @Test
    public void testPostorderTraverse() {
        createTree(aTree);
        aTree.postorderTraverse();    
    }

    @Test
    public void testPostorderTraverse_callBinaryNodeMethod() {
        createTree(aTree);
        aTree.postorderTraverse_callBinaryNodeMethod();    
    }

    @Test
    public void testGetHeight() {
        createTree(aTree);
        assertEquals(4, aTree.getHeight());
    }

    @Test
    public void testGetHeight_binaryNodeMethod() {
        createTree(aTree);
        assertEquals(4, aTree.getHeight_callBinaryNodeMethod());
    }

    
    
}
