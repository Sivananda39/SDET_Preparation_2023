package mandatoryHomeWork.Week4.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;



public class LC_21_mergeSortedLists {
//	 Homework - 15/05/2023
//	https://leetcode.com/problems/merge-two-sorted-lists/

//	Input: list1 = [1,2,4], list2 = [1,3,4]
//			Output: [1,1,2,3,4,4]
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeSortedLists();
	}

	public static void mergeSortedLists() {

	}

	// 1. Implementation of Class for NODE
	public class Node {
		int data;
		Node next;
		Node(){
			next = null;
		}

		Node(int key) {
			this.data = key;
			next = null;
		}
	}

	// 2. Implementation of method to add data to node
	public Node addNode(int data) {
		return new Node(data);
	}

	// 3. Implemenation of methods to add data for merge in the list
	@Test
	public void testmerge1() {
		Node head1 = addNode(1);
		head1.next = addNode(2);
		head1.next.next = addNode(4);
		Node head2 = null;
		printAllNodesformerged(head1);
		System.out.println("______________List 1 ");
		Node merge = mergeLinkedList(head1, head2);
		printAllNodesformerged(merge);
	}
	@Test
	public void testmerge2() {
		Node head1 = null;
		Node head2 = addNode(1);
		head2.next = addNode(3);
		head2.next.next = addNode(4);
		printAllNodesformerged(head2);
		System.out.println("_______________List 2");
		Node merge = mergeLinkedList(head1, head2);
		printAllNodesformerged(merge);
	}

	// 4. method to reverse the node
	public Node mergeLinkedList(Node node1, Node node2 ) {
			Node merged = new Node();
			Node current = merged;
			
			while(node1 != null && node2 != null) {
				if(node1.data < node2.data) {
					current.next = node1;
					node1 = node1.next;
				} else {
					current.next = node2;
					node2 = node2.next;
				}
				current = current.next;
			}
			if (current.next == null ) {
				current.next = node1;
			
			}
			else
				current.next = node2;

			return merged.next;
	}
	//5. Printing the nodes for input and output
	
	private void printAllNodesformerged(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
			
		}
	}


}
