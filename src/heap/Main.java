package heap;

public class Main {
    public static void main(String[] args) throws Exception{

        //new Heap object instantiation
        BinaryMinHeap<Integer> heap = new BinaryMinHeap<>();


        heap.insert(13);
        heap.insert(21);
        heap.insert(16);
        heap.insert(24);
        heap.insert(31);
        heap.insert(19);
        heap.insert(68);
        heap.insert(65);
        heap.insert(26);
        heap.insert(32);
        heap.insert(5);

        heap.printHeap();

        Integer[] array2 = {150, 80, 40, 30, 10, 70, 110, 100, 20, 90, 60, 50, 120, 140, 130};

        BinaryMinHeap<Integer> heap2 = new BinaryMinHeap<>(array2);
        System.out.println();
        heap2.printHeap();
        System.out.println();
        heap2.deleteMin();
    }
}
