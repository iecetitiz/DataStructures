package heap;
import java.nio.BufferUnderflowException;

public class BinaryMinHeap<AnyType extends Comparable<? super AnyType>> {

    private int currentSize; //number of elements in heap
    private AnyType[] array; //heap array
    private static final int DEFAULT_CAPACITY = 10;
    public BinaryMinHeap() {
        this(DEFAULT_CAPACITY);
    }
    public BinaryMinHeap(int capacity) {
        currentSize = 0;
        array = (AnyType[]) new Comparable[capacity + 1];
    }

    public BinaryMinHeap(AnyType[] items) {
        currentSize = items.length;
        array =  (AnyType[]) new Comparable[( currentSize + 2 ) * 11 / 10 ];

        int i = 1;
        for (AnyType item : items)
            array[i++] = item;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = currentSize / 2; i > 0; i--) {
            percolateDown(i);
        }
    }

    public void insert(AnyType x) {
        if (currentSize == array.length - 1) {
            enlargeArray(array.length * 2 + 1);
        }

        //percolate up
        int hole = ++currentSize;
        percolateUp(x, hole);

        //without percolateUp function
        //for (array[0] = x; x.compareTo(array[hole / 2]) < 0; hole /= 2) {
          //  array[hole] = array[hole / 2];
       // }
       // array[hole] = x;
    }

    private void percolateUp(AnyType value, int hole) {
        for (array[0] = value; value.compareTo(array[hole / 2]) < 0; hole /= 2) {
            array[hole] = array[hole / 2];
        }
        array[hole] = value;
    }

    private void percolateDown(int hole) {
        int child;
        AnyType tmp = array[hole];
        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && array[child + 1].compareTo(array[child]) < 0) {
                child++;
            }
            if (array[child].compareTo(tmp) < 0) {
                array[hole] = array[child];
            } else {
                break;
            }
        }
        array[hole] = tmp;
    }

    public AnyType findMin() throws Exception {
        if (isEmpty()) {
            throw new UnderflowException("heap is empty!");
        }
        return array[1];
    }

    public AnyType deleteMin() throws Exception {
        if (isEmpty()) {
            throw new UnderflowException("heap is empty");
        }

        AnyType minItem = findMin();
        array[1] = array[currentSize--];
        percolateDown(1);
        return minItem;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void makeEmpty() {
        currentSize = 0;
    }

    private void enlargeArray(int newSize) {
        AnyType[] old = array;
        array = (AnyType[]) new Comparable[newSize];
        for (int i = 0; i < old.length; i++) {
            array[i] = old[i];
        }
    }

    public void printHeap() {
        for(int i = 1; i <= currentSize; i++) {
            System.out.print(array[i] + "-");
        }
    }
}
