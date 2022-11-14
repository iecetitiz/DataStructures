package lab_CE221.lab2;

public class Main {

	public static void main(String[] args) 
	{
		// TODO: Construct the BST by adding 'BinaryNode's one by one
		/**
		 *  REMEMBER THAT, you need to check if one value is bigger/smaller than another value
		 *  when using this approach. 
		 */

		//(3, 7, 5, 8, 2, 6, 4)
		BST tree = new BST();
		BinaryNode root = new BinaryNode(3);
		tree.setRoot(root);
		root.left = new BinaryNode(2);
		root.right = new BinaryNode(7);
		root.right.left = new BinaryNode(5);
		root.right.right = new BinaryNode(8);
		root.right.left.left = new BinaryNode(4);
		root.right.left.right = new BinaryNode(6);

		/**
		 *  For example:
		 *  BST bst = new BST();
		 *
		 *	BinaryNode root = new BinaryNode(3);
		 *  root.right = new BinaryNode(7);
		 *  root.right.left = new BinaryNode(5);
		 *  root.left.left = ...
		 *  ...
		 *  .
		 *  .
		 *  .
		 **/
		
		// TODO: Use 'isBst()' method that you implemented to check if your tree is BST or not
		System.out.print("is first BST that created manually BST?: " );

		if (tree.isBST(tree.getRoot()) == true) {
			System.out.println("Yes Is BST");
		}
		else {
			System.out.println("Not a BST");
		}

		// TODO: Instantiate a new BST and add the same elements by using 'insert(value)' method that you implemented

		/**
		*	BST newBST = new BST();
		*	newBST.insert(5);
		*	...
		*	.
		*	.
		*	.
		*
		**/
		BST newBST = new BST();
		newBST.insert(3);
		newBST.insert(7);
		newBST.insert(5);
		newBST.insert(8);
		newBST.insert(2);
		newBST.insert(6);
		newBST.insert(4);


		// TODO: Use 'isBst()' method again to check if your new tree is BST or not
		System.out.print("is second BST that created with insert method BST?: " );
		if (newBST.isBST(newBST.getRoot()) == true) {
			System.out.println("Yes Is BST");
		}
		else {
			System.out.println("Not a BST");
		}
		System.out.println("------------------");
		// TODO: Use printTreePreorder() method to print your BST
		System.out.println("first binary search tree in preorder traverse:");
		tree.printTreePreorder(tree.getRoot());

		System.out.println("\n----------------");

		System.out.println("second binary search tree in preorder traverse:");
		newBST.printTreePreorder(newBST.getRoot());

		System.out.println("\n----------------");

		//another tree that is not a binary search tree to check whether isBST() method works or not
		BST notBST = new BST();
		BinaryNode notBSTroot = new BinaryNode(3);
		notBST.setRoot(notBSTroot);
		notBSTroot.left = new BinaryNode(20);
		notBSTroot.right = new BinaryNode(7);
		notBSTroot.right.left = new BinaryNode(5);
		notBSTroot.right.right = new BinaryNode(8);
		notBSTroot.right.left.left = new BinaryNode(4);
		notBSTroot.right.left.right = new BinaryNode(6);

		//print bst or not
		System.out.print("is third binary tree BST?: " );
		if (notBST.isBST(notBST.getRoot()) == true) {
			System.out.println("Yes Is BST");
		}
		else {
			System.out.println("Not a BST");
		}
	}

}
