package lab_CE221.lab4_2;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap221 heap = new Heap221();
        int[] arrayA = {110, 6, 3, 9, 67, 14, 35};
        heap.buildHeap(arrayA);
        System.out.println("after building:");
        heap.printHeap();

        System.out.println("min value of the heap: " + heap.getMinValue());
        System.out.println("height of the heap: " + heap.getHeight());

        heap.insert(1);
        System.out.println("after the insertion");
        heap.printHeap();
        System.out.println("height of the heap: " + heap.getHeight());
        System.out.println("is 3 in the heap? " + heap.search(3));

    }
}
