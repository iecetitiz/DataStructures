package lab_CE221.lab3;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashtable {
    int size; //number of buckets
    ArrayList<LinkedList<Integer>> table;
    int numberOfElements; //total number of elements in the hash table
    final double DEFAULT_LOAD_FACTOR = 0.75;

    MyHashtable(int n) {
        size = n;
        numberOfElements = 0;
        table = new ArrayList<LinkedList<Integer>>(n);
        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    private int hashFunction(Integer value) {
        return value % table.size();
    }

    public boolean contains(Integer value) {
        for (int i = 0; i < size; i++) {
            boolean lookup = table.get(i).contains(value);
            if (lookup) {
                return true;
            }
        }
        return false;
    }

    public void insert(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("Value can not be null");
        }
        if (contains(value) == false) { // no same element
            table.get(hashFunction(value)).addFirst(value);
            numberOfElements++;
        }
        double CurrentLoadFactor = (1.0 * numberOfElements) / size;
        System.out.println("Current Load Factor is: " + CurrentLoadFactor);

        if (CurrentLoadFactor > DEFAULT_LOAD_FACTOR) {
            rehash();
            System.out.println("New Size Of Table: " + size);
        }
    }

    public void printTable() {
        for (int i = 0; i < table.size(); i++) {
            System.out.print(i + "-");
            for (Integer x : table.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public void rehash() {
        size = size * 2;
        ArrayList<LinkedList<Integer>> tempTable = table;
        table = new ArrayList<LinkedList<Integer>>(size); //now all ArrayList elements are null
        numberOfElements = 0;

        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<Integer>()); //not null anymore
        }

        for (int i = 0; i < tempTable.size(); i++) {
            for (Integer x : tempTable.get(i)) {
                insert(x);
            }
        }
    }
}
