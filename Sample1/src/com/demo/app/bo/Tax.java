package com.demo.app.bo;

import com.demo.app.to.Employee;
import com.demo.app.to.Engineer;
import com.demo.app.to.Manager;

public class Tax {
	
	public void calculateTax(Employee e) {
		
		if(e instanceof Manager) {
			System.out.println("Tax is 12%");
		} else if(e instanceof Engineer) {
			System.out.println("Tax is 5%");
		} else {
			System.out.println("No Tax");
		}
		
		System.out.println("Tax calculated");
	}
}
