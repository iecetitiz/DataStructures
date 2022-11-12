package binarySearchTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new Node(data);
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

    public Node getRoot() {
        return root;
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
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public int findMax(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result) {
            result = left;
        }
        if(right > result) {
            result = right;
        }
        return result;
    }

    public int findMin(Node root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int result = root.data;
        int left = findMin(root.left);
        int right = findMin(root.right);
        if(left < result) {
            result = left;
        }
        if(right < result) {
            result = right;
        }
        return result;
    }
}
