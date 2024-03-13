package com.learning.core.day08;

class Queue {
	private static final int MAX_SIZE = 100;
	private int[] array;
	private int front;
	private int rear;

	public Queue() {
		array = new int[MAX_SIZE];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return rear == MAX_SIZE - 1;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue element " + item);
			return;
		}
		if (isEmpty()) {
			front = 0;
		}
		rear++;
		array[rear] = item;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue element.");
			return -1;
		}
		int removedItem = array[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		return removedItem;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in queue: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}

public class D08P01 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.display();

		int removedItem = queue.dequeue();
		System.out.println("After removing first element: ");
		queue.display();
	}
}
