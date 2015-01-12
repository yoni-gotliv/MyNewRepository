package com.binaryTree;
public class BTDepth {
    
    // root of the tree
    private static BinaryNode root;
    int currentDepth, depth;
     
    /**
     * 
     * @param x element to be inserted
     * @param t parent node to which child should be attached
     * @return newly created node
     */
    protected BinaryNode insert(Comparable x, BinaryNode t) {
        if (t == null)
            t = new BinaryNode(x);
        else if (x.compareTo(t.element) < 0)
            t.left = insert(x, t.left);
        else if (x.compareTo( t.element) > 0)
            t.right = insert(x, t.right);
        else
            throw new RuntimeException(x.toString()); // Duplicate
        return t;
    }
     
    /**
     * Calculates depth of the binary tree using 
     * instance variables
     *  
     * @param n 
     * @return depth of the binary tree
     */
    public int depth(BinaryNode n) {
        if (n != null) {
            currentDepth++;
 
            if (currentDepth > depth) {
                depth = currentDepth;
            }
 
            depth(n.left);
            depth(n.right);
 
            currentDepth--;
        }
        return depth;
    }
     
    /**
     * Calculates depth of the binary tree without using 
     * any instance variables in bottom-up approach
     *  
     * @param n 
     * @return depth of the binary tree
     */
    public int depth2(BinaryNode node){
        if(node == null)
            return 0;
        int left = depth2(node.left);
        int right = depth2(node.right);
         
        int x = left > right ? left+1 : right+1;
        return x;
    }
     
    /**
     * Calculates depth of the binary tree without using 
     * any instance variables in top-bottom approach
     *  
     * @param n 
     * @return depth of the binary tree
     */
    public int depth3(BinaryNode node, int d){
        int leftDepth = d, rightDepth = d;
         
        if(node.left != null){
            leftDepth = depth3(node.left, d+1);
        }
        if(node.right != null){
            rightDepth = depth3(node.right, d+1);
        }
         
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
    
    /**
     * Calculates depth of the binary tree without using 
     * any instance variables in bottom-up approach
     *  
     * @param n 
     * @return depth of the binary tree
     */
    public int depth4(BinaryNode node){
        if(node == null)
            return 0;
        int left = depth4(node.left);
        int right = depth4(node.right);
//        return Math.max(left,right )+ 1;
//         
        int x = left > right ? left+1 : right+1;
        return x;
//        return Math.max(depth4(node.left),depth4(node.right)) + 1;
    }
    
    public int totalDepth(BinaryNode node){
        if(node == null)
            return 0;
        int left = totalDepth(node.left);
        int right = totalDepth(node.right);
//        return Math.max(left,right )+ 1;
//         
        return left+right+1;
//        return x;
//        return Math.max(depth4(node.left),depth4(node.right)) + 1;
    }
     
    /**
     * @param args
     */
    public static void main(String[] args) {
        BTDepth t = new BTDepth();
 
        // construct binary tree
        int[] arr = { 20, 15, 25, 12, 18, 22, 28 };
        for (int i = 0; i < arr.length; i++) {
            root = t.insert(arr[i], root);
        }
 
        long start1 = System.nanoTime();
        int res1 = t.depth(root);
        long end1 = System.nanoTime();
        long total1 = end1-start1;
        
        long start2 = System.nanoTime();
        int res2 = t.depth2(root);
        long end2 = System.nanoTime();
        long total2 = end2-start2;
        
        long start3 = System.nanoTime();
        int res3 = t.depth3(root,1);
        long end3 = System.nanoTime();
        long total3 = end3-start3;
        
        long start4 = System.nanoTime();
        int res4 = t.depth4(root);
        long end4 = System.nanoTime();
        long total4 = end4-start4;
        
        long start5 = System.nanoTime();
        int res5 = t.totalDepth(root);
        long end5 = System.nanoTime();
        long total5 = end5-start5;
        
        System.out.println("Maximum depth of the Binary Tree using depth 1: " + res1 + ", total time = " + total1);
        
        System.out.println("Maximum depth of the Binary Tree using depth 2: " + res2 + ", total time = " + total2);
        
        System.out.println("Maximum depth of the Binary Tree using depth 3: " + res3 + ", total time = " + total3);
        
        System.out.println("Maximum depth of the Binary Tree using depth 4: " + res4 + ", total time = " + total4);
        
        System.out.println("Total depth of the Binary Tree using totalDepth: " + res5 + ", total time = " + total5);
        
//        System.out.println("Maximum depth of the Binary Tree is using instance variables: " + res);
//         
//        System.out.println("Maximum depth of the Binary Tree is without " +
//                "using instance variables in bottom-up approach: " + t.depth2(root));
//         
//        System.out.println("Maximum depth of the Binary Tree is without using " +
//                "instance variables in top-bottom approach: " + t.depth3(root, 1));
    }
 
}