package com.learning.core.day7;

class Node {
	double data;
	Node next;

	Node(double data) {
		this.data = data;
		this.next = null;
	}
}

public class D07P02 {
	private Node top;

	public D07P02() {
		this.top = null;
	}

	public void push(double data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public double pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return Double.NaN;
		} else {
			double poppedData = top.data;
			top = top.next;
			return poppedData;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void display() {
		Node current = top;
		System.out.print("The elements of the stack are: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		D07P02 stack = new D07P02();
		double[] input = { 10.0, 20.0, 30.0, 40.0 };

		for (double value : input) {
			stack.push(value);
		}

		stack.display();

		stack.pop();
		stack.pop();

		System.out.println("After popping twice:");
		stack.display();
	}
}
