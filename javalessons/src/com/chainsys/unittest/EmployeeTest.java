package com.chainsys.unittest;

import classandmethods.Employee;

public class EmployeeTest {
	public static void testEmployee() {
	Employee firstEmployee=new Employee(1234);
	firstEmployee.setName("Vetriselvan");
	System.out.println(firstEmployee.getName());
	}
	public static void testCity() {
		Employee firstCity=new Employee(1234);
		firstCity.setCity("Karaikudi");
		System.out.println(firstCity.getCity());
	}
	public static void testSalary() {
		Employee firstEmployee= new Employee(1234);
		     firstEmployee.setSalary(25000);
				System.out.println(firstEmployee.getSalary());
	}

}
