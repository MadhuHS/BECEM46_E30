package com.jspiders.appone.test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.appone.db.EmployeeDB;
import com.jspiders.appone.enities.Employee;
import com.jspiders.appone.services.EmployeeServices;

public class AppOneTest 
{
	static EmployeeServices es = new EmployeeServices();
	public static void empDbTest() 
	{
		EmployeeDB edb = new EmployeeDB();
		edb.connect();
		edb.disconnect();
	}
	
	public static void empAddTest()throws SQLException 
	{
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
		Employee emp = es.viewEmployee(9);
		System.out.println(emp.toString());
	}
	

	public static void getAllEmployees()throws SQLException
	{
		List<Employee> emplist = es.viewEmployees();
		
		for (int i = 0; i <emplist.size() ; i++)
		{
			System.out.println(emplist.get(i));
		}
	}
	
	public static void empAddAllTest()throws SQLException 
	{
		Employee emp = new Employee();
		emp.setEmpID(7001);
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
		
		Employee emp2 = new Employee();
		emp2.setEmpID(7003);
		emp2.setEmpFirstName("Arun");
		emp2.setEmpLastName("M");
		emp2.setEmpDeptID(1);
		emp2.setEmpBasic(0);
		emp2.setEmpContactNum("787819281");
		emp2.setEmpDateofBirth(new Date(111997));
		emp2.setEmpDateofJoining(new Date(21242021));
		emp2.setEmpDesignation("intern");
		emp2.setEmpGrade("m1");
		emp2.setEmpGender("M");
		emp2.setEmpMaritalStatus("S");
		emp2.setEmpHomeAddress("Bangalore");
		
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(emp);
		elist.add(emp2);
		
		es.addAllEmployees(elist);
	}

	public static void main(String[] args)
	{
		try 
		{
			empAddAllTest();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
