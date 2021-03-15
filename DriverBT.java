public class DriverBT {
    public static void main(String[] args) {
		
		System.out.println("2nd Testing Example:");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		createTree2(aTree2);
		
		System.out.println("(binaryTree) post-order: ");
		aTree2.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree2.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
		
		System.out.println("Done.");
	}  // end main

	public static void createTree2(BinaryTree<String> tree)
	{ 
		// Leaves:
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");

		// Subtrees:
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
		BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", null, null);
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);

		// Root: 
		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nGiven Tree:\n");
      System.out.println("     A             ");
      System.out.println("   /   \\          ");
      System.out.println("  B     C          ");
      System.out.println("       /  \\       ");
      System.out.println("      D     E      ");
      System.out.println("     /     /  \\   ");
      System.out.println("    F     G     H  ");
      System.out.println();
	} // end createTree
	

}
