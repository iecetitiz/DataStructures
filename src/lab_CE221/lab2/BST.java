package lab_CE221.lab2;

public class BST {
    /**
     * Fields
     **/
    private BinaryNode root;

    /**
     * Constructors
     **/
    public BST() {
        setRoot(null);
    }

    /**
     * Getters and Setters
     **/
    public BinaryNode getRoot() {
        return root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    // TODO: Find that if a binary tree is BST or not
    public boolean isBST(BinaryNode Node) {
        if (Node == null) {
            return true;
        }

        if (Node.left != null && maxValue(Node.left) > Node.element) {
            return false;
        }

        if (Node.right != null && minValue(Node.right) < Node.element) {
            return false;
        }

        if (isBST(Node.left) != true || isBST(Node.right) != true) {
            return false;
        }
        //passing all that, it's a BST
        return true;
    }

    int maxValue(BinaryNode Node) {
        if (Node == null) {
            return Integer.MIN_VALUE;
        }

        int value = Node.element;
        int leftMax = maxValue(Node.left);
        int rightMax = maxValue(Node.right);
        return Math.max(value, Math.max(leftMax, rightMax));
    }

    int minValue(BinaryNode Node) {

        if (Node == null) {
            return Integer.MAX_VALUE;
        }

        int value = Node.element;
        int leftMax = minValue(Node.left);
        int rightMax = minValue(Node.right);
        return Math.min(value, Math.min(leftMax, rightMax));
    }

    // TODO: Insert an element to the BST
    public void insert(int key) {
        root = insertValue(root, key);
    }

    public BinaryNode insertValue(BinaryNode root, int key) {
        // is empty?
        if (root == null) {
            root = new BinaryNode(key);
            return root;
        }

        if (key < root.element) {
            root.left = insertValue(root.left, key);
        } else if (key > root.element) {
            root.right = insertValue(root.right, key);
        }
        return root;
    }

    // TODO: Traverse the BST preorder and print it
    public void printTreePreorder(BinaryNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.element + " ");
        printTreePreorder(root.left);
        printTreePreorder(root.right);
    }
}
