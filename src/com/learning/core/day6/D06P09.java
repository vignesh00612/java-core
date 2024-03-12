package com.learning.core.day6;

import java.util.TreeMap;

class Car1 implements Comparable<Car1> {
	private String name;
	private double price;

	public Car1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Car1 car = (Car1) obj;
		return name.equals(car.name);
	}

	@Override
	public int compareTo(Car1 otherCar) {
		return Double.compare(this.price, otherCar.price);
	}
}

public class D06P09 {
	public static void main(String[] args) {
		TreeMap<Car, Double> carTreeMap = new TreeMap<>();

		// Predefined information of 4 cars
		Car bugatti = new Car("Bugatti", 80050.0);
		Car swift = new Car("Swift", 305000.0);
		Car bmw = new Car("BMW", 600100.0);
		Car audi = new Car("Audi", 500000.0);

		// Storing cars in the TreeMap using their natural ordering (price)
		carTreeMap.put(bugatti, bugatti.price);
		carTreeMap.put(swift, swift.price);
		carTreeMap.put(bmw, bmw.price);
		carTreeMap.put(audi, audi.price);

		// Performing the specified operation: Replace the value mapped by the specified
		// key with the new value
		double newPrice = 80050.0;
		Car specifiedCar = carTreeMap.floorKey(new Car("", newPrice)); // Finding the floor key for the specified price
		if (specifiedCar != null) {
			carTreeMap.replace(specifiedCar, newPrice);
			System.out.println(specifiedCar + " using simple java program");
		} else {
			System.out.println("No car found with the specified price.");
		}
	}
}
