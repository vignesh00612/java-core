package com.learning.core.day9;

import java.util.Scanner;

public class D09P01 {
	public static int partition(int arr[], int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while (start < end) {
			start = start + 1;
			while (start <= ub && arr[start] < pivot) {
				start++;
			}
			while (end >= lb && arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}

		}
		int temp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp;
		return end;
	}

	public static void quicksort(int arr[], int lb, int ub) {
		int loc;
		if (lb < ub) {
			loc = partition(arr, lb, ub);
			quicksort(arr, lb, loc - 1);
			quicksort(arr, loc + 1, ub);
		}
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
		quicksort(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
