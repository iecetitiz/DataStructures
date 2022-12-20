package sort_algos.merge_sort;

import java.util.Collection;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            Random random = new Random();

            for(int i = 0; i < 100; i++) {
                arrayList1.add(random.nextInt(200));
            }

            for(int i = 0; i < 100; i++) {
                arrayList2.add(arrayList1.get(i));
            }
            System.out.println("---------arraylist1---------");
            for(int i = 0; i < 100; i++) {
                System.out.print(arrayList1.get(i) + " ");
            }

            System.out.println();

            long start2 = System.nanoTime();
            Collections.sort(arrayList2);
            long end2 = System.nanoTime();
            System.out.println("Elapsed Time For Collection Sort: "+ (end2-start2));
            System.out.println("---------arraylist2---------");
            for(int i = 0; i < 100; i++) {
                System.out.print(arrayList2.get(i) + " ");
            }

            System.out.println();


            Sorting sortingList = new Sorting(arrayList1);
            long start1 = System.nanoTime();
            sortingList.sortArray();
            long end1 = System.nanoTime();
            System.out.println("Elapsed Time For Merge Sort Method: "+ (end1-start1));
            System.out.println("sorted arraylist1");
            for(int i = 0; i < 100; i++) {
                System.out.print(arrayList1.get(i) + " ");
            }
        }

        // Collection.sort() faster some different input size than the merge sort but i think
        // as the input size increases(like 2000-3000) collection.sort() method is faster than the merge sort

    }

