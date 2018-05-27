package main.java;

public class StringBST {

    Node node;

    public StringBST(String word) {
        node = new Node(word);
    }

    public Node getNode() {
        return this.node;
    }

    public boolean isBST(Node node, String min, String max) {
        if (node == null) {
            return true;
        }

        if (node.value.compareTo(min) <= 0 || node.value.compareTo(max) >= 0) {
            return false;
        }

        return isBST(node.left, min, node.value)
               &&
               isBST(node.right, node.value, max);
    }

    class Node {

        Node left, right;
        String value;

        public Node(String value) {
            this.value = value;
        }

        public void insert(String word) {

            if (node.value.compareTo(word) <= 0 || node.value.compareTo(word) >= 0) {
                if (left == null) {
                    left = new Node(word);
                } else {
                    left.insert(word);
                }
            } else {
                if (right == null) {
                    right = new Node(word);
                } else {
                    right.insert(word);
                }
            }
        }

        public boolean contains(String word) {
            if (word.compareTo(this.value) == 0) {
                return true;
            } else if (word.compareTo(this.value) < 0) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(word);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(word);
                }
            }
        }


        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println((char) 27 + "[30;43m" + value + (char) 27 + "[0m");

            if (right != null) {
                right.printInOrder();
            }
        }

    }
}
