package com.binaryTree;

public class BTNode {

	// Initialize in node in constructor
	BTNode( int value ) {
	    this.value = value;
	    left = right = null;
	}
	 
	// The data in the node
	public int value;
	// pointer to the left node of the tree 
	public BTNode left;
	// pointer to the right node of the tree
	public BTNode right;
	
}

