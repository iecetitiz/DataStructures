package hashTable;

import java.util.ArrayList;
import java.util.Hashtable;

public class MyHashTable<K, V> {

    class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    ArrayList<HashNode<K, V>> buckets;
    int size;
    int numberOfBuckets;
    final double LOAD_FACTOR = 0.75;

    public MyHashTable() {
        numberOfBuckets = 10;
        buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(null);
        }
        System.out.println("hashtable is created");
    }

    public int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return (hashCode % numberOfBuckets);
    }

    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        HashNode<K, V> newNode = new HashNode<>(key, value);
        head = buckets.get(bucketIndex);
        newNode.next = head;

        buckets.set(bucketIndex, newNode);
        System.out.println(key + " " + value + " pair inserted successfully");
        size++;

        double loadFactor = (1.0 * size) / numberOfBuckets;
        System.out.println("load factor is: " + loadFactor);

        if (loadFactor > LOAD_FACTOR) {
            System.out.println("load factor is greater than " + LOAD_FACTOR + " so rehashing will be done");

            rehash();

            System.out.println("New Size of Map: " + numberOfBuckets + "\n");
        }
    }

    public void rehash() {
        System.out.println("\n***Rehashing Started***\n");
        ArrayList<HashNode<K, V>> temp = buckets;
        buckets = new ArrayList<HashNode<K, V>>(2 * numberOfBuckets);

        for (int i = 0; i < 2 * numberOfBuckets; i++) {
            buckets.add(null);
        }
        size = 0;
        numberOfBuckets *= 2;

        for (int i = 0; i < temp.size(); i++) {
            HashNode<K, V> head = temp.get(i);

            while (head != null) {
                K key = head.key;
                V value = head.value;

                insert(key, value);
                head = head.next;
            }
        }
        System.out.println("\n***Rehashing Ended***\n");
    }

    public void printHashTable() {
        ArrayList<HashNode<K, V>> temp = buckets;
        System.out.println("Current HashMap:");
        for (int i = 0; i < temp.size(); i++) {
            HashNode<K, V> head = temp.get(i);
            while (head != null) {
                System.out.println("key: " + head.key + " value: " + head.value);
                head = head.next;
            }
        }
        System.out.println();
    }

    public V getValue(K key) {
        int index = getBucketIndex(key);
        HashNode<K,V> temp = buckets.get(index);
        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
}
