
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(77);
		tree.root.left = new TreeNode(1);
		tree.root.right = new TreeNode(2);
		
		tree.root.left.left = new TreeNode(8);
		tree.root.left.right = new TreeNode(15);
		
		tree.root.right.left = new TreeNode(60);
		tree.root.right.right = new TreeNode(45);
		
		System.out.println("My initial Tree:");
		tree.PrintPostOrder(tree.root);
		
		System.out.println("\n");
		System.out.println("...Deleting left and righ subtrees of root...");
		tree.deleteTree1();
		
		System.out.println("\n");
		System.out.println("Is tree empty? " + tree.isEmpty());
		System.out.println("My new Tree:");
		tree.PrintPostOrder(tree.root);
		
		
		System.out.println("\n");
		System.out.println("...Deleting last node of tree...");
		System.out.println("\n");
		tree.deleteTree2();
		System.out.println("Is tree empty now? " + tree.isEmpty());
		
		System.out.println("\n");
		System.out.println("My new Tree:");
		tree.PrintPostOrder(tree.root);
	}
}
