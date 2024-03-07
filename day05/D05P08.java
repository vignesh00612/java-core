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

	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(this.id, otherPerson.id);
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Person person = (Person) obj;
		return id == person.id;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class D05P08 {
	public static void main(String[] args) {

		TreeSet<Person> personSet = new TreeSet<>();

		personSet.add(new Person(101, "Jerry", 30, 50000.0));
		personSet.add(new Person(102, "Smith", 28, 60000.0));
		personSet.add(new Person(103, "Popeye", 35, 55000.0));
		personSet.add(new Person(104, "Jones", 32, 52000.0));
		personSet.add(new Person(105, "John", 40, 70000.0));
		personSet.add(new Person(106, "Tom", 25, 48000.0));

		for (Person person : personSet) {
			String formattedName = person.getName().substring(0, 1).toUpperCase()
					+ person.getName().substring(1).toLowerCase();
			System.out.println(formattedName);
		}
	}
}
