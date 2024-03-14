package com.learning.core.day9;

import java.util.Scanner;

class MergeSort {
	public void sort(int arr[], int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;
			sort(arr, lb, mid);
			sort(arr, mid + 1, ub);
			merge(arr, lb, mid, ub);
		}
	}

	public void merge(int arr[], int lb, int mid, int ub) {
		int n1 = mid - lb + 1;
		int n2 = ub - mid;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[lb + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		int k = lb;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}

public class D09P02 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
