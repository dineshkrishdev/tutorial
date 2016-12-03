package com.demo.app.ui;

import com.demo.app.bo.EmployeeService;
import com.demo.app.bo.Tax;
import com.demo.app.to.Employee;
import com.demo.app.to.Engineer;
import com.demo.app.to.Manager;

public class EmployeeManagementApplication {

	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		Tax incomeTax = new Tax();
		
		Employee john = new Manager();
		john.setEmpId(101);
		john.setEmpName("John Smith");
		john.setEmpAge((byte)40);
		
		Employee smith = new Engineer();
		smith.setEmpId(102);
		smith.setEmpName("Will Smith");
		smith.setEmpAge((byte)30);
		
		incomeTax.calculateTax(john);
		incomeTax.calculateTax(smith);
		incomeTax.calculateTax(null);
		
	}
}
