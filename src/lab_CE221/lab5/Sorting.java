package lab_CE221.lab5;

import java.util.ArrayList;
import java.util.Random;

public class Sorting {

    private ArrayList<Integer> arrayList;

    public Sorting() {
        this.arrayList = new ArrayList<>();
    }

    public Sorting(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    //Getters and Setters
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void insertionSort(ArrayList<Integer> list) {
        arrayList = list; //arrayList variable shows "list" parameter now
        for (int i = 1; i < list.size(); i++) {
            int current = list.remove(i); // removes and returns
            int index = i - 1;
            while (index >= 0 && current < list.get(index)) {
                index--;
            }
            list.add(index + 1, current);
        }
    }
}
