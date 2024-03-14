package com.learning.core.day6;


import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class D06P14 {
	public static void main(String[] args) {
		Hashtable<Integer, Employee4> ht = new Hashtable<Integer, Employee4>();
		Employee4 e1 = new Employee4("Daniel", "Analyst", "L&D");
		Employee4 e2 = new Employee4("Thomas", "Tester", "Testing");
		Employee4 e3 = new Employee4("Robert", "Product Manager", "Development");
		Employee4 e4 = new Employee4("Grace", "Tech Support", "HR");
		Employee4 e5 = new Employee4("Charles", "QA Lead", "Testing");
		Employee4 e6 = new Employee4("Henry", "Accountant", "Finance");
		ht.put(1001, e1);
		ht.put(1002, e2);
		ht.put(1003, e3);
		ht.put(1004, e4);
		ht.put(1005, e5);
		ht.put(1006, e6);
		TreeMap<Integer, Employee4> tm = new TreeMap<>(Collections.reverseOrder());
		tm.putAll(ht);
		for (Entry<Integer, Employee4> e : tm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}


