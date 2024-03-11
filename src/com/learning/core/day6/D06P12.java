package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;
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


public class D06P12 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee> employees = new Hashtable<>();

		employees.put(1001, new Employee(1001, "Analyst", "Daniel", "L&D"));
		employees.put(1002, new Employee(1002, "Thomas", "Tester", "Testing"));
		employees.put(1003, new Employee(1003, "Rober", "Product Manager", "Developement"));
		employees.put(1004, new Employee(1004, "Grace", "Tech Support", "HR"));
		employees.put(1005, new Employee(1005, "Charles", "QA Leading", "Testing"));

//    Scanner sc=new Scanner(System.in);
//    int id=sc.nextInt();
//    System.out.println("Enter the name");
//    String name=sc.nextLine();
//    System.out.println("Enter the department");
//    String dep=sc.nextLine();
//    System.out.println("Enter the Description");
//    String des=sc.nextLine();
		int id = 1006;
		Employee em = new Employee(1006, "Tom", "Developer", "IT");

		if (!employees.contains(em)) {
			employees.put(id, em);
			System.out.println("New employee added: " + em);
		} else
			System.out.print("it is already exist");

	}
}
