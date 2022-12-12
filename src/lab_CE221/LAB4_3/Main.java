package lab_CE221.LAB4_3;

import lab_CE221.LAB4_3.Heap;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] arrayA = {25, 35, 10, 15, 150, 64, 48, 105, 149, 148, 130, 22, 67, 56, 43};

        // Instantiate a heap
        Heap heap1 = new Heap();

        //Second heap to compare and test
        Heap heap2 = new Heap();
        heap2.insert(25);
        heap2.insert(35);
        heap2.insert(10);
        heap2.insert(15);
        heap2.insert(150);
        heap2.insert(64);
        heap2.insert(48);
        heap2.insert(105);
        heap2.insert(149);
        heap2.insert(148);
        heap2.insert(130);
        heap2.insert(22);
        heap2.insert(67);
        heap2.insert(56);
        heap2.insert(43);

        // Build the heap from given array arrayA[] with buildHeap() method and print it
        heap1.buildHeap(arrayA);

        // Print the heap that you have created
        System.out.println("after building method on heap1:");
        heap1.printHeap();

        System.out.println("after insertion heap2 with insert method: ");
        heap2.printHeap();

        // Get min value of the heap
        System.out.print("min value of the heap1:  ");
        System.out.println(heap1.getMinValue());

        // Get height of the heap
        System.out.print("height of the heap1: ");
        System.out.println(heap1.getHeight());

        // Insert the numbers of arrayA one by one to test whether the insert() method works or not
        // insert(25);
        heap1.insert(25);
        // insert(35);
        heap1.insert(35);
        // insert(10);
        heap1.insert(10);
        heap1.insert(5);


        // Print the newly constructed heap again
        System.out.println("after the insertion: ");
        heap1.printHeap();
        System.out.print("height of the heap1: ");
        System.out.println(heap1.getHeight());

        // Search a number for if the heap includes it or not

        // search(52); -> RETURNS FALSE
        System.out.print("is 52 in heap1?  ");
        System.out.println(heap1.search(52));
        // search(105); -> RETURNS TRUE
        System.out.print("is 105 in heap1?  ");
        System.out.println(heap1.search(105));
    }
}