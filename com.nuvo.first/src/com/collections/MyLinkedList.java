package com.collections;

/**
 *  * Custom Linked List representation class  
 */
class MyLinkedList {

	public MyLinkedList next;
	public int value;

	public MyLinkedList(int value) {
		this.value = value;
		this.next = null;
	}

	@Override
	public String toString() {

		String data = "";
		MyLinkedList current = this;
		do {
			data += current.value + ",";
			current = current.next;
		} while (current != null);
	
		return data;
	}
}