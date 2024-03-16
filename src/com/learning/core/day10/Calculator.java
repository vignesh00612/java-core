package com.learning.core.day10;

public class Calculator {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args)
	{
		add(10,20);
		sub(5,3);
	}
	public static int mul(int a, int b)
	{
	  return a*b;	
	}
	public static int div(int a ,int b)
	{
		return a/b;
	}
	public static int findMax(int[] arr)
	{
		int max=0;
		for(int i =0;i< arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
}