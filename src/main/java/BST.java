package main.java;

public class BST {

    Node node;

    public BST(int num) {
        node = new Node(num);
    }

    public Node getNode() {
        return this.node;
    }

    public boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return isBST(node.left, min, node.data)
               &&
               isBST(node.right, node.data, max);
    }

    class Node {

        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean contains(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
        }


        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println((char) 27 + "[30;43m" + data + (char) 27 + "[0m");

            if (right != null) {
                right.printInOrder();
            }
        }

    }
}
