package com.binaryTree;


public class BTFlipTree {

	// root of the tree
	private static BTNode root;

	/**
	 * 
	 * @param x
	 *            element to be inserted
	 * @param t
	 *            parent node to which child should be attached
	 * @return newly created node
	 */
	protected BTNode insert(Integer x, BTNode t) {
		if (t == null)
			t = new BTNode(x);
		else if (x < t.value)
			t.left = insert(x, t.left);
		else if (x > t.value)
			t.right = insert(x, t.right);
		else
			throw new RuntimeException(x.toString()); // Duplicate
		return t;
	}

	protected static void traverseOddNodes(BTNode root, int index) {
		if (root == null) {
			return;
		}
		if (index % 2 == 1) {
			BTNode origLeft = root.left;
			BTNode origRight = root.right;
			
			BTNode origLeftLeft = null;
			BTNode origLeftRight = null;
			if (root.left != null){
				origLeftLeft = root.left.left;
				origLeftRight = root.left.right;
			}

			BTNode origRightLeft = null;
			BTNode origRightRight = null;
			if (root.right != null){
				origRightLeft = root.right.left;
				origRightRight = root.right.right;
			}
	
			root.left = origRight;
			root.right = origLeft;
			if (root.left != null){
				root.left.left = origLeftLeft;
				root.left.right = origLeftRight;
			}
			if (root.right != null){
				root.right.left = origRightLeft;
				root.right.right = origRightRight;
			}
			
			index++;
			traverseOddNodes(root.right, index);
			traverseOddNodes(root.left, index);

		} else {
			index++;
			traverseOddNodes(root.right, index);
			traverseOddNodes(root.left, index);
		}
	}
//	
//	protected static void traverseOddNodes1(BTNode root, int index) {
//		if (root == null) {
//			return;
//		}
//		if (index % 2 == 1) {
//			BTNode newLeft = root.right == null ? null : new BTNode(
//					root.right.value);// origRight;
//			BTNode newRight = root.left == null ? null : new BTNode(
//					root.left.value);// origLeft;
//			if (root.left != null && newLeft != null) {
//				newLeft.left = root.left.left;
//				newLeft.right = root.left.right;
//			}
//			if (root.right != null && newRight != null) {
//				newRight.left = root.right.left;
//				newRight.right = root.right.right;
//			}
//			root.left = newLeft;
//			root.right = newRight;
//			index++;
//			traverseOddNodes(root.right, index);
//			traverseOddNodes(root.left, index);
//		} else {
//			index++;
//			traverseOddNodes(root.right, index);
//			traverseOddNodes(root.left, index);
//		}
//	}

	/** * Helper method to recursively print the contents in a Preorder way */
	private static void printPreOrderRec(BTNode currRoot) {
		if (currRoot == null) {
			return;
		}

		System.out.print(currRoot.value + ", ");
		printPreOrderRec(currRoot.left);
		printPreOrderRec(currRoot.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BTFlipTree t = new BTFlipTree();

		// construct binary tree
		int[] arr = { 20, 15, 25, 12, 18, 22, 28, 13, 37, 26, 16, 19, 21 };
		for (int i = 0; i < arr.length; i++) {
			root = t.insert(arr[i], root);
		}

		printPreOrderRec(root);
//		traverseOddNodes1(root, 1);
//		System.out.println("\n");
//		printPreOrderRec(root);
//		traverseOddNodes1(root, 1);
//		System.out.println("\n");
//		printPreOrderRec(root);
		
		traverseOddNodes(root, 1);
		System.out.println("\n");
		printPreOrderRec(root);
		
		traverseOddNodes(root, 1);
		System.out.println("\n");
		printPreOrderRec(root);

	}

}
