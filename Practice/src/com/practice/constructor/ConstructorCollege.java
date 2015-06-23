package com.practice.constructor;

public class ConstructorCollege {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Kareena");
		emp1.setId(10);
		System.out.println(emp1.getName() + " " + emp1.getId());

		Employee emp2 = new Employee(30, "2arguments");
		emp2.setName("Vandana");
		System.out.println(emp2.getName());
		System.out.println(emp2.getId());
		System.out.println(emp2.getDepartment());

		getEmployeeInfo("Rajat");
		getEmployeeInfo("Rajat", "9");

		// System.out.println(getEmployeeInfo("Rajat"));

		System.out.println("called by emp1 obj as parameter");
		printEmployeeInfo(emp2);

		System.out.println("called by emp2 obj as parameter");
	}

	public static void getEmployeeInfo(String name) {
		System.out.println("Employee Info is  " + name);

	}

	public static void getEmployeeInfo(String name, String id) {
		System.out.println("Employee Info is  " + name + " and id is " + id);

	}

	public static void printEmployeeInfo(Employee emp) {
		System.out.println("Emp Info = " + emp.getName() + "Emp ID = "
				+ emp.getId());
	}

}

// ??? Class07 53:37
// System.out.println(emp1.getName() + " " + emp1.getId());
