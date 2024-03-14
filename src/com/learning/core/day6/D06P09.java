package com.learning.core.day6;

import java.util.TreeMap;

class Car1 implements Comparable<Car1> {
	private String name;
	double price;

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
		TreeMap<Car1, Double> carTreeMap = new TreeMap<>();

		Car1 bugatti = new Car1("Bugatti", 80050.0);
		Car1 swift = new Car1("Swift", 305000.0);
		Car1 bmw = new Car1("BMW", 600100.0);
		Car1 audi = new Car1("Audi", 500000.0);

		carTreeMap.put(bugatti, bugatti.price);
		carTreeMap.put(swift, swift.price);
		carTreeMap.put(bmw, bmw.price);
		carTreeMap.put(audi, audi.price);

		double newPrice = 80050.0;
		Car1 specifiedCar = carTreeMap.floorKey(new Car1("", newPrice));

		if (specifiedCar != null) {
			carTreeMap.replace(specifiedCar, newPrice);
			System.out.println(specifiedCar + " using simple java program");
		} else {
			System.out.println("No car found with the specified price.");
		}
	}
}
