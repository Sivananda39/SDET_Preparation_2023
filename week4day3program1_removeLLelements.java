package week4_WeekdayProblems;

import org.junit.Test;

public class week4day3program1_removeLLelements {
//	Homework 17/05/2023:
//	https://leetcode.com/problems/remove-linked-list-elements/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeElementsLL();

	}

	public static void removeElementsLL() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node prev;
		public Integer val;
		

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
		head.next = addNode(2);
		head.next.next = addNode(6);
		head.next.next.next = addNode(3);
		head.next.next.next.next = addNode(4);
		head.next.next.next.next.next = addNode(5);
		head.next.next.next.next.next.next = addNode(6);
		int val = 6;
		printAllNodes(head);
		System.out.println("__________________");
		Node tail = removeElement(head, val);
		printAllNodes(tail);
	}

	// 4. method to remove the ele
	public Node removeElement(Node head, int val) {
		if (head == null) {

			return head;
		} else {
			Node temp = head;
			Node temp1 = head.next;
			while (temp.next != null) {
				if (temp.data == val) {
					if (temp == head) {
						head = head.next;
						temp = head;
					} else {

					}
				} else {
					temp = temp.next;
				}
			}
			if (temp.data == val && temp == head) {
				head = null;
				temp = head;
			}
		}
		return head;
	}
	// 5. Printing the nodes for input and output

	private void printAllNodes(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;

		}
		
	}

}
