package com.learning.core.day1;

import java.util.Scanner;

interface MedicineInfo {
	void displayLabel();

}

class Tablet implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Store Tablets in a cool dry place");
	}
}

class Syrup implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription");
	}
}

class Ointment implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Ointment is for external use only");
	}
}

public class D01P02 {

	public static void main(String[] args) {
		MedicineInfo[] med = new MedicineInfo[3];
		med[0] = new Tablet();
		med[1] = new Syrup();
		med[2] = new Ointment();

		for (MedicineInfo medicine : med) {
			medicine.displayLabel();
		}

	}

}
