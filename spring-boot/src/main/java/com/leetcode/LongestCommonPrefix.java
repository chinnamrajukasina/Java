package com.leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String result = longestCommonPrefix(strs);
		System.out.println("Output: " + result);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return ""; // Return an empty string if the array is empty or null.
		}

		int minLength = Integer.MAX_VALUE;

		// Find the minimum length among all strings
		for (String str : strs) {
			minLength = Math.min(minLength, str.length());
		}

		// Compare characters at the same position in each string
		for (int i = 0; i < minLength; i++) {
			char currentChar = strs[0].charAt(i);

			for (String str : strs) {
				if (str.charAt(i) != currentChar) {
					return strs[0].substring(0, i); // Found the common prefix
				}
			}
		}

		return strs[0].substring(0, minLength); // All characters matched up to the minimum length
	}
}
