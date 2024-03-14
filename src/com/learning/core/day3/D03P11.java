package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D03P11 {

	public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
		List<String> matchingStrings = new ArrayList<>();
		Pattern p = Pattern.compile(pattern);

		for (String word : dictionary) {
			Matcher m = p.matcher(word);
			if (m.matches()) {
				matchingStrings.add(word);
			}
		}

		return matchingStrings;
	}

	public static void main(String[] args) {
		String[] dictionary = { "abb", "abc", "xyz", "xyy", "foo" };
		String pattern = "abb|xyy";

		List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

		System.out.println("Strings matching the pattern '" + pattern + "':");
		for (String str : matchingStrings) {
			System.out.println(str);
		}

	}

}
