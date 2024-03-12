package com.learning.core.day6;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class D06P14 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee> ht = new Hashtable<Integer, Employee>();
		Employee e1 = new Employee("Daniel", "Analyst", "L&D");
		Employee e2 = new Employee("Thomas", "Tester", "Testing");
		Employee e3 = new Employee("Robert", "Product Manager", "Development");
		Employee e4 = new Employee("Grace", "Tech Support", "HR");
		Employee e5 = new Employee("Charles", "QA Lead", "Testing");
		Employee e6 = new Employee("Henry", "Accountant", "Finance");
		ht.put(1001, e1);
		ht.put(1002, e2);
		ht.put(1003, e3);
		ht.put(1004, e4);
		ht.put(1005, e5);
		ht.put(1006, e6);
		TreeMap<Integer, Employee> tm = new TreeMap<>(Collections.reverseOrder());
		tm.putAll(ht);
		for (Entry<Integer, Employee> e : tm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}