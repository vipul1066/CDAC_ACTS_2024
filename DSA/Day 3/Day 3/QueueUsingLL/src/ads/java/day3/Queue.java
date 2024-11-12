package ads.java.day3;

public interface Queue {
	void enqueue(int element);
	int dequeue();
	boolean isEmpty();
	boolean isFull();
	void printQueue();

}
