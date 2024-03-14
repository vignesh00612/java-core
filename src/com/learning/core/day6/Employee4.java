package com.learning.core.day6;

import java.util.Objects;

public class Employee4 {

	int employeeid;
	String name;
	String dept;
	String design;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return design;
	}

	public void setDesig(String desig) {
		this.design = design;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, design, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee4 other = (Employee4) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(design, other.design)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name + " " + dept + " " + design;
	}

	public Employee4() {
		super();
	}

	public Employee4(String name, String dept, String design) {
		super();
		this.name = name;
		this.dept = dept;
		this.design = design;
	}

}
