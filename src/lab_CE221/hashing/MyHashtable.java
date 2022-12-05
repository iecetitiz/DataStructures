package lab_CE221.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashtable {
    public int capacity;
    public int elementSize;
    // TODO: Create a hash table (a list, a list of a linkedlist, an array, etc.)
    // public List<Integer> table;
    ArrayList<Integer> table;
    final double DEFAULT_LOAD_FACTOR = 0.50;

    public MyHashtable(int capacity) {
        this.capacity = capacity;
        this.elementSize = 0;
        // table = new List<Integer>();
        table = new ArrayList<Integer>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getElementSize() {
        return elementSize;
    }

    public void setElementSize(int elementSize) {
        this.elementSize = elementSize;
    }

    // Adding new value
    public void insert(Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("Value can not be null");
        }
        int result = hashFunction(value);
        int i = 0;

        if (table.get((result + i + 7) % capacity) == null) {
            table.add(((result + i + 7) % capacity), value);
        } else {
            i++;
            while ((table.get((result + i + 7) % capacity) != null)) {
                i++;
            }
            table.add(((result + i + 7) % capacity), value);

            elementSize++;

            double CurrentLoadFactor = (1.0 * elementSize) / capacity;
            System.out.println("Current Load Factor is: " + CurrentLoadFactor);

            if (CurrentLoadFactor > DEFAULT_LOAD_FACTOR) {
                rehash();
                System.out.println("New Size Of Table: " + capacity);
            }

        }
        // TODO: Implement inserting new value to your hash table
        // If the elementSize exceeds the lambda (load factor) value at any point, you need to rehash your table:
        // rehash();

        //double CurrentLoadFactor = (1.0 * numberOfElements) / size;
    }

    // Searching a value in hash table
    public boolean contains(Integer value) {
        return table.contains(value);
        // TODO: Implement the searching a particular value by using hash codes
        // Return TRUE if you find the value in hash table
    }

    // Printing all values
    public void printTable() {
        for (int i = 0; i < table.size(); i++) {
            System.out.println(i + " " + table.get(i));
        }
        // TODO: Implement displaying your hash table
    }

    // Hash function
    private int hashFunction(Integer value) {
        // TODO: Implement this according to your hash method (separate chaining, linear probing, etc.)
        return value % capacity;
        // Return hashed version of your value
    }

    // Rehashing the hashtable
    private void rehash() {
        capacity = capacity * 2;

        ArrayList<Integer> tempTable = table;
        table = new ArrayList<Integer>(capacity); //now all ArrayList elements are null
        elementSize = 0;

        for (int i = 0; i < tempTable.size(); i++) {
            for (Integer x : tempTable) {
                insert(x);
            }
        }
    }
    // TODO: Implement rehashing when it is needed (load factor value is important!)
}

