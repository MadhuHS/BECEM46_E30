package com.jspiders.appone.enities;

public class Grade 
{
	private String gradeCode; 
	private String description; 
	private Integer minSalary;
	private Integer maxSalary;
	
	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Integer getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Grade(String gradeCode, String description, Integer minSalary, Integer maxSalary) {
		super();
		this.gradeCode = gradeCode;
		this.description = description;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	
	
	
	
}
