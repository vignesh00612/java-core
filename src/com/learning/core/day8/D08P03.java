package com.learning.core.day08;

class CircularQueue {
	private static final int MAX_SIZE = 100;
	private int[] array;
	private int front;
	private int rear;

	public CircularQueue() {
		array = new int[MAX_SIZE];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return (front == 0 && rear == MAX_SIZE - 1) || (rear == (front - 1) % (MAX_SIZE - 1));
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue element " + item);
			return;
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % MAX_SIZE;
		}
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
			front = (front + 1) % MAX_SIZE;
		}
		return removedItem;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in circular queue: ");
		int i = front;
		do {
			System.out.print(array[i] + " ");
			i = (i + 1) % MAX_SIZE;
		} while (i != (rear + 1) % MAX_SIZE);
		System.out.println();
	}
}

public class D08P03 {
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue();
		queue.enqueue(14);
		queue.enqueue(13);
		queue.enqueue(22);
		queue.enqueue(-8);

		queue.display();

		int removedItem = queue.dequeue();
		System.out.println("After removing first element: ");
		queue.display();
	}
}
