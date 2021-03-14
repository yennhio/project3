import org.junit.Test;

public class Testing {

    @Test
    public void testPostorderTraverse() {
        BinaryTree<String> tree = new BinaryTree<>();
        BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);


        @Test
        public void testPostorderTraverse_binaryNodeMethod() {
            
        }
    }
    
}
