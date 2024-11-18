package ads.java;

class LinkedList {
    private Node head;

    private class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public void insert(int key) {
        if (head == null) {
            head = new Node(key);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(key);
        }
        System.out.println("Inserted key " + key + " into linked list.");
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}
