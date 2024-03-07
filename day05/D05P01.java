package com.learning.core.day05;

class Employee {
	String name;
	long phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int voterid;
	int employeeid;

	public Employee(String name, long phoneNo, int licenseNo, int voterid, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
		this.employeeid = employeeid;
	}

	public Employee(String name, long phoneNo, int licenseNo, String panCardNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.employeeid = employeeid;
	}

	public Employee(String name, long phoneNo, String passportNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
		this.employeeid = employeeid;
	}

	
	public String toString() {
		return "Employee [name=" + name + ", phoneNo=" + phoneNo + ", passportNo=" + passportNo + ", licenseNo="
				+ licenseNo + ", panCardNo=" + panCardNo + ", voterid=" + voterid + ", employeeid=" + employeeid
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

class Student {
	String name;
	long phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int voterid;

	public Student(String name, long phoneno, int licenseNo, int voterid) {
		super();
		this.name = name;
		this.phoneNo = phoneno;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
	}

	public Student(String name, long phoneno, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneNo = phoneno;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}

	public Student(String name, long phoneno, String passportNo) {
		super();
		this.name = name;
		this.phoneNo = phoneno;
		this.passportNo = passportNo;
	}


	public String toString() {
		return "Student [name=" + name + ", phoneno=" + phoneNo + ", passportNo=" + passportNo + ", licenseNo="
				+ licenseNo + ", panCardNo=" + panCardNo + ", voterid=" + voterid + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

class Register<T> {
	T obj;
	String registerid;

	public Register(T obj) {
		super();
		this.obj = obj;
	}

	
	public String generateRegisterId(int n) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}

public class D05P01 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Arun", 1234874599, "LA788338DG", 1001);
		Student s1 = new Student("Joseph", 1234874599, 2210, "SJLD1717K");
		Register<Employee> r1 = new Register<Employee>(e1);
	
		System.out.println(r1.generateRegisterId(9) +" "+ e1.name +" "+ e1.phoneNo +" "+e1.employeeid+" " + e1.passportNo);
		
	}

}