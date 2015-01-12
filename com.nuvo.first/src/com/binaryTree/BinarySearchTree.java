package com.binaryTree;

public class BinarySearchTree {
    BSTNode root = null;

    public boolean add(int value) {
          if (root == null) {
                root = new BSTNode(value);
                return true;
          } else
                return root.add(value);
    }
}
