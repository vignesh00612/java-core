package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person2(int id, String name, int age, double salary) {
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

	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person2 person = (Person2) obj;
		return id == person.id;
	}

	@Override
	public int compareTo(Person2 other) {
		return Integer.compare(this.id, other.id);
	}
}

public class D05P07 {
	public static void main(String[] args) {

		Person person1 = new Person(1, "Jerry", 30, 999);
		Person person2 = new Person(2, "Smith", 25, 5999);
		Person person3 = new Person(3, "Popeye", 35, 2999);
		Person person4 = new Person(4, "Jones", 20, 6999);
		Person person5 = new Person(5, "John", 28, 1999);
		Person person6 = new Person(6, "Tom", 40, 3999);

		TreeSet<Person> personSet = new TreeSet<>();
		personSet.add(person1);
		personSet.add(person2);
		personSet.add(person3);
		personSet.add(person4);
		personSet.add(person5);
		personSet.add(person6);

		System.out.println("ID\tName\tSalary");
		for (Person person : personSet) {
			System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getSalary());
		}
	}
}
