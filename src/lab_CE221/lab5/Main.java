package lab_CE221.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random1 = new Random(3);
        Random random2 = new Random(3);

        ArrayList<Integer> myArrayList = new ArrayList<>();
        ArrayList<Integer> benchmarkArrayList = new ArrayList<>();

        //myArrayList is filled with random numbers for my own insertionSort method
        for (int i = 0; i < 100; i++) {
            myArrayList.add(random1.nextInt(1000));
        }

        //benchmarkArrayList is filled with random numbers that exactly same with myArrayList to sort with Arrays.sort() method
        for (int i = 0; i < 100; i++) {
            benchmarkArrayList.add(random2.nextInt(1000));
        }

        System.out.println("before sorting myArrayList:");
        for (int i = 0; i < 100; i++) {
            System.out.print(myArrayList.get(i) + "-");
        }

        System.out.println("\nbefore sorting benchmarkArrayList:");
        for (int i = 0; i < 100; i++) {
            System.out.print(benchmarkArrayList.get(i) + "-");
        }

        System.out.println("\n---------------------------------------------------------------");

        //list object created with a parameter constructor with myArrayList
        Sorting list = new Sorting(myArrayList);

        long startTime = System.nanoTime();
        list.insertionSort(myArrayList); //myArrayList is sent as a parameter
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;


        System.out.println("sorted array with my own implementation insertion sort method:");
        for (int i = 0; i < 100; i++) {
            System.out.print(list.getArrayList().get(i) + "-");
        }

        System.out.println("\nelapsed time for myArrayList with my own implementation insertion sort method: " + elapsedTime);
        System.out.println("---------------------------------------------------------------");


        //benchmarkArrayList is converted to an Integer array
        Integer[] array = benchmarkArrayList.toArray(new Integer[0]);

        long startTime2 = System.nanoTime();
        Arrays.sort(array);
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;


        System.out.println("sorted array with Arrays.sort() method:");
        for (int i = 0; i < 100; i++) {
            System.out.print(array[i] + "-");
        }

        System.out.println("\nelapsed time for benchmarkArrayList with Arrays.sort() method: " + elapsedTime2);
        System.out.println("---------------------------------------------------------------");
    }

    //There is no recognizable difference between those execution times with 100 inputs.
    //Following is one of the outputs:
    //elapsed time for myArrayList with my own implementation insertion sort method: 492400
    //elapsed time for benchmarkArrayList with Arrays.sort() method: 401100


    //But, when input size is 100.000 there is a recognizable difference between those execution times.
    //Following is one of the outputs:
    //elapsed time for myArrayList with my own implementation insertion sort method: 5981893500
    //elapsed time for benchmarkArrayList with Arrays.sort() method: 30011200

    //I think the reason is:
    //Arrays.sort() internally uses double-pivot variant of quicksort
    //and some merge sort versions like stable, adaptive, iterative mergesort that has
    //far fewer comparisons than traditional mergesort (less than n*log(n))
    //(from the java documentation)

    //These two sorting algorithms have less time complexity than the insertion sort because insertion sort has
    //θ(n^2) time complexity both average and worst case.

}

