package com.learning.core.day04;

class Applicant1 {
	String applicantName;
	String postApplied;
	int applicantAge;

	public Applicant1(String applicantName, String postApplied, int applicantAge) {
		this.applicantName = applicantName;
		this.postApplied = postApplied;
		this.applicantAge = applicantAge;
	}
}

class CatheyBankException extends Exception {
	public CatheyBankException(String message) {
		super(message);
	}
}

class InvalidNameException extends CatheyBankException {
	public InvalidNameException() {
		super("Invalid Applicant Name");
	}
}

class InvalidPostException extends CatheyBankException {
	public InvalidPostException() {
		super("Invalid Post");
	}
}

class InvalidAgeException extends CatheyBankException {
	public InvalidAgeException() {
		super("Invalid Age");
	}
}

public class D04P03 {

	public static void validate(Applicant1 applicant) throws CatheyBankException {
		if (!isValidApplicantName(applicant.applicantName)) {
			throw new InvalidNameException();
		} else if (!isValidPost(applicant.postApplied)) {
			throw new InvalidPostException();
		} else if (!isValidAge(applicant.applicantAge)) {
			throw new InvalidAgeException();
		} else {
			System.out.println("All details are valid");
		}
	}

	private static boolean isValidApplicantName(String name) {
		return name != null && !name.trim().isEmpty();
	}

	private static boolean isValidPost(String post) {
		return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
	}

	private static boolean isValidAge(int age) {
		return age >= 21 && age <= 30;
	}

	public static void main(String[] args) {
		try {
			Applicant1 applicant = new Applicant1("John Doe", "Probationary Officer", 8);
			validate(applicant);
		} catch (CatheyBankException e) {
			System.out.println(e.getMessage());
		}
	}
}
