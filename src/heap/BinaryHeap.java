package heap;

public class BinaryHeap <AnyType extends Comparable<? super AnyType>>{
    public BinaryHeap( )
 { /* See online code */ }
 public BinaryHeap( int capacity )
 { /* See online code */ }
    public BinaryHeap( AnyType [ ] items )
{ /* Figure 6.14 */ }
    public void insert(AnyType x) {

    }

    public AnyType findMin() {

    }

    public AnyType deleteMin() {

    }

    public boolean isEmpty() {

    }

    public void makeEmpty() {

    }

    private static final int DEFAULT_CAPACITY = 10;

    private int currentSize; //number of elements in heap
    private AnyType[] array; //heap array

    private void percolateDown(int hole) {

    }

    private void buildHeap() {

    }

    private void enlargeArray(int newSize) {
        
    }



}
