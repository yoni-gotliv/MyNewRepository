package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PasswordGeneration {

	public List<String> generatePasswords(String password,
			Map<Character, List<Character>> encodings) {
		List<String> results = new ArrayList<String>();

		if (password.isEmpty()) {
			results.add("");
			return results;
		}

		// get the encodings of the first character, iterate for all encodings
		// create passwords
		char firstChar = password.charAt(0);
		List<Character> firstCharEncodings = encodings.get(firstChar);

		// firstCharEncodings.add(firstChar);
		List<String> words = generatePasswords(password.substring(1), encodings);

		for (String word : words) {
			String result = firstChar + word;
			results.add(result);
		}

		for (Character firstCharEncoding : firstCharEncodings) {
			String result = "";
			for (String word : words) {
				result = firstCharEncoding + word;
				results.add(result);
			}

		}

		return results;
	}

	Map<Character, List<Character>> encodings = new HashMap<Character, List<Character>>();

	public PasswordGeneration() {
		encodings.put('a', Arrays.asList('1', '2', 'p', 'o', 'q'));
		encodings.put('b', Arrays.asList('2', 'y'));
		encodings.put('c', Arrays.asList('p'));
		encodings.put('d', Arrays.asList('4', 'a', 'm', 'n'));
		encodings.put('e', Arrays.asList('9', 'z', 'x'));
		List<String> generatedPasswords = generatePasswords("abcde", encodings);
		System.out.println(Arrays.toString(generatedPasswords.toArray()));
	}
	
	public static void main(String[] args){
		PasswordGeneration pg = new PasswordGeneration();
	}
}
