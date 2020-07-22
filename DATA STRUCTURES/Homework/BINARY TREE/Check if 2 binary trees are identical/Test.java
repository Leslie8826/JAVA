import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TREE 1
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(6);
		tree.root.right = new TreeNode(3);
		tree.root.right.left = new TreeNode(30);
		tree.root.right.right = new TreeNode(25);
		
		ArrayList<Integer> l_tree1 = tree.PrintInOrder(tree.root);
		
		System.out.println("Tree1 InOrder Traversal:");
		for(int i=0; i<l_tree1.size(); i++) {
			System.out.print(l_tree1.get(i) + " ");
		}
		
		
		// TREE 2
        BinaryTree tree2 = new BinaryTree();
		
		tree2.root = new TreeNode(1);
		tree2.root.left = new TreeNode(6);
		tree2.root.right = new TreeNode(3);
		tree2.root.right.left = new TreeNode(30);
		tree2.root.right.right = new TreeNode(25);
		
		ArrayList<Integer> l_tree2 = tree2.PrintInOrder(tree2.root);
		
		System.out.println("\n");
		System.out.println("Tree2 InOrder Traversal:");
		for(int i=0; i<l_tree2.size(); i++) {
			System.out.print(l_tree2.get(i) + " ");
		}
		
		
		int count=0;
		// Comparison of the 2 array lists
		if(l_tree1.size() != l_tree2.size()) {
			System.out.println("\n\n Tree1 and Tree2 ARE NOT identical");
		} else if(l_tree1.size() == l_tree2.size()){
			for(int i=0; i<l_tree1.size(); i++) {
				if(l_tree1.get(i) == l_tree2.get(i))
					count++;
			}
			if(count == l_tree1.size() && count == l_tree2.size())
				System.out.println("\n\n  Tree1 and Tree2 ARE identical");
				
		}
	}

}
