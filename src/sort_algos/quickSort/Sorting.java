package sort_algos.quickSort;

public class Sorting {
    public static void main(String[] args) {
        Integer[] array = {8, 1, 4, 9, 6, 3, 5, 2, 7, 0};

        quicksort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <AnyType extends Comparable<? super AnyType>> void quicksort(AnyType[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static <AnyType extends Comparable<? super AnyType>>
 void quicksort( AnyType [ ] a, int left, int right )
     {
         int CUTOFF = 10;
         if( left + CUTOFF <= right )
             {
             AnyType pivot = median3( a, left, right );

             // Begin partitioning
             int i = left, j = right - 1;
             for( ; ; )
                 {
                 while( a[ ++i ].compareTo( pivot )<0){}
                 while( a[ --j ].compareTo( pivot )>0){}
                 if( i < j )
                     swapReferences( a, i, j );
                 else
                 break;
                 }

             swapReferences( a, i, right - 1 ); // Restore pivot

             quicksort( a, left, i - 1 ); // Sort small elements
             quicksort( a, i + 1, right ); // Sort large elements
             }
         else // Do an insertion sort on the subarray
         insertionSort( a );
         }

    public static <AnyType extends Comparable<? super AnyType>>
    AnyType median3(AnyType[] a, int left, int right) {
        int center = (left + right) / 2;
        if (a[center].compareTo(a[left]) < 0)
            swapReferences(a, left, center);
        if (a[right].compareTo(a[left]) < 0)
            swapReferences(a, left, right);
        if (a[right].compareTo(a[center]) < 0)
            swapReferences(a, center, right);

        // Place pivot at position right - 1
        swapReferences(a, center, right - 1);
        return a[right - 1];
    }

    public static <AnyType> void swapReferences(AnyType[] a, int index1, int index2) {
        AnyType tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }

    public static <AnyType extends Comparable<? super AnyType>>
    void insertionSort(AnyType[] a) {
        int j;

        for (int p = 1; p < a.length; p++) {
            AnyType tmp = a[p];
            for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }
}


