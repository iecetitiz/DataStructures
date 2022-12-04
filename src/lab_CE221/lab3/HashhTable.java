package lab_CE221.lab3;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashhTable {
    int size;
    private ArrayList<LinkedList<Integer>> table;

    HashhTable(int n) {
        size = n;
        table = new ArrayList<LinkedList<Integer>>(n);
        for(int i = 0; i<size; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    private int hash_func(Integer value) {
        return value % table.size();
    }

    public boolean lookup(Integer value) {
        for(int i = 0; i<size; i++) {
            boolean lookup = table.get(i).contains(value);
            if(lookup) {
                return true;
            }
        }
        return false;
    }

    public void insert(Integer value) {
        if(value == null) {
            throw new IllegalArgumentException("Value can not be null");
        }
        if(lookup(value) == false) {
            table.get(hash_func(value)).addFirst(value);
        }


    }
}
