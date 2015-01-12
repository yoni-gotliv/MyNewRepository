package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class SplitLinkedList {

	public static void main(String[] arg0){
		
		Queue<Integer> intList = new LinkedList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(10);
		
		Queue<Integer> oddList = new LinkedList<Integer>();
		Queue<Integer> evenList = new LinkedList<Integer>();
		
		splitList(intList,oddList,evenList);
		
		System.out.println("OddList = " + oddList);
		System.out.println("EvenList = " + evenList);
		
		int i = 0 ;
		
		
	}
	
	public static void splitList(Queue<Integer> intList, Queue<Integer> oddList, Queue<Integer> evenList){
		

		for(Iterator<Integer> it = intList.iterator() ; it.hasNext();){
			Integer currNode = it.next();
			if (currNode % 2 == 0){
				evenList.add(currNode);
			}else {
				oddList.add(currNode);
			}
		}
	}
}
