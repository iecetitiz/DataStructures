package binarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
       setRoot(null);
    }

    public BinarySearchTree(int data) {
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

    public void moveInOrder(Node root) {
        if(root == null) {
            return;
        }
        moveInOrder(root.left);
        System.out.print(root.data + " ");
        moveInOrder(root.right);
    }

    //only calls moveInOrder without parameters
    void inOrder() {
        moveInOrder(root);
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

    //public Node insert(Node root, int value) {
    //    if(root == null) {
     //       root = new Node(value);
     //       return root;
      //  }

      //  if(value < root.data) {
      //      root.left = insert(root.left, value);
      //  } else {
        //    root.right = insert(root.right, value);
      //  }
      //  return root;
   // }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }

    void deleteKey(int key) {
        root = deleteNode(root, key);
    }

    public Node deleteNode(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);


        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public int minValue(Node root)
    {
        int minValue = root.data;
        while (root.left != null)
        {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void insertValue(int key) {
        root = insert(root, key);
    }

    public Node insert(Node root, int key)
    {
        // is empty?
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }
}
