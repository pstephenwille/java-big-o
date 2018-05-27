package main.java;

public class BinarySearchTree {

    public boolean isBST(Node node, int min, int max) {

        if (node == null) {
            return true;
        }

        if (node.data <  min || node.data > max) {
            return false;
        }

        return isBST(node.left, node.data, node.data - 1) && isBST(node.right, node.data + 1, node.data);
    }


    class Node {

        int data;
        Node left;
        Node right;
    }
}
