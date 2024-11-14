package day5.ads.java;

public class SortedDoublyList implements SortedDList {
	DLNode head;
	DLNode tail;

	public SortedDoublyList() {
		head = null;
		tail = null;
	}

	@Override
	public void insert(int element) {
		// 1.
		DLNode newNode = new DLNode(element);
		
		// 2.
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		// 3.
		DLNode current = head;
		while (current != null) {
			if (current.data > element) {
				break;
			}
			current = current.next;
		}
		
		// 4.
		if (current == head) {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}
		
		// 5.
		if (current == null) {
			// current.previous.next = newNode;
			// newNode.previous = current.previous;
			// tail = newNode;
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			return;
		}
		
		// 6.
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;
	}

	@Override
	public void delete(int element) {
		// TODO: Assignment
		DLNode curr = head;
		DLNode prev = head;
		if(head == null) {
			return;
		}
		if(head.data == element &&  head.next == null) {

			head = head.next;
			head.previous = null;
			return;
		}
		while(curr != null) {
			if(curr.next == null && curr.data == element) {
				prev.next = null;
				curr.previous =null;
				return;
			}
			if(curr.data == element) {
				prev.next = curr.next;
				curr.next.previous = prev;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	@Override
	public void deleteAll(int element) {
		// TODO: Assignment
		DLNode curr = head;
		DLNode prev = head;
		if(head == null) {
			return;
		}
		
		while(curr != null) {
			if(curr.next == null && curr.data == element) {
				prev.next = null;
				curr.previous =null;
				return;
			}
			if(head.data == element) {
				head = head.next;
				head.previous = null;
				curr = curr.next;
			}
			else {
			if(curr.data == element) {
				prev.next = curr.next;
				curr.next.previous = prev;
				curr = curr.next;
			}
			else {
			prev = curr;
			curr = curr.next;
			}
			}
		}
		
	}

	@Override
	public boolean search(int element) {
		// TODO: Assignment
		DLNode curr = head;
		while(curr != null) {
			if(curr.data == element) {
				return true;
			}
			
			curr = curr.next;
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
