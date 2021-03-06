package com.practice.constructor;

public class Employee {
	private String name;
	private int id;
	private String department;

	Employee() {

	}

	// 1 argument
	public Employee(String nameLocal) {
		this.name = nameLocal;

	}

	// 2 arguments
	public Employee(int id, String nameLocal) {
		this.id = id;
		this.name = nameLocal;

	}

	// 3 arguments
	public Employee(int id, String nameLocal, String department) {
		this(id, nameLocal);
		// this.id = id;
		this.department = department;
		// this.name = nameLocal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void printEmployeeInfo() {
		System.out.println("\nDemonstrating method");
		System.out.println(name + " " + department);

	}

	public void printEmployeeInfo(String joinDate) {
		System.out.println("\nDemonstrating method overloading below : ");
		System.out.println(name + " " + department + " " + joinDate);
		System.out.println(getEmpInfo()  + " " + joinDate);

	}
	
	private String getEmpInfo(){
		System.out.println("In getEmpInfo() ");

		return name + "  " + department;

	}
	
}
