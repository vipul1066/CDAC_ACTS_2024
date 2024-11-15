package day6.ads.java;

public class day6App {

	public static void testInorder() {
		BinaryTree bt01 = new BinaryTree();
		
		bt01.createTree01();
		
		bt01.printUsingInorder();
		bt01.printUsingPreorder();
		bt01.printUsingPostorder();
		System.out.println(bt01.CountNodes());
		System.out.println(bt01.CountLeafNodes());
		System.out.println(bt01.CountNodesWithValue(10));
	}

	public static void main(String[] args) {
		testInorder();
	}

}
