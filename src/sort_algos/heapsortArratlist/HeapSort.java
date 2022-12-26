package sort_algos.heapsortArratlist;

import java.util.*;
import java.lang.*;
import java.io.*;

class HeapSort {
    private int size;

    private void heapify(ArrayList<Integer> arr, int i) {
        int next = i;
        if (2 * i + 1 < size && arr.get(2 * i + 1) > arr.get(next)) next = 2 * i + 1;
        if (2 * i + 2 < size && arr.get(2 * i + 2) > arr.get(next)) next = 2 * i + 2;

        if (next == i) return;
        Collections.swap(arr, i, next);
        heapify(arr, next);
    }

    public void sort(ArrayList<Integer> arr) {
        size = arr.size();
        for (int i = size - 1; i >= 0; i--) {
            heapify(arr, i);
        }

        while (size > 0) {
            Collections.swap(arr, 0, size - 1);
            size--;
            heapify(arr, 0);
        }
    }
}

class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(79);
        arr.add(71);
        arr.add(9);
        arr.add(11);
        arr.add(14);
        arr.add(76);
        arr.add(54);
        arr.add(32);

        System.out.println("before sorting :" + arr);
        new HeapSort().sort(arr);
        System.out.println("after sorting :" + arr);

    }
}
