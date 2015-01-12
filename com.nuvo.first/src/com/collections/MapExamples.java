package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples {

	public static void main(String[] arg0){
		
		Student st1 = new Student(7,"Harel","Gotliv");
		Student st2 = new Student(9,"Ori","Oved");
		Student st3 = new Student(8,"Beni","Far1");
		Student st4 = new Student(5,"Beni","Far");
		Student st5 = new Student(1,"Yoni","Gotliv");
		Student st6 = new Student(2,"Yossi","Ger");
		Student st7 = new Student(3,"Harel","Dav");
		Student st8 = new Student(4,"Ori","Lev");
		
		Map<String,Integer> myHashMap = new HashMap<String,Integer>();
		
		
		Map<Student,Integer> myMap = new HashMap<Student,Integer>();
		myMap.put(st1,1);
		myMap.put(st2,2);
		myMap.put(st3,3);
		myMap.put(st4,null);
		myMap.put(null, 8);
		
		Map<Student,Integer> myMapTable = new Hashtable<Student,Integer>();
		myMapTable.put(st1,1);
		myMapTable.put(st2,2);
		myMapTable.put(st3,3);
		myMapTable.put(st4,4);
		myMapTable.put(st5,5);
		myMapTable.put(st6,6);
		myMapTable.put(st7,7);
		myMapTable.put(st8,8);
		
		Map<Student,Integer> myLinkedMap = new LinkedHashMap<Student,Integer>();
		myLinkedMap.put(st1,1);
		myLinkedMap.put(st2,2);
		myLinkedMap.put(st3,3);
		myLinkedMap.put(st4,null);
		myLinkedMap.put(st5,5);
		myLinkedMap.put(st6,6);
		myLinkedMap.put(null,7);
		myLinkedMap.put(st8,8);
		
		Map<Integer,Integer> intMap = new HashMap<Integer,Integer>();
		intMap.put(1, 2);
		intMap.put(3, 4);
		intMap.put(5, 6);
		intMap.put(2, 7);
		intMap.put(8, 2);
		intMap.put(9, 10);
		intMap.put(6, 2);
		intMap.put(4, 11);
		
		for (Iterator<Entry<Student,Integer>> it = myLinkedMap.entrySet().iterator(); it.hasNext();){
			Entry<Student,Integer> entry = it.next();
			Student currentKey = entry.getKey();
			Integer currnetValue = entry.getValue();
		}
		
		System.out.println("intMap = " + intMap);

		intMap.values().removeAll(Collections.singleton(2));
		
		Map<String,List<Long>> map = new LinkedHashMap<String, List<Long>>(
				100, 0.75f, true) {
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean removeEldestEntry(
					Map.Entry<String, List<Long>> eldest) {
				return size() > 100;
			}
		};
		

		System.out.println("intMap = " + intMap);
		
	}
	

}
