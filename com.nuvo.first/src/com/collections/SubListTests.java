package com.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SubListTests {
	
	public static void main(String[] arg0){
		
		List<String> myList = new ArrayList<String>();
		myList.add("q");
		myList.add("qw");
		myList.add("qwe");
		myList.add("qwer");
		myList.add("qwert");
		myList.add("qwerty");
		myList.add("qwertyu");
		myList.add("qwertyui");
		myList.add("qwertyuio");
		myList.add("qwertyuiop");
		myList.add("qwertyuiopa");
		myList.add("qwertyuiopas");
		myList.add("qwertyuiopasd");
		myList.add("qwertyuiopasdf");
		myList.add("qwertyuiopasdfg");
		myList.add("qwertyuiopasdfgh");
		myList.add("qwertyuiopasdfghj");
		myList.add("qwertyuiopasdfghjk");
		myList.add("qwertyuiopasdfghjkl");
		myList.add("qwertyuiopasdfghjklz");
		myList.add("qwertyuiopasdfghjklzx");
		myList.add("qwertyuiopasdfghjklzxc");
		myList.add("qwertyuiopasdfghjklzxcv");
		myList.add("qwertyuiopasdfghjklzxcvb");
		myList.add("qwertyuiopasdfghjklzxcvbn");
		myList.add("qwertyuiopasdfghjklzxcvbnm");
		
		long startTime = System.nanoTime();
		int totalLenght = getTotalLengthRec(myList);
		long endTime = System.nanoTime();
		long total = endTime - startTime;
		System.out.println("Total time of getTotalLengthRec: " + total);
		
		startTime = System.nanoTime();
		totalLenght = getTotalLengthRec2(myList);
		endTime = System.nanoTime();
		total = endTime - startTime;
		System.out.println("Total time of getTotalLengthRec2: " + total);
		
		int i = 109;
		int a = i >> 1;
		int b = i >> 2;
		int c = i >> 3;
		int d = i << 1;
		int e = i << 2;
		int f = i << 3;
		
		int r = 0;
	
		Deque<Integer> dequeList = new LinkedList<Integer>();
//		dequeList.

	}

	public static int getTotalLengthRec(final List<String> lst) {
		if (lst.size() == 1)
			return lst.get(0).length();
		final int middle = lst.size() >> 1;
		return getTotalLengthRec(lst.subList(0, middle))
				+ getTotalLengthRec(lst.subList(middle, lst.size()));
	}

	public static int getTotalLengthRec2(final List<String> lst) {
		return getTotalLengthRecHelper(lst, 0, lst.size());
	}

	public static int getTotalLengthRecHelper(final List<String> lst,
			final int from, final int to) {
		if (to - from <= 1)
			return lst.get(from).length();
		final int middle = (from + to) >> 1;
		return getTotalLengthRecHelper(lst, from, middle)
				+ getTotalLengthRecHelper(lst, middle, to);
	}

}
