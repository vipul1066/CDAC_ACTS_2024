package ads.java;

public class GenericQueue<T> implements Queue<T> {
    private T[] queueData;
    private int front;
    private int rear;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GenericQueue(int size) {
        capacity = size;
        queueData = (T[]) new Object[capacity]; 
        front = 0;
        rear = -1;
    }

    @Override
    public void enqueue(T element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        queueData[rear] = element; 
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T result = queueData[front]; 
        front++; 
        
     
        if (front > rear) {
            front = 0;
            rear = -1; 
        }

        return result; 
    }

    @Override
    public boolean isEmpty() {
        return front > rear; 
    }

    @Override
    public boolean isFull() {
        return rear == capacity - 1;
    }
}
