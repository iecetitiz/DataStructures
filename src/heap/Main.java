package heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap<Integer> heap = new BinaryHeap<>();
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
    }
}
