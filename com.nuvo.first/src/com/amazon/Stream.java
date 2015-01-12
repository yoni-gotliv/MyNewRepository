package com.amazon;


public class Stream {

	private String stream;
	boolean isEnd = false;
	private int currentIndex = 0;
	
	
	public Stream(String stream){
		this.stream = stream;	
	}
	
	public char getNextCharacter(){
		char currentChar = stream.charAt(currentIndex);
		currentIndex++;
		if (currentIndex > stream.length()-1){
			isEnd = true;
		}
		return currentChar;
	};

	public boolean isEnd(){
		return isEnd;
	};

}
