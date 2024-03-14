package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;

public class D08P04 {
	public static void main(String[] args) {
		Queue<String> queue1 = new LinkedList<>();
		queue1.add("Yellow");
		queue1.add("Green");
		queue1.add("Pink");
		queue1.add("Black");
		queue1.add("Blue");
		queue1.add("White");

		Queue<String> queue2 = new LinkedList<>();

		displayQueue(queue1);

		checkEmpty(queue1);

		displayQueue(queue2);

		checkEmpty(queue2);
	}

	public static void checkEmpty(Queue<String> queue) {
		if (queue.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Not Empty");
		}
	}

	public static void displayQueue(Queue<String> queue) {
		if (queue.isEmpty()) {
			System.out.println("[]");
			return;
		}
		for (String element : queue) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
