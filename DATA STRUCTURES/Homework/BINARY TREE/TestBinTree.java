
public class TestBinTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(9);
		tree.root.left = new TreeNode(11);
		tree.root.right = new TreeNode(14);
		
		tree.root.left.left = new TreeNode(5);
		tree.root.left.right = new TreeNode(1);
		
		tree.root.left.left.left = new TreeNode(50);
		tree.root.left.left.right = new TreeNode(100);
		
		System.out.println("In Order Traversal:");
		tree.PrintInOrder(tree.root);
		
		System.out.println("\n");
		System.out.println("Post Order Traversal:");
		tree.PrintPostOrder(tree.root);
		
		System.out.println("\n");
		System.out.println("Pre Order Traversal:");
		tree.PrintPreOrder(tree.root);
		
		System.out.println("\n");
		System.out.println("Is " + tree.root.data + " a leaf ?");
		System.out.println(tree.isLeaf(tree.root));
		
		System.out.println("\n");
		System.out.println("Is " + tree.root.left.right.data + " a leaf ?");
		System.out.println(tree.isLeaf(tree.root.left.right));
		
		System.out.println("\n");
		System.out.println("Height of " + tree.root.data + " = ");
		System.out.println(tree.getHeight(tree.root));
	
	}

}
