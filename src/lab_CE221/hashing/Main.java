package lab_CE221.hashing;

import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Created 1000 random integers for your hash table implementation
		Integer[] randomArr = generateRandomNumbers(1000, 1000, 5000);

		// TODO: This is the usage of your implementation for hashing
		MyHashtable myHashtable = new MyHashtable(11);
		myHashtable.insert(1);
		myHashtable.insert(11);
		myHashtable.insert(3);

		/**
		 * CALCULATE TIME: !START!
		 **/
		long startTime1 = System.nanoTime();
		for (int i : randomArr) {
			myHashtable.insert(i);
		}
		/**
		 * CALCULATE TIME: !END!
		 **/
		long endTime1 = System.nanoTime();
		long elapsedTime1 = endTime1 - startTime1;

		myHashtable.printTable();

		///////////////////////// SECOND PART ///////////////////////////

		/* TODO: MyInteger class uses hashing implementation of Java
			it is used for hashing algorithm on Hashtable class of Java
		 */
		// Created 1000 random MyInteger class type integers for your usage in Java Hashtable implementation
		MyInteger[] randomArrJava = generateRandomMyNumbers(1000, 5000, 9000);

		Hashtable<Integer, Integer> javaHashtable = new Hashtable<>(11);

		/**
		 * CALCULATE TIME: !START!
		 **/

		long startTime = System.nanoTime();
// The operation
		for (MyInteger i : randomArrJava) {
			javaHashtable.put(i.hashCode(), i.get());
		}
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		/**
		 * CALCULATE TIME: !END!
		 **/
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
	private static MyInteger[] generateRandomMyNumbers(int size, int lowBound, int highBound)
	{
		Random rd = new Random();
		MyInteger[] tempRandom = new MyInteger[size];

		for (int i = 0; i < tempRandom.length; i++)
		{
			int randomInt = rd.nextInt(highBound - lowBound) + lowBound;
			tempRandom[i] = new MyInteger(randomInt);
		}

		return tempRandom;
	}

	/**
	 * QUESTION 4: Discuss the time complexities
	 Java Hashtable has hashCode() method, so that least number of hash collision occurs and entries are evenly distributed
	 across all the buckets.
	 My implementation will take much more time because of collisions. Also as the input size increase running time will be much much more than
	 Java Hashtable
	 */
}
