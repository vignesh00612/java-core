package com.learning.core.day7;

public class D07P01 {

	private int maxSize;
	private String[] stackArray;
	private int top;

	public D07P01(int size) {
		this.maxSize = size;
		this.stackArray = new String[maxSize];
		this.top = -1;
	}

	public void push(String value) {
		if (top < maxSize - 1) {
			top++;
			stackArray[top] = value;
			System.out.println("Pushed: " + value);
		} else {
			System.out.println("Stack Overflow");
		}
	}

	public String pop() {
		if (top >= 0) {
			String poppedValue = stackArray[top];
			top--;
			return poppedValue;
		} else {
			System.out.println("Stack Underflow");
			return null;
		}
	}

	public void display() {
		System.out.print("Stack: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		D07P01 stack = new D07P01(5);
		stack.push("Hello");
		stack.push("world");
		stack.push("Java");
		stack.push("Progamming");

		System.out.println("After Pushing 4 Elements:");
		stack.display();

		System.out.println("After a Pop:");
		stack.pop();
		stack.display();
	}
}
