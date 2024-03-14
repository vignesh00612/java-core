package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {

	Stack<Integer> stack;
	Stack<Integer> minStack;

	public D07P06() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}

	public int pop() {
		int popped = stack.pop();
		if (popped == minStack.peek()) {
			minStack.pop();
		}
		return popped;
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		D07P06 stack = new D07P06();
		stack.push(16);
		stack.push(15);
		stack.push(29);
		stack.push(19);
		stack.push(18);

		System.out.println(stack.getMin());
	}
}
