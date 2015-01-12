package com.Dictionary;

import java.util.List;

public class DictioaryDemo {

    public static void main(String[] args) {
        
    	DictionaryManager dictionaryManager = new DictionaryManager();

//    	manager.insert("a");
    	dictionaryManager.insert("aba");
    	dictionaryManager.insert("ama");
    	dictionaryManager.insert("abam");
    	dictionaryManager.insert("baba");
    	dictionaryManager.insert("bar");
    	
//    	String word = "a";
//    	boolean wordExist = manager.search(word);
//    	System.out.println("Does the word \"" + word + "\" exist? - " + wordExist);
//    	word = "aba";
//    	wordExist = manager.search(word);
//    	System.out.println("Does the word \"" + word + "\" exist? - " + wordExist);
//    	word = "bamaba";
//    	wordExist = manager.search(word);
//    	System.out.println("Does the word \"" + word + "\" exist? - " + wordExist);
//    	word = "abam";
//    	wordExist = manager.search(word);
//    	System.out.println("Does the word \"" + word + "\" exist? - " + wordExist);
    	
    	List<String> allWordsByPrefix = dictionaryManager.searchWordsByPrefix("a");
    	allWordsByPrefix = dictionaryManager.searchWordsByPrefix("ac");
    	allWordsByPrefix = dictionaryManager.searchWordsByPrefix("ab");
    	Integer numberOfWords = dictionaryManager.getNumberOfWords();
    	String y = "abcdefghij";
    	y.substring(0);
    	y.substring(0,4);
    	y.substring(2, 5);
    	y.substring(1,7);
//    	Arrays.sor

    	int i = 0;
    }
    
}
