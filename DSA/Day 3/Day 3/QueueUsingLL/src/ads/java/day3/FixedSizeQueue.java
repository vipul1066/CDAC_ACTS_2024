// package ads.java.day3;

// public class FixedSizeQueue implements Queue {
// 	private int[] QueueData;
// 	private int front;
// 	private int rear;
	
// 	public FixedSizeQueue(int n) {
// 		QueueData = new int[n];
// 		front = 0;
// 		rear = -1;
// 	}

// 	@Override
// 	public void enqueue(int element) {
// 		if(isFull()) {
// 			throw new IllegalStateException("Queue is full");
// 		}
// 		++rear;
// 		QueueData[rear]= element;
// 	}

// 	@Override
// 	public int dequeue() {
// 		if(isEmpty()) {
// 			throw new IllegalStateException("Queue is empty");
// 		}
// 		int result = QueueData[front];
// 		++front;
		
// 		if (front > rear) {
//             front = 0;
//             rear = -1;
//         }
// 		return result;
// 	}

// 	 @Override
// 	    public boolean isEmpty() {
// 	        return front > rear; 
// 	    }

// 	    @Override
// 	    public boolean isFull() {
// 	        return rear == QueueData.length - 1; 
// 	    }
	
	

// }
