package com.demo.app.to;

public abstract class Employee {

	private int empId;
	private String empName;
	private byte empAge;

	public abstract void work();
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public byte getEmpAge() {
		return empAge;
	}

	public void setEmpAge(byte empAge) {
		this.empAge = empAge;
	}
	
	@Override
	public String toString() {
		
		return "Employee Id : "+empId+"\nEmployee Name :"+empName+"\nEmployee Age : "+empAge;
	}

	@Override
	public boolean equals(Object o) {
		
		Employee e = (Employee)o;
		
		if(e.getEmpId() == this.getEmpId()) {
			return true;
		}
		return false;
	}
}
