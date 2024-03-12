package com.learning.core.day6;

public class Employee {
	package com.learning.core.day6;

	import java.util.Objects;

	int employeeid;
	String name;
	String dept;
	String desig;

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
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, desig, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(desig, other.desig)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name + " " + dept + " " + desig;
	}

	public Employee() {
		super();
	}

	public Employee(String name, String dept, String desig) {
		super();
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}

}
