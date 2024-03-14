package com.learning.core.day6;

import java.util.*;

import java.util.Hashtable;
import java.util.Map;

class Employee {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee(int id, String name, String department, String designation) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
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
		Employee employee = (Employee) obj;
		return id == employee.id;
	}
}

public class D06P10 {
	public static void main(String[] args) {

		Hashtable<Integer, Employee> employeeDetails = new Hashtable<>();

		employeeDetails.put(1001, new Employee(1001, "John Doe", "IT", "Software Engineer"));
		employeeDetails.put(1002, new Employee(1002, "Alice Smith", "HR", "HR Manager"));
		employeeDetails.put(1003, new Employee(1003, "Bob Johnson", "Finance", "Accountant"));
		employeeDetails.put(1004, new Employee(1004, "Emily Brown", "Marketing", "Marketing Manager"));

		System.out.println("Is the Hashtable empty? " + employeeDetails.isEmpty());
	}
}
