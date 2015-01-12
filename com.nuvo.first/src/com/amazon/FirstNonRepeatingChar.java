package com.amazon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        
    	Stream s1 = new Stream("abcdacd");
    	char seenOnceChar = getFirstSeeingOnceChar(s1);
    	System.out.println("First seen only once char: " + seenOnceChar);
    	
    	Stream s2 = new Stream("qwertjqwertqwerth");
    	seenOnceChar = getFirstSeeingOnceChar(s2);
    	System.out.println("First seen only once char: " + seenOnceChar);
    	
    	double q = (double) 1.56;
    	double w = (double) 1.36;
    	int i = (int) (q - q%1);
    	int j = (int) (w - w%1);

    	
    	int p = 0;
        
    }
    
    /*
     * Explanation:
     * 1. looping over given stream and put into LinkedHashMap all stream chars as keys 
     * and number of each char as value.
     * 2. Looping over linkedHashMap to find the first char with the value 1 (meaning this char seen only once in the stream)
     * and this will be the answer because LinkedHashMap keeps insertion order.
     * 3. complexity is going over all stream o(N) and fetch the first value of one from linkedhashmap is also o(N);
     * 
     */
    public static char getFirstSeeingOnceChar(Stream stream){
    	Map<Character,Integer> streamCharCount = new LinkedHashMap<>(); 
    	
    	while( !stream.isEnd() ){
    		char currnetChar = stream.getNextCharacter();
     		streamCharCount.put(currnetChar, streamCharCount.containsKey(currnetChar) ? streamCharCount.get(currnetChar) + 1 : 1); 
    	}
    	
    	for (Entry<Character,Integer> entry : streamCharCount.entrySet()) { 
    		if (entry.getValue() == 1) { return entry.getKey(); } 		
    	} 
    	
    	throw new RuntimeException("didn't find any non repeated Character");	
    }
    
}
