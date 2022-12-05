package lab_CE221.lab3;

import java.util.Hashtable;
import java.util.Random;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        // Created 1000 random integers for your hash table implementation
        Integer[] randomArr = generateRandomNumbers(1000, 1000, 5000);

        // TODO: This is the usage of your implementation for hashing
        YourHashtable myHashtable = new YourHashtable(11);

        long startTime = System.nanoTime();
        /**
         * CALCULATE TIME: !START!
         **/
        for (int i : randomArr) {
            myHashtable.insert(i);
        }
        /**
         * CALCULATE TIME: !END!
         **/
        long endTime = System.nanoTime();

        // The operation

        long elapsedTime = endTime - startTime;
        myHashtable.printTable();
        System.out.println("elapsed time for my implementation hashtable: " + elapsedTime);

        ///////////////////////// SECOND PART ///////////////////////////

		/* TODO: MyInteger class uses hashing implementation of Java
			it is used for hashing algorithm on Hashtable class of Java
		 */
        // Created 1000 random MyInteger class type integers for your usage in Java Hashtable implementation
        YourInteger[] randomArrJava = generateRandomMyNumbers(1000, 5000, 9000);

        Hashtable<Integer, Integer> javaHashtable = new Hashtable<>(11);

        long startTime2 = System.nanoTime();
        /**
         * CALCULATE TIME: !START!
         **/
        for (YourInteger i : randomArrJava) {
            javaHashtable.put(i.hashCode(), i.get());
        }
        /**
         * CALCULATE TIME: !END!
         **/
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("elapsed time for java implementation hashtable: " + elapsedTime2);
        System.out.println("capacity: " + hashTableCapacity(javaHashtable));

    }

    // Returns the current capacity of the hash table
    private static int hashTableCapacity(Hashtable<Integer, Integer> table) {
        //throws NoSuchFieldException, IllegalAccessException {

        Field tableField = null;

        try {
            tableField = Hashtable.class.getDeclaredField("table");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        tableField.setAccessible(true);

        Object[] tempTable = new Object[0];

        try {
            tempTable = (Object[]) tableField.get(table);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return (tempTable == null ? 0 : tempTable.length);
    }

    // Generate random numbers between low and high
    private static Integer[] generateRandomNumbers(int size, int lowBound, int highBound)
    {
        Random rd = new Random();
        Integer[] tempRandom = new Integer[size];

        for (int i = 0; i < tempRandom.length; i++)
        {
            tempRandom[i] = rd.nextInt(highBound - lowBound) + lowBound;
        }

        return tempRandom;
    }

    // Generate random numbers from MyInteger class between low and high
    private static YourInteger[] generateRandomMyNumbers(int size, int lowBound, int highBound)
    {
        Random rd = new Random();
        YourInteger[] tempRandom = new YourInteger[size];

        for (int i = 0; i < tempRandom.length; i++)
        {
            int randomInt = rd.nextInt(highBound - lowBound) + lowBound;
            tempRandom[i] = new YourInteger(randomInt);
        }

        return tempRandom;
    }

    /**
     * QUESTION 4: Discuss the time complexities
     *
     */
}
