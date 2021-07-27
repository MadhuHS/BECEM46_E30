package com.jspiders.appone.test;

import java.sql.Date;
import java.sql.SQLException;

import com.jspiders.appone.db.EmployeeDB;
import com.jspiders.appone.enities.Employee;
import com.jspiders.appone.services.EmployeeServices;

public class AppOneTest 
{
	public static void empDbTest() 
	{
		EmployeeDB edb = new EmployeeDB();
		edb.connect();
		edb.disconnect();
	}
	
	public static void empAddTest()throws SQLException 
	{
		EmployeeServices es = new EmployeeServices();
		
		Employee emp = new Employee();
		
		emp.setEmpID(90);
		emp.setEmpFirstName("Arun");
		emp.setEmpLastName("M");
		emp.setEmpDeptID(1);
		emp.setEmpBasic(0);
		emp.setEmpContactNum("787819281");
		emp.setEmpDateofBirth(new Date(111997));
		emp.setEmpDateofJoining(new Date(21242021));
		emp.setEmpDesignation("intern");
		emp.setEmpGrade("m1");
		emp.setEmpGender("M");
		emp.setEmpMaritalStatus("S");
		emp.setEmpHomeAddress("Bangalore");
		
		es.addEmployee(emp);
	}
	

	public static void empUpdateTest()throws SQLException 
	{
		EmployeeServices es = new EmployeeServices();
		
		Employee emp = new Employee();
		
		emp.setEmpID(9);
		emp.setEmpFirstName("AB");
		emp.setEmpLastName("DEV");
		emp.setEmpDeptID(1);
		emp.setEmpBasic(0);
		emp.setEmpContactNum("9876543210");
		emp.setEmpDesignation("MANAGER");
		emp.setEmpGrade("m1");
		emp.setEmpGender("M");
		emp.setEmpMaritalStatus("S");
		emp.setEmpHomeAddress("Bangalore");
		
		es.UpdateEmployee(emp);
	}
	
	public static void getEmployee()throws SQLException
	{
		EmployeeServices es = new EmployeeServices();
		Employee emp = es.viewEmployee(9);
		System.out.println(emp);
	}

	public static void main(String[] args)
	{
		try 
		{
			getEmployee();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
