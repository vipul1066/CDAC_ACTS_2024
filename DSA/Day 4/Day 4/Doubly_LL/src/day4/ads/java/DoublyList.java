package day4.ads.java;

public class DoublyList implements DList {
	DLNode head;
	DLNode tail;

	public DoublyList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		DLNode newNode = new DLNode(element);
		
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void addAtRear(int element) {
		DLNode newNode = new DLNode(element);
		DLNode curr = head;
		DLNode prev = null;

		if(head == null){
			head = tail = newNode;
		}
		
		while(curr != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = newNode;
		newNode.previous = prev;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if(head == null) {
			throw new IllegalArgumentException("Double Linked List is empty");
		}
		int deletedNode = head.data;
		head = head.next;
		head.previous = null;
		return deletedNode;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		DLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	@Override
	public void printBackwards() {
		DLNode current = tail;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println("");
	}

}
