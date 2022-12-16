package sort_algos.insertion_sort;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 13, 5, 6, 12, 3, 7, 28, 1};

        printArray(array);
        insertionSort(array);
        System.out.println();
        printArray(array);
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while( j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;

        }
    }

    private static void printArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
    }
}
