import java.util.ArrayList;

public class BinaryTree {
	TreeNode root;
	
	BinaryTree(){
		this.root = null;
	}
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> PrintInOrder(TreeNode node) {
		if(node == null) {
			return null;
		}
		else {
			PrintInOrder(node.left);
			list.add(node.data);
			PrintInOrder(node.right);
		}
		
		return list;
	}
	
}
