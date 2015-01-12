package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConstructedString {

	public static void main(String[] arg0){
		String st1 = "abcdefghijklmaabbccdd";
		String st2 = "bfkdabbb";
		
		long startTime1 = System.nanoTime();
		boolean isContainsOne = isContainsOne(st1, st2);
		long endTime1 = System.nanoTime();	
		long totalTime1 = endTime1 - startTime1;
		
		long startTime2 = System.nanoTime();
		boolean isContainsTwo = isContainsTwo(st1, st2);
		long endTime2 = System.nanoTime();	
		long totalTime2 = endTime2 - startTime2;
		
		long startTime3 = System.nanoTime();
		boolean isContainsThree = isContainsThree(st1, st2);
		long endTime3 = System.nanoTime();	
		long totalTime3 = endTime3 - startTime3;
		
		System.out.println("Total time for first method: " + totalTime1 + "\nTotal time for second method: " + totalTime2+ "\nTotal time for third method: " + totalTime3);
	
		int i = 0;
		
	}
	
	public static List<Character> mapStringCharsToArray(String str){
		List<Character> mappedString = new ArrayList<Character>();
		for (char ch : str.toCharArray()){
			mappedString.add(ch);
		}
		return mappedString;
	}
	
	public static Map<Character,Integer> mapStringCharsToMap(String str){
		Map<Character,Integer> mappedString = new HashMap<Character,Integer>();
		for (char ch : str.toCharArray()){
			mappedString.put(ch, mappedString.containsKey(ch)? mappedString.get(ch) + 1 : 1);
		}
		return mappedString;
	}
	
	public static boolean isContainsOne(String st1, String st2){
		ArrayList<Character> mappedSt1 = (ArrayList<Character>) mapStringCharsToArray(st1);
		ArrayList<Character> mappedSt2 = (ArrayList<Character>) mapStringCharsToArray(st2);
		for( Character ch : mappedSt1){
			if (mappedSt2.isEmpty()){
				return true;
			}
			mappedSt2.remove(ch);
		}
		return mappedSt2.isEmpty();
	}
	
	public static boolean isContainsTwo(String st1, String st2){
		char[] ch1 = st1.toCharArray();
		
		for (char ch : st2.toCharArray()){
			int chIndex = st1.indexOf(ch);
			if (chIndex < 0){
				return false;
			}
			
			st1 = st1.replaceFirst(String.valueOf(ch), "*");		
		}
		return true;
	}
	
	public static boolean isContainsThree(String st1, String st2){
		Map<Character,Integer> mappedSt1 = mapStringCharsToMap(st1);
		Map<Character,Integer> mappedSt2 = mapStringCharsToMap(st2);
		for( Entry<Character,Integer> entry : mappedSt2.entrySet()){
			Character ch = entry.getKey();
			Integer chCounter = entry.getValue();
			Integer map1Counter = mappedSt1.get(ch);
			if (map1Counter == null || map1Counter < chCounter)
				return false;
		}
		return true;
	}
}
