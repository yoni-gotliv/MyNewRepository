package com.binaryTree;

public class BSTNode {
    private int value;
    private BSTNode left;
    private BSTNode right;

    
    public BSTNode(int value) {
		super();
		this.value = value;
	}


	public boolean add(int value) {
          if (value == this.value)
                return false;
          else if (value <this.value) {
                if (left == null) {
                      left = new BSTNode(value);
                      return true;
                } else
                      return left.add(value);
          } else if (value > this.value) {
                if (right == null) {
                      right = new BSTNode(value);
                      return true;
                } else
                      return right.add(value);
          }
          return false;
    }
}