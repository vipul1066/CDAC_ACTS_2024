package ads.java;

public class App {

	public static void testBST() {
		BST bst01 = new BST();
		
		bst01.insert(10);
		bst01.insert(5);
		bst01.insert(8);
		bst01.insert(20);
		bst01.insert(15);
		bst01.insert(30);
		bst01.insert(1);
		bst01.insert(12);
		
		//bst01.printUsingLevelorder();
		
		bst01.printUsingInorder();
		
//		bst01.delete(1); // leaf node.
//		bst01.delete(5); // node with one child.
//		bst01.delete(10); // node with two childrens.

		bst01.printUsingInorder();
		//-------------------------- Assignment Below ------------------------------------------
		System.out.println("Height of BST= " + bst01.height());
		System.out.println("Smallest value in BST is = " + bst01.findSmallest());
		System.out.println("Largest value in BST is = " + bst01.findLargest());
		System.out.println("Delete Element using inorder predecessor" + bst01.deleteRecUsingInorderPredecessor());
		
		
	}

	public static void main(String[] args) {
		testBST();
	}

}
