/**
 * 
 * This class represents the binary tree and its methods
 *
 **/

public class BinaryTree {
	TreeNode root;
	
	BinaryTree(){
		this.root = null;
	}
	
	
	// DISPLAYS NODES WITH INORDER TRAVERSAL
	public void PrintInOrder(TreeNode node) {
		if(node == null)
			return;
		
		PrintInOrder(node.left);
		System.out.print(node.data + " ");
		PrintInOrder(node.right);
	}
	
	
	// DISPLAYS NODES WITH PREORDER TRAVERSAL
	public void PrintPreOrder(TreeNode node) {
		if(node == null)
			return;
		
		System.out.print(node.data + " ");
		PrintPreOrder(node.left);
		PrintPreOrder(node.right);
	}
	
	
	// DISPLAYS NODES WITH POSTORDER TRAVERSAL
	public void PrintPostOrder(TreeNode node) {
		if(node == null)
			return;
		
		PrintPostOrder(node.left);
		PrintPostOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	// DETERMINES IF A NODE IS A LEAF OR NOT
	public boolean isLeaf(TreeNode node) {
		if(node.left == null && node.right == null)
			return true;
		else
			return false;
	}
	
	// RETURNS THE HEIGHT OF NODE
	public int getHeight(TreeNode node) {
		if(node == null || isLeaf(node) == true)
			return 0;
		else
			return (Math.max(getHeight(node.left), getHeight(node.right)) + 1);
	}	
	
}
