package day4.ads.java;

public class SortedSinglyList implements SortedList {
	SLNode head;
	
	public SortedSinglyList() {
		head = null;
	}

	@Override
	public void insert(int element) {
		SLNode newNode = new SLNode(element);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		SLNode current = head;
		SLNode previous = null;
		while (current != null) {
			if (current.data > newNode.data) {
				break;
			}
			previous = current;
			current = current.next;
		}
		
		if (previous == null) { // or current == head
			newNode.next = head;
			head = newNode;
			return;
		}
		
		previous.next = newNode;
		newNode.next = current;
	}

	@Override
	public void delete(int element) {
	    SLNode current = head;
	    SLNode previous = null;

	    if (head == null) {
	        return; 
	    }

	    if (head.data == element && head.next == null) {
	        head = null; 
	        return; 
	    }

		if(head == element){
			head  = head.next;
		}

	    while (current != null) {
	        if (current.data == element) {
	            previous.next = current.next; 
	            return; 
	        }
	        previous = current;
	        current = current.next;
	    }
	}

	@Override
	public void deleteAll(int element) {
		SLNode current = head;
		SLNode previous = null;
		
		if (current == null) {
	        return; 
	    }
		
		if(current.next == null) {
			head = null;
			return;
		}
		
		while(current != null) {
			if(current.data == element) {
				if(previous == null) {
					head = current.next;
				}else {
					previous.next = current.next;
				}
				current = current.next;
			}else {
			previous = current;
			current = current.next;
			}
		}

	}

	@Override
	public boolean search(int element) {
		SLNode curr = head;
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
		SLNode current = head;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

}
