package com.jspiders.appone.services;

import java.sql.SQLException;

import com.jspiders.appone.db.DataBaseManager;
import com.jspiders.appone.db.Database;
import com.jspiders.appone.enities.Employee;

public class EmployeeServices 
{
	private DataBaseManager dbMgr = new DataBaseManager();
	
	public void addEmployee(Employee emp)throws SQLException
	{
      System.out.println("adding employee");
      System.out.println(emp.getEmpFirstName());
      System.out.println(emp.getEmpLastName());
      
      Database db = dbMgr.getDB("Employee");
      
      db.connect();//open connection to DB
      
      db.insert(emp);
      
      db.disconnect();//close connection of DB
      
	}

	public void UpdateEmployee() {

	}

	public void viewEmployee() {

	}

	public void viewEmployees() {

	}

	public void deleteEmployee() {

	}
}
