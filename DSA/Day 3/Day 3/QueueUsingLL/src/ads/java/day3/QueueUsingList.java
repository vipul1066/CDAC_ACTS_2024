package ads.java.day3;

public class QueueUsingList implements Queue {
	
	private List list;

	public QueueUsingList() {
		list = new SinglyList();
	}
	

	@Override
	public void enqueue(int element) {
		list.addAtRear(element);
		
	}

	@Override
	public int dequeue() {
		return list.deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}


	@Override
	public void printQueue() {
		list.print();
		
	}


	

}
