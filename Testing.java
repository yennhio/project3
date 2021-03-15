import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

              

    @Test
    public void testPostorderTraverse() {
        BinaryTree<String> aTree = new BinaryTree<>();  
        createTree(aTree);
        assertEquals("example output", aTree.postorderTraverse());    
    }

    @Test
    public void testPostorderTraverse_callBinaryNodeMethod() {
        createTree(aTree);
        assertEquals("A\nD", aTree.postorderTraverse_callBinaryNodeMethod());    
    }
    
    
}
