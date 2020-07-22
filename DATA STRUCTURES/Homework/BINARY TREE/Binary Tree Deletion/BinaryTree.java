public class BinaryTree {
	TreeNode root;
	
	BinaryTree(){
		this.root = null;
	}
	
	public void PrintPostOrder(TreeNode node) {
		if(node == null)
			return;
		
		PrintPostOrder(node.left);
		PrintPostOrder(node.right);
		System.out.print(node.data + " ");
	}
	
  
	// Part 1 of deletion: deletes left and right subtree of root
  // there is still the root left in tree after operation
	public void deleteTree1() {
		if(root == null)
			return;
		
		// Delete left subtree of root
		root.left=null;
	
		// Delete right subtree of root
		root.right=null;
	}
	
	
	// Part 2 of deletion: deletes last node in tree (deletes root)
	public void deleteTree2() {
		deleteTree1();
		root=null;	
	}
	
	
  // Checks if tree is empty
	public boolean isEmpty() {
		if(root==null)
			return true;
		else
			return false;	
	}
}
