package hashing_dinesh;

public class HashTable {
    private HashNode[] buckets;
    private int numberOfBuckets; //numberOfCapacity
    private int size; // number of nodes in a hash table

    public HashTable() {
        this(10); // default capacity
    }
    public HashTable(int capacity) {
        this.numberOfBuckets = capacity;
        buckets = new HashNode[capacity];
        this.size = 0;
    }

    private class HashNode{
        private Integer key; // Can be generic
        private String value; // Can be generic
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfBuckets() {
        return numberOfBuckets;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getBucketIndex(Integer key) {
        return key % numberOfBuckets; //buckets.length
    }

    public void put(Integer key, String value) {
        if(key == null || value == null) {
            throw new IllegalArgumentException("Key or Value is null!!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null) { //TODO: "LOOK AT AGAIN"
            if(head.key.equals(key)) {
                head.value = value;
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
        if(key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
}
