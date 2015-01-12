package com.collections;

import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {
	
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
//		System.out.println("push(" + a + ")");
//		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
//		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
//		System.out.println(a);
//		System.out.println("stack: " + st);
	}
	
	static void pushToOtherStack(Stack<Integer> st1, Stack<Integer> st2){
		if (st1.empty()){
			return;
		}
		Integer currentValue = st1.pop();
		pushToOtherStack(st1, st2);
		st2.push(currentValue);
	}

	public static void main(String args[]) {
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();
		
		showpush(st1, 10);
		showpush(st1, 20);
		showpush(st1, 30);
		showpush(st1, 40);
		showpush(st1, 50);
		
		System.out.println("stack st1: " + st1);
		System.out.println("stack st2: " + st2);
		
		pushToOtherStack(st1,st2);
		System.out.println("stack st1: " + st1);
		System.out.println("stack st2: " + st2);
		
		while (!st2.empty()){
			st1.push(st2.pop());
		}
		
		System.out.println("stack st1: " + st1);
		System.out.println("stack st2: " + st2);
//		showpop(st);
//		showpop(st);
//		showpop(st);
//		try {
//			showpop(st);
//		} catch (EmptyStackException e) {
//			System.out.println("empty stack");
//		}
	}
}