package com.learning.core.day7;

import java.util.Stack;

public class D07P03 {
	public static String reverseString(String input) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}

		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		String input = "JavaQuiz";
		String reversed = reverseString(input);
		System.out.println(reversed);
	}
}
