package com.learning.core.day08;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	private Node front;
	private Node rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enqueue(int item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue element.");
			return -1;
		}
		int removedItem = front.data;
		if (front == rear) {
			front = null;
			rear = null;
		} else {
			front = front.next;
		}
		return removedItem;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in queue: ");
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class D08P02 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);

		queue.display();

		queue.dequeue();
		queue.dequeue();

		System.out.println("After removing two elements: ");
		queue.display();
	}
}
