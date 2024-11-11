package ads.java;

public interface Queue {
	void enqueue(int element);
	int dequeue();
	boolean isEmpty();
	boolean isFull();
}
