package com.falmeida.tech.trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int value){
        this.value = value;
        left = right = null;
    }
}

public class BinaryTreeSamples {

    TreeNode root = null;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public BinaryTreeSamples createBinaryTree(){
        BinaryTreeSamples bt = new BinaryTreeSamples();
        bt = bt.createBinaryTree();
        return bt;
    }

    //Breadth-First Search
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            TreeNode node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(TreeNode current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public static void main(String[] args) {
        BinaryTreeSamples bt = new BinaryTreeSamples();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.traverseLevelOrder();
    }

}
