package com.learning.core.day03;

import java.util.Scanner;

public class D03P08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		int minDeletions = findMinDeletionsForPalindrome(str);

		System.out.println("Min deletions required to make it a palindrome: " + minDeletions);
	}

	public static int findMinDeletionsForPalindrome(String str) {
		int n = str.length();

		int[][] dp = new int[n][n];

		for (int i = 0; i < n; i++) {
			dp[i][i] = 0;
		}
		for (int len = 2; len <= n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				if (str.charAt(i) == str.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[0][n - 1];
	}

}
