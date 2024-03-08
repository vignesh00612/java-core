package com.learning.core.day03;

import java.util.Scanner;

public class D03P04 {
	public static void index(int[] arr, int n) {
		int index = -1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(j);
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		n = sc.nextInt();
		int[] num = new int[18];
		for (i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		index(num, n);
	}

}
