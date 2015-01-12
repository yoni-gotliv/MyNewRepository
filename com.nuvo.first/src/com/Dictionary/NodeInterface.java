package com.Dictionary;

import java.util.List;

public interface NodeInterface {

	public CharNode getNodeByValue(char charValue);
	
	public void addWord(String word, int index);
	
	public void getWordsByPrefix(String prefix, int index, List<String> allWordsByPrefix);
}
