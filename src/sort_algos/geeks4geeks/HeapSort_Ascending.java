package sort_algos.geeks4geeks;

public class HeapSort_Ascending {
    public void sort(int array[])
    {
        int N = array.length;

        // Build heap (this is the first phase of heap sort)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(array, N, i);

        // One by one take an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    //A recursive function to build a max heap after every deletion
    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1;
        int rigthChild = 2 * i + 2;

        // If left child is greater than root
        if (leftChild < N && arr[leftChild] > arr[largest])
            largest = leftChild;

        // If right child is greater than the largest
        if (rigthChild < N && arr[rigthChild] > arr[largest])
            largest = rigthChild;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }


    static void printArray(int array[])
    {
        int N = array.length;

        for (int i = 0; i < N; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }


    public static void main(String args[])
    {
        int array[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("before heap sort: ");

        for(int x: array) {
            System.out.print(x + " ");
        }

        HeapSort_Ascending heapSort = new HeapSort_Ascending();
        heapSort.sort(array);
        System.out.println("\nafter heap sort: ");
        printArray(array);
    }
}
