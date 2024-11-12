package ads.java.day3;


import java.util.Arrays;

public class QueueTester {
	
	public static void testList() {
		
		List list = new SinglyList();
		QueueUsingList queueUsingList = new QueueUsingList();
		
		queueUsingList.enqueue(3);
		queueUsingList.enqueue(4);
		queueUsingList.enqueue(5);
		queueUsingList.enqueue(36);
		queueUsingList.enqueue(7);
		queueUsingList.enqueue(2);
		
		queueUsingList.printQueue();
		
		System.out.println("Element removed is = " + queueUsingList.dequeue());
		
		queueUsingList.printQueue();
		
		
		
//		list.e(2);
//		list.addAtRear(4);
//		list.addAtRear(5);
//		list.addAtRear(6);
//		list.addAtRear(9);
		
//		list.print();
//		
//		System.out.println("Element removed is = " + list.deleteFirstNode());
//		
//		list.print();
//	}
	
	
	}
	public static void main(String[] args) {
		testList();
	}

}
