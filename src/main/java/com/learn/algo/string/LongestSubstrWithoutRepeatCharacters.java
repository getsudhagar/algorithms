package com.learn.algo.string;

import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. Example: Given "abcabcbb", the answer is "abc", which the length
 * is 3.
 */
public class LongestSubstrWithoutRepeatCharacters {

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//int asOfMaxIdx = 0;
		int asOfMaxLength = 0;
		int startIdx=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)){
				asOfMaxLength = Math.max(asOfMaxLength, i - startIdx);
				int endIdx = map.get(c)+1;
				for(int j=startIdx ;j<endIdx;j++){
					 map.remove(s.charAt(j));
				}
				startIdx =endIdx;
			}
            map.put(c, i);
		}
		// will miss last check if non repeated is last 
		asOfMaxLength = Math.max(asOfMaxLength, s.length() - startIdx);
		return asOfMaxLength;
	}
}
