package com.mtumer;

public class Employee {
	String name;
	String role;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		Employee emp1 = new Employee();
		
		emp1.setName("Murat");
		emp1.setRole("Developer");
		emp1.setSalary(1000.0);
		
		String str1 = ("Employee Name: " + emp1.getName() +"\n");
		String str2 = ("Employee Role: " + emp1.getRole() +"\n");
		String str3 = ("Employee Salary: $" + emp1.getSalary() +"\n" );
		
		return str1.concat(str2).concat(str3);
	}
		
}
