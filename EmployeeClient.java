package com.kpmg.oops;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(111);
		emp.setEmpName("mahesh");
		emp.setEmpAdd("delhi");
		emp.setEmpSal(23000);
		
		System.out.println(emp.toString());
	}
}
