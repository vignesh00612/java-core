package com.learning.core.day5;

import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person4(int id, String name, int age, double salary) {
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

	public int compareTo(Person4 person) {
		return Integer.compare(this.id, person.id);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person4 person = (Person4) obj;
		return id == person.id;
	}

	public int hashCode() {
		return Integer.hashCode(id);
	}

	public String toString() {
		return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}
}

public class D05P10 {
	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(1, "Alice", 30, 5000));
		personSet.add(new Person(2, "Bob", 35, 6000));
		personSet.add(new Person(3, "Charlie", 25, 4000));
		personSet.add(new Person(4, "Jonas", 22, 6999));
		personSet.add(new Person(5, "Emily", 28, 5500));
		personSet.add(new Person(6, "Jack", 40, 7500));

		for (Person person : personSet) {
			if (person.getName().startsWith("J")) {
				System.out.println(person);
				break;
			}
		}
	}
}
