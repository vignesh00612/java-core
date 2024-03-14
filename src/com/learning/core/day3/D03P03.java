package com.learning.core.day3;

import java.util.Arrays;
import java.util.Scanner;

public class D03P03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[18];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		int sum = 0;
		for (int i = 0; i <= 14; i++) {
			sum = sum + arr[i];
		}
		arr[15] = sum;
		int avg = sum / 14;
		arr[16] = avg;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		arr[17] = min;
		System.out.print(Arrays.toString(arr));

	}

}
