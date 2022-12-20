package sort_algos.merge_sort;

import java.util.ArrayList;
import java.util.Random;

    public class Sorting {
        private ArrayList<Integer> arrayList;


        public ArrayList<Integer> getSortedArray() {
            return arrayList;
        }

        public void sortArray() {
            divide(0, this.arrayList.size() - 1);
        }


        public Sorting(ArrayList<Integer> arrayList) {
            this.arrayList = arrayList;
        }

        public void divide(int startIndex, int endIndex) {
            if ((startIndex < endIndex) && (endIndex - startIndex) >= 1) {
                int middle = (endIndex + startIndex) / 2;
                divide(startIndex, middle);
                divide(middle + 1, endIndex);

                merge(startIndex, middle, endIndex);
            }

        }

        public void merge(int startIndex, int middleIndex, int endIndex) {
            ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();

            int left = startIndex;
            int right = middleIndex + 1;

            while (left <= middleIndex && right <= endIndex) {
                if (arrayList.get(left) <= arrayList.get(right)) {
                    mergedSortedArray.add(arrayList.get(left));
                    left++;
                } else {
                    mergedSortedArray.add(arrayList.get(right));
                    right++;
                }
            }

            while (left <= middleIndex) {
                mergedSortedArray.add(arrayList.get(left));
                left++;
            }

            while (right <= endIndex) {
                mergedSortedArray.add(arrayList.get(right));
                right++;
            }

            int i = 0;
            int j = startIndex;

            while (i < mergedSortedArray.size()) {
                arrayList.set(j, mergedSortedArray.get(i++));
                j++;
            }
        }
    }

