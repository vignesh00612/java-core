package com.learning.core.day05;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.id, person.id);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return id == person.id;
	}

	public int hashCode() {
		return Integer.hashCode(id);
	}

	public String toString() {
		return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}
}

public class D05P09 {
	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(1, "Alice", 30, 4500));
		personSet.add(new Person(2, "Bob", 35, 2500));
		personSet.add(new Person(3, "Charlie", 25, 4000));
		personSet.add(new Person(4, "Jonas", 22, 3000));
		personSet.add(new Person(5, "Emily", 28, 3994));
		personSet.add(new Person(6, "Jack", 40, 5000));

		double sumOfSalaries = 0;
		for (Person person : personSet) {
			sumOfSalaries += person.getSalary();
		}

		System.out.println(sumOfSalaries);
	}
}
