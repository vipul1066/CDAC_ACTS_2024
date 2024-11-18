package ads.java;

public class HashTableUsingChainingWithLinkedList implements HashTable {
    private LinkedList[] buckets;
    private int size;

    public HashTableUsingChainingWithLinkedList() {
        size = 10;
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList();
        }
    }

    private int modN(int key) {
        return key % size;
    }

    @Override
    public void insert(int key) {
        int bucketId = modN(key);
        System.out.println("Storing key " + key + " in bucket #" + bucketId);
        buckets[bucketId].insert(key);
    }

    @Override
    public boolean search(int key) {
        int bucketId = modN(key);
        return buckets[bucketId].search(key);
    }

    public void displayBuckets() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket #" + i + ": ");
            buckets[i].display();
        }
    }
}
