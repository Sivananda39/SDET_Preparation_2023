package mandatoryHomeWork.week5.day_2;

import org.junit.Test;


//Homework 23/05/2023:
//	https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class LC_19_RemoveNthNodefromLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		middleOfLL();
	
	}

	public static void middleOfLL() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;
		Node head = null;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of main method to add data 
	@Test
	public void tesMiddle() {
		Node newNode = new Node(1);
		newNode.next=new Node(2);
		newNode.next.next=new Node(3);
		newNode.next.next.next=new Node(4);
		newNode.next.next.next.next=new Node(5);
		
		int n = 2;
		printAllNodes(newNode);
		System.out.println("__________________");
		Node tail = middleNode(newNode);
		printAllNodes(tail);
	}

//	 4. method to find middle the node
	public Node middleNode(Node newNode) {
		
//		
		
		return null;
	}
	
	//5. Printing the nodes for input and output
	

	
	private void printAllNodes(Node tail) {
		while (tail != null) {
			System.out.println(tail.data);
			tail = tail.next;
			
		}
	}
}
