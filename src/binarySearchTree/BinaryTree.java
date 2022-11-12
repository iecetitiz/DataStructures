package binarySearchTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
       setRoot(null);
    }

    public BinaryTree(int data) {
        root = new Node(data);
    }

    /** Getters and Setters **/
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
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

    public Node insert(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }

        if(value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }
}
