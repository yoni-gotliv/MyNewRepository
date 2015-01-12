package com.binaryTree;

class BinaryNode {
    // Initialize in node in constructor
    BinaryNode( Comparable<Integer> e ) {
        element = e;
        left = right = null;
    }
     
    // The data in the node
    Comparable<Integer> element;
    // pointer to the left node of the tree 
    BinaryNode left;
    // pointer to the right node of the tree
    BinaryNode right;
 
}
