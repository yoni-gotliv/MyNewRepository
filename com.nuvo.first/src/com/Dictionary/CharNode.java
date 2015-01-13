package com.Dictionary;

import java.util.TreeMap;

public class CharNode/* implements NodeInterface*/{
	//This is test 1
	public CharNode parent;
	public Boolean endOfWord = false; //Does this Node mark the end of a particular word?
	public TreeMap<Character,CharNode> children = new TreeMap<Character,CharNode>();
	
	
//	public CharNode(char charValue) {
//		super();
//		this.charValue = charValue;
//	}

//	public char getCharValue() {
//		return charValue;
//	}
//
//	public void setCharValue(char charValue) {
//		this.charValue = charValue;
//	}
//
//	public boolean isWord() {
//		return isWord;
//	}
//
//	public void setWord(boolean isWord) {
//		this.isWord = isWord;
//	}
//
//	public Map<Integer, CharNode> getSubNodes() {
//		return subNodes;
//	}
//
//	public void setSubNodes(Map<Integer, CharNode> subNodes) {
//		this.subNodes = subNodes;
//	}
//
//	public CharNode getNodeByValue(char charValue) {
//		int charIntValue = (int) charValue;
//		return subNodes.get(charIntValue);
//	}
//
//	public void addWord(String word, int index) {
//		if (index < word.length()){
//			char currentChar = word.charAt(index);
//			CharNode nextNode = subNodes.get((int) currentChar);
//			if (nextNode == null){
//				nextNode = new CharNode(currentChar);
//				subNodes.put((int) currentChar, nextNode);
//			}
//			index++;
//			nextNode.addWord(word, index);		
//		}else {
//			isWord = true;
//		}	
//	}
//
//	public void getWordsByPrefix(String prefix, int index,
//			List<String> allWordsByPrefix) {
//		if (index < prefix.length()){
//			char currentChar = prefix.charAt(index);
//			CharNode nextNode = subNodes.get((int) currentChar);
//			if (nextNode != null){
//				index++;
//				nextNode.getWordsByPrefix(prefix, index, allWordsByPrefix);	
//			}	
//		}else {
//			if (isWord){
//				allWordsByPrefix.add(prefix);
//			}
//			
//		}		
//	}

}
