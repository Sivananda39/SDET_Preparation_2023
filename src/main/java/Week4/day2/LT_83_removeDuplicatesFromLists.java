package Week4.day2;

import org.junit.Test;

public class LT_83_removeDuplicatesFromLists {
//	Homework 16/05/2023:
//		https://leetcode.com/problems/remove-duplicates-from-sorted-list/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeDuplicatesLists();
	
	}

	public static void removeDuplicatesLists() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of main method to add data and remove the list
	@Test
	public void testRemove() {
		Node head = addNode(1);
		head.next = addNode(1);
		head.next.next = addNode(2);
		printAllNodes(head);
		System.out.println("__________________");
		Node tail = removeDupNode(head);
		printAllNodes(tail);
	}

	// 4. method to remove the node
	public Node removeDupNode(Node head) {
		Node prev=head, curr=head.next;
		if(prev==null|| curr==null)return head;
		while(curr!=null) {
			if(prev.data==curr.data) {
				prev.next=curr.next;
			}
			else
				prev=curr;
			curr=curr.next;
			}return head;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
			
		}
	}

}
