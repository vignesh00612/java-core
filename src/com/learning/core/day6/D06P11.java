package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee2 {
	private int id;
	private String name;
	private String department;
	private String designation;

	public Employee2(int id, String name, String department, String designation) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + designation + " " + department;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee2 employee = (Employee2) obj;
		return id == employee.id;
	}
}

public class D06P11 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1001, "Daniel", "L&D", "Analyst");
		Employee2 e2 = new Employee2(1002, "Thomas", "Testing", "Tester");
		Employee2 e3 = new Employee2(1003, "Robert", "Development", "Product Manager");
		Employee2 e4 = new Employee2(1004, "Grace", "HR", "Tech Support");
		Hashtable<Integer, Employee2> employeeTable = new Hashtable<>();
		employeeTable.put(e1.getId(), e1);
		employeeTable.put(e2.getId(), e2);
		employeeTable.put(e3.getId(), e3);
		employeeTable.put(e4.getId(), e4);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the employee id to search: ");
		int searchId = scanner.nextInt();
		Employee2 searchEmployee = employeeTable.get(searchId);
		if (searchEmployee != null) {
			System.out.println(searchEmployee);
		} else {
			System.out.println("Employee not found.");
		}
	}
}
