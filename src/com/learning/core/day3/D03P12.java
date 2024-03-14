package com.learning.core.day3;

import java.util.Scanner;

public class D03P12 {

	public static boolean canSplit(String str) {
		int length = str.length();
		if (length % 4 != 0) {
			return false;
		}

		int seglen = length / 4;
		String segments[] = new String[4];

		for (int i = 0; i < length; i = i + seglen) {
			int Index = i / seglen;
			segments[Index] = str.substring(i, i + seglen);

			for (int j = 0; j < Index; j++) {
				if (segments[j].equals(segments[Index])) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean res = canSplit(str);

		if (res) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
