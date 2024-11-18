package ads.java;

public class hashTableOperations {
    public static void test01(HashTable ht) {
        System.out.println("*** Inserting ***");
        int[] keysToInsert = {18, 28, 38, 16, 48, 26};
        for (int key : keysToInsert) {
            ht.insert(key);
        }

        System.out.println("\n*** Searching ***");
        int[] keysToSearch = {88, keysToInsert[5], keysToInsert[0], 90};
        for (int key : keysToSearch) {
            if (ht.search(key)) {
                System.out.println(key + " found.");
            } else {
                System.out.println(key + " NOT found.");
            }
        }

        System.out.println("\n*** Displaying Buckets ***");
        if (ht instanceof HashTableUsingChainingWithLinkedList) {
            ((HashTableUsingChainingWithLinkedList) ht).displayBuckets();
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTableUsingChainingWithLinkedList();
        test01(ht);
    }
}
