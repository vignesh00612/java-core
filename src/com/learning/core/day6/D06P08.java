package com.learning.core.day6;

import java.util.TreeMap;

import java.util.*;

class Car implements Comparable<Car> {
	private String name;
	private double price;

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ": $" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Car car = (Car) obj;
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	}

	@Override
	public int compareTo(Car otherCar) {
		return Double.compare(this.price, otherCar.price);
	}
}

public class D06P08 {
	public static void main(String[] args) {

		TreeMap<Car, String> carDetails = new TreeMap<>();

		carDetails.put(new Car("Bugatti", 80050.0), "1");
		carDetails.put(new Car("Swift", 305000.0), "2");
		carDetails.put(new Car("Audi", 600100.0), "3");
		carDetails.put(new Car("Benz", 900000.0), "4");

		Map.Entry<Car, String> greatestEntry = carDetails.pollLastEntry();
		System.out.println(
				"Car with the greatest price removed: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

		System.out.println("Updated Car Details after removal:");
		for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
			System.out.println(entry.getValue() + ". " + entry.getKey());
		}
	}
}
