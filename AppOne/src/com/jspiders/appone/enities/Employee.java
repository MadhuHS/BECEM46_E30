package com.jspiders.appone.enities;

public class Employee {

    private String  empID;
	private String  empFirstName;
	private String  empLastName;
	private String  empDateofBirth;
	private String  empDateofJoining;
	private Integer empDeptID;
	private String  empGrade;
	private String  empDesignation;
	private Integer empBasic;
	private String  empGender;
	private String  empMaritalStatus;
	private String  empHomeAddress;
	private String  empContactNum;

	public Employee(String empID, String empFirstName, String empLastName, String empDateofBirth,
			String empDateofJoining, Integer empDeptID, String empGrade, String empDesignation, Integer empBasic,
			String empGender, String empMaritalStatus, String empHomeAddress, String empContactNum) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empDateofBirth = empDateofBirth;
		this.empDateofJoining = empDateofJoining;
		this.empDeptID = empDeptID;
		this.empGrade = empGrade;
		this.empDesignation = empDesignation;
		this.empBasic = empBasic;
		this.empGender = empGender;
		this.empMaritalStatus = empMaritalStatus;
		this.empHomeAddress = empHomeAddress;
		this.empContactNum = empContactNum;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpDateofBirth() {
		return empDateofBirth;
	}

	public void setEmpDateofBirth(String empDateofBirth) {
		this.empDateofBirth = empDateofBirth;
	}

	public String getEmpDateofJoining() {
		return empDateofJoining;
	}

	public void setEmpDateofJoining(String empDateofJoining) {
		this.empDateofJoining = empDateofJoining;
	}

	public Integer getEmpDeptID() {
		return empDeptID;
	}

	public void setEmpDeptID(Integer empDeptID) {
		this.empDeptID = empDeptID;
	}

	public String getEmpGrade() {
		return empGrade;
	}

	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Integer getEmpBasic() {
		return empBasic;
	}

	public void setEmpBasic(Integer empBasic) {
		this.empBasic = empBasic;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpMaritalStatus() {
		return empMaritalStatus;
	}

	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}

	public String getEmpHomeAddress() {
		return empHomeAddress;
	}

	public void setEmpHomeAddress(String empHomeAddress) {
		this.empHomeAddress = empHomeAddress;
	}

	public String getEmpContactNum() {
		return empContactNum;
	}

	public void setEmpContactNum(String empContactNum) {
		this.empContactNum = empContactNum;
	}

}
