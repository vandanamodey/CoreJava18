package com.practice.constructor;

// Assignment to use Constructor with different arguements

public class Company {

	public static void main(String[] args) {

		Employee emp1 = new Employee(001, "Judy");
		System.out.println("Employee #1  ID : " + emp1.getId() + " Name : "
				+ emp1.getName());

		Employee emp2 = new Employee(002, "Joanna");
		System.out.println("Employee #2  ID : " + emp2.getId() + " Name : "
				+ emp2.getName());

		Employee emp3 = new Employee(003, "Jackson", "ACCOUNTS");
		System.out.println("Employee #3  ID : " + emp3.getId() + " Dept : "
				+ emp3.getDepartment());
		
		Employee empMethodDemo = new Employee(101,"Kelly","SALES");
		empMethodDemo.printEmployeeInfo();
		empMethodDemo.printEmployeeInfo("8/10/2012");
		
		
		
		

	}

}
