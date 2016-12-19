
package com.learn.algo.string;

import java.util.HashMap;

/**
 * Ex :Given a string, find the longest substring that contains only two unique
 * characters. For example, given "abcbbbbcccbdddadacb", the longest substring
 * that contains 2 unique character is "bcbbbbcccb".
 */
public class LongestSubstrWdNUniqueChar {

	public String SubstrWdNChar(String input, int k) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int asOfMaxIdx = 0;
		int asOfMaxLength = 0;
		int currentIdx = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c));
			} else {
				map.put(c, 1);
			}

			if (map.size() > k) {

				// keep track of max length and start idx
				if (asOfMaxLength < i - currentIdx) {
					asOfMaxLength = i - currentIdx;
					asOfMaxIdx = currentIdx;
				}
				// remove greater than k to start new
				while (map.size() > k) {
					char d = input.charAt(currentIdx);
					int val = map.get(d);
					if (val > 1) {
						map.put(d, val - 1);
					} else {
						map.remove(d);
					}
					currentIdx++;
				}

			}

		}
		return new String(input.toCharArray(), asOfMaxIdx, asOfMaxIdx + asOfMaxLength);
	}

}
