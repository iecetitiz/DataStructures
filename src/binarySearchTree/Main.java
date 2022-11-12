package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        //tree.createBinaryTree();
        //tree.inOrder(tree.getRoot());
        //System.out.println();
        //tree.postOrder(tree.getRoot());

        //tree.root = new Node(10);
        //tree.root.right = new Node(12);
        //tree.root.left = new Node(3);
        Node first= new Node(25);
        Node second= new Node(15);
        Node third= new Node(50);
        Node fourth = new Node(10);
        Node fifth= new Node(22);
        Node sixth = new Node(35);
        Node seventh = new Node(70);
        Node eight = new Node(4);
        Node nine = new Node(12);
        Node ten = new Node(18);
        Node eleven = new Node(24);
        Node twelve = new Node(31);
        Node thirteen  = new Node(44);
        Node fourteen  = new Node(66);
        Node fifteen = new Node(90);

        BinaryTree tree = new BinaryTree(first.data);
        tree.root.right = third;
        tree.root.left = second;
        third.right = seventh;
        third.left = sixth;
        second.left = fourth;
        second.right = fifth;
        fourth.right = nine;
        fourth.left = eight;
        fifth.left = ten;
        fifth.right = eleven;
        sixth.left = twelve;
        sixth.right = thirteen;
        seventh.left = fourteen;
        seventh.right = fifteen;

        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("max value: " + tree.findMax(tree.root));
        System.out.println();
        System.out.println("min value: " + tree.findMin(tree.root));

        System.out.println("---------------------------------------");

        BinaryTree tree2 = new BinaryTree(11);
        //tree2.insert(tree2.root,11);
        tree2.insert(tree2.root,6);
        tree2.insert(tree2.root,8);
        tree2.insert(tree2.root,19);
        tree2.insert(tree2.root,4);
        tree2.insert(tree2.root,10);
        tree2.insert(tree2.root,5);
        tree2.insert(tree2.root,17);
        tree2.insert(tree2.root,43);
        tree2.insert(tree2.root,49);
        tree2.insert(tree2.root,31);
        tree2.insert(tree2.root, 100);

        tree2.inOrder(tree2.root);
        System.out.println("depth: " + tree2.maxDepth(tree2.root));
    }
}
