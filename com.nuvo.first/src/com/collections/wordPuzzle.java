package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wordPuzzle {

	public static List<LinkedHashSet> allPossibleAnswers = new ArrayList<LinkedHashSet>();
	public static Map<Character, Set<Integer>> charPerSetMap = new HashMap<Character, Set<Integer>>();

	public static void main(String[] arg0) {

		Character[] firstList = { 'a', 'b', 'd', 'e', 'm' };
		Character[] secondList = { 'e', 'f', 'h', 'c', 'l', 'n' };
		Character[] thirdList = { 'o', 'a', 'z', 'p', 'd', 'o' };
		Character[] forthList = { 'i', 'l', 'd', 'c', 'o', 'p' };
		Character[] fifthList = { 'b', 'f', 'o', 'n', 'g', 'k', 'v' };
		Map<Integer, Character[]> allCharLists = new HashMap<Integer, Character[]>();
		allCharLists.put(1, firstList);
		allCharLists.put(2, secondList);
		allCharLists.put(3, thirdList);
		allCharLists.put(4, forthList);
		allCharLists.put(5, fifthList);
		mapAllLists(allCharLists);

		String word1 = "zoo";
		startMapAllPossibleCombinations(word1);

		for (LinkedHashSet<Integer> list : allPossibleAnswers) {
			System.out.println(list);
		}

		List<LinkedHashSet<Integer>> generatedWordPossibilities = generateWordPossibilities(word1);
		for (LinkedHashSet<Integer> list1 : generatedWordPossibilities) {
			System.out.println(list1);
		}

	}

	public static void mapAllLists(Map<Integer, Character[]> allCharLists) {
		for (Integer index : allCharLists.keySet()) {
			Character[] currList = allCharLists.get(index);
			for (int i = 0; i < currList.length; i++) {
				Character currChar = currList[i];
				Set<Integer> currSet = charPerSetMap.get(currChar);
				charPerSetMap
						.put(currChar,
								charPerSetMap.get(currChar) == null ? new HashSet<Integer>()
										: charPerSetMap.get(currChar));
				charPerSetMap.get(currChar).add(index);
			}
		}
	}

	public static void startMapAllPossibleCombinations(String word) {
		Character firstChar = word.charAt(0);
		Set<Integer> allCharPossibleIndexes = charPerSetMap.get(firstChar);
		if (allCharPossibleIndexes == null) {
			return;
		}
		for (Integer index : allCharPossibleIndexes) {
			LinkedHashSet<Integer> currSet = new LinkedHashSet<Integer>();
			currSet.add(index);
			mapAllPossibleCombinations(word.substring(1), currSet);
		}
	}

	public static void mapAllPossibleCombinations(String word,
			LinkedHashSet<Integer> indexesSoFar) {
		if (word.isEmpty()) {
			allPossibleAnswers.add(indexesSoFar);
			return;
		}
		Character firstChar = word.charAt(0);
		Set<Integer> allCharPossibleIndexes = charPerSetMap.get(firstChar);
		if (allCharPossibleIndexes == null) {
			return;
		}
		for (Integer index : allCharPossibleIndexes) {
			if (!indexesSoFar.contains(index)) {
				LinkedHashSet<Integer> currSet = new LinkedHashSet<Integer>(
						indexesSoFar);
				currSet.add(index);
				// if (word.length() == 1) {
				// allPossibleAnswers.add(currSet);
				// }else {
				mapAllPossibleCombinations(word.substring(1), currSet);
				// }
			}
		}
	}

	public static List<LinkedHashSet<Integer>> generateWordPossibilities(
			String chosenWord) {
		List<LinkedHashSet<Integer>> results = new ArrayList<LinkedHashSet<Integer>>();

		if (chosenWord.isEmpty()) {
			results.add(new LinkedHashSet<Integer>());
			return results;
		}

		// get the encodings of the first character, iterate for all encodings
		// create passwords
		char firstChar = chosenWord.charAt(0);
		Set<Integer> allIntForChar = charPerSetMap.get(firstChar);

		List<LinkedHashSet<Integer>> possibilities = generateWordPossibilities(chosenWord
				.substring(1));

		for (Integer intForChar : allIntForChar) {
			for (LinkedHashSet<Integer> possibility : possibilities) {
				if (!possibility.contains(intForChar)) {
					LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
					result.add(intForChar);
					result.addAll(possibility);
					results.add(result);
				}

			}

		}

		return results;
	}
}
