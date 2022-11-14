package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertValue(50);
        tree.insertValue(30);
        tree.insertValue(20);
        tree.insertValue(40);
        tree.insertValue(70);
        tree.insertValue(60);
        tree.insertValue(80);
        //tree.insert(30);
        //tree.insert(tree.root, 20);
      // tree.insert(tree.root, 40);
       // tree.insert(tree.root, 70);
      //  tree.insert(tree.root, 60);
       // tree.insert(tree.root, 80);

        System.out.println("Inorder traversal: ");
        tree.inOrder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal:");
        tree.inOrder();
        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal :");
        tree.inOrder();
        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal: ");
        tree.inOrder();
    }
}
