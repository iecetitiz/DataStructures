package binarySearchTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {

    }

    public void createBinaryTree() {
        Node first = new Node(9);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;

    }

    public void preOrder(Node root) { //recursive
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
    }
}
