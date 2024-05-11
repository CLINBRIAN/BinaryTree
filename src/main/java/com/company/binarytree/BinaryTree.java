/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.binarytree;

/**
 *
 * @author kamau
 */
//works the same with singular linked list
public class BinaryTree {

    public static class TreeNode {
        char data;
        TreeNode left;
        TreeNode Right;

        public TreeNode(char data) {
            this.data = data;
            this.left = null;
            this.Right = null;
        }
    }
     //defining a method to return a tree
        public static TreeNode createNewNode(char data) {
            return new TreeNode(data);
        }

    public static void main(String[] args) {
        TreeNode root = createNewNode('R');
        TreeNode nodeA = createNewNode('A');
        TreeNode nodeB = createNewNode('B');
        TreeNode nodeC = createNewNode('C');
        TreeNode nodeD = createNewNode('D');
        TreeNode nodeE = createNewNode('E');
        TreeNode nodeF = createNewNode('F');
        TreeNode nodeG = createNewNode('G');
        
        root.left = nodeA;
        root.Right = nodeB;
        
        nodeA.left = nodeC;
        nodeA.Right = nodeD;
        
        nodeB.left = nodeE;
        nodeB.Right = nodeF;
        
        nodeF.left= nodeG;
        
        System.out.println("root.right.right.left.data is "+root.Right.Right.left.data);

    }
}
