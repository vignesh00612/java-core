package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {
	public static int longprefix(String str) {
		int n = str.length();
		int len = 0;

		for (int i = 0; i < n / 2; i++) {
			if (str.substring(0, i + 1).equals(str.substring(n - 1 - i, n))) {
				len = i + 1;
			}
		}

		return len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(longprefix(str));
	}

}
