package day6.ads.java;

public class BinaryTree {
	class BTNode {
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}
	
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}

	public void createTree01() {
		BTNode n1 = new BTNode();
		BTNode n2 = new BTNode();
		BTNode n3 = new BTNode();
		BTNode n4 = new BTNode();
		
		n1.data = 5;
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.data = 10;
		n2.leftChild = n4;
		n2.rightChild = null;
		
		n3.data = 6;
		n3.leftChild = null;
		n3.rightChild = null;
		
		n4.data = 8;
		n4.leftChild = null;
		n4.rightChild = null;
		
		root = n1;
	}

	private void printUsingInorder(BTNode root) {
		if (root == null) {
			return;
		}
		
		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}
	
	public void printUsingInorder() {
		printUsingInorder(root);
		System.out.println("");
	}
	
	
	// Assignment Below
	
	public void printUsingPreorder(BTNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printUsingPreorder(root.leftChild);
		printUsingPreorder(root.rightChild);
	}
	
	public void printUsingPreorder() {
		printUsingPreorder(root);
		System.out.println("");
	}
	
	public void printUsingPostorder(BTNode root) {
		if(root == null) {
			return;
		}
		printUsingPostorder(root.leftChild);
		printUsingPostorder(root.rightChild);
		System.out.print(root.data + " ");
		
	}
	public void printUsingPostorder() {
		printUsingPostorder(root);
		System.out.println("");
	}
	
public int CountNodes(BTNode root) {
	if(root == null) {
		return 0;
	}
	
	return 1 + CountNodes(root.leftChild) + CountNodes(root.rightChild);
		
	}
	
	public int CountNodes() {
		return CountNodes(root);
	}
	
	public int CountLeafNodes(BTNode root) {
		
		if(root == null) {
			return 0;
		}
		if (root.leftChild == null && root.rightChild == null) {
			return 1;
		}
		return CountLeafNodes(root.leftChild) + CountLeafNodes(root.rightChild);
	}
	
	public int CountLeafNodes() {
		return CountLeafNodes(root);
	}
	
	
	
	public int CountNodesWithValue(BTNode root, int value) {
        if (root == null) {
            return 0; 
        }
        int count = (root.data == value) ? 1 : 0;
        return count + CountNodesWithValue(root.leftChild, value) + CountNodesWithValue(root.rightChild, value);
    }
    
    public int CountNodesWithValue(int value) {
        return CountNodesWithValue(root, value);
    }
	

}







