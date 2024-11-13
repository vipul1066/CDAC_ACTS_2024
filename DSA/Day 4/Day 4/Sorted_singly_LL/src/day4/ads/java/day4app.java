package day4.ads.java;

public class day4app {

	public static void testInsert() {
		SortedList list = new SortedSinglyList();
		
		list.insert(5);
		list.insert(6);
		list.insert(5);
		list.insert(5);
		list.insert(12);
		//list.insert(20);
		//list.insert(15);
		
		list.print();
		list.deleteAll(5);
		list.print();
		list.delete(12);
		list.print();
		System.out.println(list.search(6));
	}

//	public static void testDListAddAtFront() {
//		DList list = new DoublyList();
//		
//		list.addAtFront(5);
//		list.addAtFront(10);
//		
//		list.print();
//		list.printBackwards();
//	}

	public static void main(String[] args) {
		testInsert();
		//testDListAddAtFront();
	}

}
