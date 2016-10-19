package com.learn.algo.string;

/***
 * Algorithm for O(m+n)
 *
 ***/
public class SubsStringSearch {
	public int findIndexOfPatterninString(String inputText, String pattern) {
		int patternSize = pattern.length() - 1;
		int[] kmpTable = new int[patternSize];
		int j = 0;
		// Build Table;
		for (int i = 1; i <= pattern.length() - 1; i++) {
			while (j > 0 && (pattern.charAt(i) != pattern.charAt(j))) {
				j = kmpTable[j - 1];
			}
			if (pattern.charAt(i) == pattern.charAt(j)) {
				j++;
				kmpTable[i] = j;
			}
		}
		//Search
		int inputPointer = 0;
		int patternPointer = 0;
		while (((inputPointer + patternSize)-patternPointer) < inputText.length()) {
			if (inputText.charAt(inputPointer) == pattern.charAt(patternPointer)) {
				if (patternPointer == patternSize) {
					return inputPointer - patternPointer;
				}
				inputPointer++;
				patternPointer++;
			} else {
				if (patternPointer != 0) {
					patternPointer = kmpTable[patternPointer - 1];
				} else {
					inputPointer++;
				}

			}
		}
		return -1;

	}
}
