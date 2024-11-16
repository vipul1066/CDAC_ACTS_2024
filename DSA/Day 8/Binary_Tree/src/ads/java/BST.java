package ads.java;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class BTNode {
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}
	private BTNode root;

	public BST() {
		root = null;
	}

	public void delete(int element) {
		// Find current node, that needs to be deleted.
		BTNode parent = null;
		BTNode current = root;
		while (current != null) {
			if (current.data == element) {
				break;
			}
			parent = current;
			if (element < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		
		if (current == null) {
			// element not found OR tree is empty.
			return;
		}
		
		if ((current.leftChild == null) && (current.rightChild == null)) {			
			// Deleting a leaf node.
			if (current == root) {
				// Deleting root node => deleting only node of tree.
				root = null;
				return;
			}
			
			if (current == parent.leftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
			return;
		}
		
		BTNode childOfCurrent = null; // To track only child of current.
		if (current.leftChild == null) {
			// current has only right child.
			childOfCurrent = current.rightChild;
		}
		if (current.rightChild == null) {
			// current has only right child.
			childOfCurrent = current.leftChild;
		}
		
		if (childOfCurrent != null) {
			// current has only one child.
			// Make that only child replace current as child of parent.
			if (current == parent.leftChild) {
				parent.leftChild = childOfCurrent;
			} else {
				parent.rightChild = childOfCurrent;
			}
			return;
		}
		
		// current has two children !!!
		// Find inorder successor of current.
		BTNode inorderSuccessorParent = current;
		BTNode inorderSuccessor = current.rightChild;
		while (inorderSuccessor.leftChild != null) {
			inorderSuccessorParent = inorderSuccessor;
			inorderSuccessor = inorderSuccessor.leftChild;
		}
		// Swap values of inorderSuccessor and current node.
		int t = current.data;
		current.data = inorderSuccessor.data;
		inorderSuccessor.data = t;
		// Delete inorderSuccessor node.
		if (inorderSuccessor == inorderSuccessorParent.leftChild) {
			inorderSuccessorParent.leftChild = inorderSuccessor.rightChild;
		} else {
			inorderSuccessorParent.rightChild = inorderSuccessor.rightChild;
		}
	}

	public void insert(int element) {
		BTNode newNode = new BTNode();
		newNode.data = element;
		newNode.leftChild = null;
		newNode.rightChild = null;
		
		if (root == null) {
			root = newNode;
			return;
		}
		
		BTNode current = root;
		while (current != null) {
			if (element < current.data) {
				if (current.leftChild == null) {
					current.leftChild = newNode;
					return;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = newNode;
					return;
				}
				current = current.rightChild;
			}
		}
	}

	public boolean search(int element) {
		BTNode current = root;

		while (current != null) {
			if (current.data == element) {
				return true;
			}
			
			if (element < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		return false;
	}
	
	public void printUsingLevelorder() {
		if (root == null) {
			return;
		}

		Queue<BTNode> nodesQueue = new LinkedList<>();
		nodesQueue.add(root);
		
		while (!nodesQueue.isEmpty()) {
			BTNode current = nodesQueue.remove();
			
			System.out.print(current.data + " ");
			
			if (current.leftChild != null) {
				nodesQueue.add(current.leftChild);
			}
			if (current.rightChild != null) {
				nodesQueue.add(current.rightChild);
			}
		}
		System.out.println("");
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
	
	public int height(BTNode root) {
		if(root == null) {
			return 0;
		}
		if( root.leftChild == null && root.rightChild == null) {
			return 0;
		}
		
		return 1 + Math.max(height(root.leftChild), height(root.rightChild));
	}
	
	public int height() {
		return height(root);
	}
	
	public int findSmallest(BTNode root) {
		if(root == null) {
			return 0;
		}
		
		while(root.leftChild != null) {
			root = root.leftChild;
		}
		return root.data;
		
	}
	public int findSmallest() {
		return findSmallest(root);
	}
	
	public int findLargest(BTNode root) {
		if(root == null) {
			return 0;
		}
		if(root.rightChild == null) {
			return root.data;
		}
		while(root.rightChild != null) {
			root = root.rightChild;
		}
		return root.data;
		
	}
	public int findLargest() {
		return findLargest(root);
	}

	public void deleteUsingInorderPredecessor(int element) {
	root = deleteRecUsingInorderPredecessor(root, element);
}

private BTNode deleteRecUsingInorderPredecessor(BTNode node, int element) {
	if (node == null) {
		return null;
	}

	if (element < node.data) {
		node.leftChild = deleteRecUsingInorderPredecessor(node.leftChild, element);
	} else if (element > node.data) {
		node.rightChild = deleteRecUsingInorderPredecessor(node.rightChild, element);
	} else {
		if (node.leftChild == null && node.rightChild == null) {
			return null;
		}

		if (node.leftChild == null) {
			return node.rightChild;
		} else if (node.rightChild == null) {
			return node.leftChild;
		}

		BTNode predecessor = findInorderPredecessor(node.leftChild);
		node.data = predecessor.data;
		node.leftChild = deleteRecUsingInorderPredecessor(node.leftChild, predecessor.data);
	}
	return node;
}

private BTNode findInorderPredecessor(BTNode node) {
	while (node.rightChild != null) {
		node = node.rightChild;
	}
	return node;
}


}
