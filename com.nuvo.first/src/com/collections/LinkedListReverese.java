package com.collections;

public class LinkedListReverese {

	public static void main(String args[]) {
		//Preparing some linked list structure
		MyLinkedList linkedList = new MyLinkedList(5);
		linkedList.next = new MyLinkedList(4);
		linkedList.next.next = new MyLinkedList(3);
		linkedList.next.next.next = new MyLinkedList(2);
		linkedList.next.next.next.next = new MyLinkedList(1);
		System.out.println("Original Linked List: " + linkedList.toString());

		//recursively reverse and print
		linkedList = recursiveReverse(linkedList);
		System.out.println("Recursively Reversed List: "+ linkedList.toString());

		//iteratively reverse and print
		linkedList = iterativeReverse(linkedList);
		System.out.println("Iteratively Recursed to Original "  + linkedList.toString());
		
		
	}

	/**
	 * This method uses recursive method to reverse a singly linked list.
	 */
	public static MyLinkedList recursiveReverse(MyLinkedList linkedList) {

		// check for empty or size 1 linked list. This is a base condition to
		// terminate recursion.
		if (linkedList == null || linkedList.next == null) {
			return linkedList;
		}

		MyLinkedList remainingReverse = recursiveReverse(linkedList.next);

		// update the tail as beginning
		MyLinkedList current = remainingReverse;
		while (current.next != null) {
			current = current.next;

		}
		// assign the head as a tail
		current.next = linkedList;
		linkedList.next = null;

		return remainingReverse;
	}

	/**
	 * This method uses iterative approach to reverse a singly linked list.
	 */
	public static MyLinkedList iterativeReverse(MyLinkedList linkedList) {

		if (linkedList == null || linkedList.next == null) {
			return linkedList;
		}

		MyLinkedList prevNode, currNode, nextNode;
		prevNode = null;
		nextNode = null;
		currNode = linkedList;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}

		return prevNode;
	}
}
