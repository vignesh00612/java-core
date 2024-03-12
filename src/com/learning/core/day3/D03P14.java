package com.learning.core.day03;
import java.util.Scanner;
import java.util.Arrays;

public class D03P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int a[] = new int[num1];
		for (int i = 0; i < num1; i++) {
			a[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int b[] = new int[num2];
		for (int i = 0; i < num2; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);

		Union(a, b, num1, num2);
		intersection(a, b, num1, num2);

	}

	public static void Union(int[] a, int[] b, int n, int m) {

		int result[] = new int[n + m];

		int index = 0;
		int left = 0, right = 0;
		while (left < n && right < m) {

			if (a[left] < b[right]) {
				if (index != 0 && a[left] == result[index - 1]) {
					left++;
				} else {
					result[index] = a[left];
					left++;
					index++;
				}
			} else {
				if (index != 0 && b[right] == result[index - 1]) {
					right++;
				} else {
					result[index] = b[right];
					right++;
					index++;
				}
			}
		}

		while (left < n) {
			if (index != 0 && a[left] == result[index - 1]) {
				left++;
			} else {
				result[index] = a[left];
				left++;
				index++;
			}
		}

		while (right < m) {
			if (index != 0 && b[right] == result[index - 1]) {
				right++;
			} else {
				result[index] = b[right];
				right++;
				index++;
			}
		}

		System.out.print("Union: ");
		for (int k = 0; k < index; k++) {
			System.out.print(result[k] + " ");
		}

		System.out.println("");
	}

	public static void intersection(int[] a, int[] b, int n, int m) {

		int i = 0, j = 0, k = 0;
		int[] result = new int[n + m];
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				i++;
			}

			else if (a[i] > b[j]) {
				j++;
			} else {
				if (k != 0 && a[i] == result[k - 1]) {
					i++;
					j++;
				} else {
					result[k] = a[i];
					i++;
					j++;
					k++;
				}
			}
		}
		System.out.print("Intersection: ");
		for (int x = 0; x < k; x++) {
			System.out.print(result[x] + " ");
		}

		System.out.println();
	}

}
