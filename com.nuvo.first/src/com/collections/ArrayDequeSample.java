package com.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayDequeSample {
    public static void main(String[] args) {
        ArrayDeque<String> aDeque = new ArrayDeque<> (); 
        LinkedList<String> linkedList = new LinkedList<String>();
 

        aDeque.addFirst("tea");     
        aDeque.addFirst("milk");
        aDeque.addFirst("coffee");
        aDeque.addLast("sugar");    
 
           /* Iterate through elements in an ArrayDeque instance */
        for( Iterator itr =  aDeque.iterator(); itr.hasNext(); ) {    
            System.out.println(itr.next());    
        }
        System.out.println();
 
        aDeque.addFirst("juice");  
        aDeque.addLast("honey");

        System.out.println("First Element : " + aDeque.getFirst());    
        System.out.println("Last Element : " + aDeque.getLast());    

            /* Removal of the Deque Elements */
        System.out.println("First Element(Removed):"+aDeque.removeFirst());  
        System.out.println("Last Element Removed:"+aDeque.removeLast());    
    
        System.out.println("%nPopped Element : " + aDeque.pop());    
        System.out.println("%n Size of Array Deque: " + aDeque.size());   

    }
}
