package lab_CE221.lab4_2;

public class Heap {
    private int currentSize;
    private int[] heapArray;

    // Constructors
    public Heap() {
        setCurrentSize(0);
        heapArray = new int[1];
    }

    public Heap(int capacity) {
        setCurrentSize(0);
        heapArray = new int[capacity + 1];
    }

    // Heap Operations
    public int[] buildHeap(int[] array) {
        // Builds the heap from an array that you have provided
        currentSize = array.length;
        heapArray = new int[(currentSize + 1)];

        for (int i = 0; i < array.length; i++) {
            heapArray[i + 1] = array[i];
        }

        for (int i = currentSize / 2; i > 0; i--) {
            percolateDown(i);
        }

        return heapArray;
    }

    private void percolateDown(int hole) {
        // Organizes the elements of the heap and percolate down the elements for not violating heap properties
        int child;
        int tmp = heapArray[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;

            if (child != currentSize && Integer.compare(heapArray[child + 1], heapArray[child]) < 0) {
                child++;
            }

            if (Integer.compare(heapArray[child], tmp) < 0) {
                heapArray[hole] = heapArray[child];
            } else {
                break;
            }
        }

        heapArray[hole] = tmp;
    }

    public int getMinValue() throws Exception {
        if (isEmpty()) {
            throw new EmptyArrayException("heap is empty!");
        }
        return heapArray[1];
    }

    public int getHeight() {
        return (int)Math.ceil(Math.log(currentSize + 1) / Math.log(2)) - 1;
    }

    public void insert(int value) {

        if (currentSize == heapArray.length - 1) {
            enlargeArray(heapArray.length * 2 + 1);
        }

        //percolate up
        int hole = ++currentSize;
        percolateUp(value, hole);
    }

    private void percolateUp(int value, int hole) {
        for (heapArray[0] = value; Integer.compare(value, heapArray[hole / 2]) < 0; hole /= 2) {
            heapArray[hole] = heapArray[hole / 2];
        }
        heapArray[hole] = value;
    }

    public boolean search(int value) throws Exception{
        if (isEmpty()) {
            throw new EmptyArrayException("heap is empty!");
        }
        boolean flag = false;
        for (int i = 1; i <= currentSize; i++) {
            if (value == heapArray[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // Helper Methods
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void makeEmpty() {
        currentSize = 0;
    }

    private void enlargeArray(int newSize) {
        // Enlarges array to the new size
        int[] old = heapArray;
        heapArray = new int[newSize];

        for (int i = 1; i < old.length; i++)
            heapArray[i] = old[i];
    }

    public void printHeap() {
        // Prints the heap elements one by one
        int level = 0;

        for (int i = 1; i < heapArray.length; i++) {
            System.out.print(heapArray[i] + " ");

            if ((i + 1) % Math.pow(2, level) == 0) {
                System.out.println();
                level++;
            }
        }

        System.out.println("\n---------------------------");
    }

    // Getters and Setters
    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int[] getHeapArray() {
        return heapArray;
    }

    public void setHeapArray(int[] heapArray) {
        this.heapArray = heapArray;
    }

}

