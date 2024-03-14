package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
	public static boolean search(int arr[], int key) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				flag = true;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter key to search:");
		int k = sc.nextInt();
		boolean b = search(arr, k);
		if (b == true) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is not Present");

		}

	}

}
