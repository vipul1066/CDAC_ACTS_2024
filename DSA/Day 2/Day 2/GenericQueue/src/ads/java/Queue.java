package ads.java;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    boolean isFull();
}
