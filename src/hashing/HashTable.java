package hashing;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; //capacity
    private int size; //number of key value pairs in hash table or number of hash nodes in a hash table

    public HashTable() {
        this(10); //default capacity
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[capacity];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void put(Integer key, String value) {
        if(key == null || value == null) {
            throw new IllegalArgumentException("key or value is null!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null) {
            if(head.getKey().equals(key)) {
                head.setValue(value);
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public String get(Integer key) {
        return null;
    }

    public String remove(Integer key) {
        return null;
    }

    public int getBucketIndex(Integer key) {
        return key % buckets.length;
    }
}
