package com.demo.app.to;

public class Engineer extends Employee {

	private String reportingName;
	private String currentProject;

	public String getReportingName() {
		return reportingName;
	}

	public void setReportingName(String reportingName) {
		this.reportingName = reportingName;
	}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	@Override
	public void work() {
		
		System.out.println("Engineer is working");
	}

}
