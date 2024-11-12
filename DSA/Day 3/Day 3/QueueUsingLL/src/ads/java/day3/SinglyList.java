package ads.java.day3;

public class SinglyList implements List {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public SinglyList() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void addAtRear(int element) {
        Node newNode = new Node(element);
        
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        } 
            rear.next = newNode;
            rear = newNode; 
        
    }

	@Override
	public int deleteFirstNode() {
		if(isEmpty()) {
			return -1;
		}
		
		Node temp = front;
		front = front.next;
		
		if(isEmpty()) {
			rear = front;
			
		}
		return temp.data;
	}

	@Override
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		Node current = front;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
		
	}

}
