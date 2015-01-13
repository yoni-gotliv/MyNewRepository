package com.Dictionary;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DictionaryManager {

	//This is a test 2
	private Map<Character, CharNode> rootNodes = new HashMap<Character, CharNode>();
	Integer numberOfWords = 0;

	public DictionaryManager() {

	}

	public CharNode getRootNode(int nodeValue) {
		return rootNodes.get(nodeValue);
	}

	/**
	 * Insert a word into the dictionary.
	 * 
	 * @param string
	 *            The word to insert.
	 */
	public void insert(String string) {
		if (!rootNodes.containsKey(string.charAt(0))) {
			rootNodes.put(string.charAt(0), new CharNode());
		}

		insertWord(string.substring(1), rootNodes.get(string.charAt(0)));
	}

	// Recursive method that inserts a new word into the trie tree.
	private void insertWord(String string, CharNode node) {
		if (string.length() == 0) {
			node.endOfWord = true;
			return;
		} else {
			final CharNode nextChild;
			if (node.children.containsKey(string.charAt(0))) {
				nextChild = node.children.get(string.charAt(0));
			} else {
				nextChild = new CharNode();
				node.children.put(string.charAt(0), nextChild);
			}
			insertWord(string.substring(1),nextChild);

		}
		// if (string.length() == 1) {
		// nextChild.endOfWord = true;
		// return;
		// } else {
		// insertWord(string.substring(1),nextChild);
		// }
	}
	
	/**
	 * Search through the dictionary for a word.
	 * 
	 * @param string
	 *            The word to search for.
	 * @return Whether or not the word exists in the dictionary.
	 */
	public boolean search(String string) {
		if (rootNodes.containsKey(string.charAt(0))) {
			if (string.length() == 1
					&& rootNodes.get(string.charAt(0)).endOfWord) {
				return true;
			}
			return searchFor(string.substring(1),
					rootNodes.get(string.charAt(0)));
		} else {
			return false;
		}
	}

	// Recursive method that searches through the Trie Tree to find the value.
	private boolean searchFor(String string, CharNode node) {
		if (string.length() == 0) {
			if (node.endOfWord) {
				return true;
			} else {
				return false;
			}
		}

		if (node.children.containsKey(string.charAt(0))) {
			return searchFor(string.substring(1),
					node.children.get(string.charAt(0)));
		} else {
			return false;
		}
	}
	
	public List<String> searchWordsByPrefix(String prefix) {
		List<String> allWordsByPrefix = new ArrayList<String>();
		int index = 0;
		char rootChar = prefix.charAt(index);
		CharNode rootSearchNode = rootNodes.get(rootChar);
		if (rootSearchNode != null) {
			index++;
			while (index < prefix.length()){
				rootSearchNode = rootSearchNode.children.get(prefix.charAt(index));
				if (rootSearchNode == null){
					break;
				}
				index++;
			}
			searchWordsByStartingNode(prefix, rootSearchNode, allWordsByPrefix);
		}
		return allWordsByPrefix;
	}
	
	public void searchWordsByStartingNode(String prefix, CharNode startNode, List<String> allWordsByPrefix){
		if (startNode == null){
			return;
		}
		if (startNode.endOfWord){
			allWordsByPrefix.add(prefix);
		}
		for (Entry<Character, CharNode> entry : startNode.children.entrySet()) {
			searchWordsByStartingNode(prefix + entry.getKey(), entry.getValue(), allWordsByPrefix);
		}
	}
	
	public int getNumberOfWords(){
		for (CharNode node : rootNodes.values()){
			getNumberOfWords(node);
		}
		return numberOfWords;
	}
	
	public void getNumberOfWords(CharNode node){
		if (node == null){
			return;
		}
		if( node.endOfWord ){
			numberOfWords++;
		}
		for (CharNode child : node.children.values()){
			getNumberOfWords(child);
		}
	}
	 
	// public void addWord(String word){
	// int index = 0;
	// char rootChar = word.charAt(index);
	// CharNode rootNode = rootNodes.get((int) rootChar);
	// if (rootNode == null){
	// rootNode = new CharNode(rootChar);
	// rootNodes.put((int) rootChar, rootNode);
	// }
	// index++;
	// if (index < word.length()){
	// rootNode.addWord(word,index);
	// }else {
	// rootNode.setWord(true);
	// }
	// }
	//
//	 public List<String> getWordsByPrefix(String prefix){
//	 List<String> allWordsByPrefix = new ArrayList<String>();
//	 int index = 0;
//	 char rootChar = prefix.charAt(index);
//	 CharNode rootNode = rootNodes.get((int) rootChar);
//	 if (rootNode != null){
//	 index++;
//	 rootNode.getWordsByPrefix(prefix, index, allWordsByPrefix);
//	 }
//	 return allWordsByPrefix;
//	 }

}
