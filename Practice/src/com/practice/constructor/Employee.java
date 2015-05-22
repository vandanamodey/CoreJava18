package com.practice.constructor;

public class Employee {
	private String name;
	private int id;
	private String department;
	
	
	Employee(){
		
	}
	
	// 1 argument
	public Employee (String nameLocal){
		this.name = nameLocal;
		
	}
	
	//2 arguments
	public Employee (int id, String department){
		this.id = id;
		this.department = department;
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
	
	
}