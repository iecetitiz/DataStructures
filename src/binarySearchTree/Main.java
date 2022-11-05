package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();

        tree.inOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());
    }
}
