# This program checks if two binary trees are identical or not in terms of size and content.
-- The program functions with 3 classes:
        - a TreeNode class that represents the node of the binary tree
        - a BinaryTree class that represents the binary tree and its corresponding methods
        - a main class to create the tree and compare 2 binary trees

-- Thanks to the BinaryTree class, we create a method PrintInOrder that takes a node as parameter and returns an ArrayList. This methods stores the data of each node of a binary in the order given by the inorder traversal (left, root, right).

-- Then, in the main class, once 2 binary trees are created, we apply the PrintInOrder method on each tree.

-- Finally, we compare the size of eaxch tree. If the tree are not of same sizes, the trees are not identical. If the tree have the same sizes, we loop through the 2 ArrayLists and compare each element at the sme index. If the 2 ArrayList contain the same nodes, then the trees are identical.
