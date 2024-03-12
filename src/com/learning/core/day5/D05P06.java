package com.learning.core.day05;

import java.util.Objects;
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
	public int hashCode() {
		return Objects.hash(id);
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
	public int compareTo(Person other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
	}
}

public class D05P06 {
	public static void main(String[] args) {

		Person person1 = new Person(5, "John", 32, 1999);
		Person person2 = new Person(6, "Tom", 42, 3999);

		TreeSet<Person> personSet = new TreeSet<>();
		personSet.add(person1);
		personSet.add(person2);

		for (Person person : personSet) {
			if (person.getAge() > 25) {
				System.out.println(person);
			}
		}
	}
}
