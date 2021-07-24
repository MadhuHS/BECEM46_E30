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
		
		emp.setEmpID(1);
		emp.setEmpFirstName("Virat");
		emp.setEmpLastName("Kholi");
		emp.setEmpDeptID(1);
		emp.setEmpBasic(0);
		emp.setEmpContactNum("9989918181");
		emp.setEmpDateofBirth(new Date(111997));
		emp.setEmpDateofJoining(new Date(21242021));
		emp.setEmpDesignation("intern");
		emp.setEmpGrade("m1");
		emp.setEmpGender("M");
		emp.setEmpMaritalStatus("S");
		emp.setEmpHomeAddress("Bangalore");
		
		es.addEmployee(emp);
	}

	public static void main(String[] args)
	{
		try 
		{
			empAddTest();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}