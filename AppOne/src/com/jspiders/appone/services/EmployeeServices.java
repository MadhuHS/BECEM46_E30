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
      Database db = dbMgr.getDB("Employee");
      
      db.connect();//open connection to DB
      
      db.insert(emp);
      
      db.disconnect();//close connection of DB
      
	}

	public void UpdateEmployee(Employee emp)throws SQLException
	{
      Database db = dbMgr.getDB("Employee");
      
      db.connect();//open connection to DB
      
      db.update(emp);
      
      db.disconnect();//close connection of DB
      
	}

	public void viewEmployee() {

	}

	public void viewEmployees() {

	}

	public void deleteEmployee() {

	}
}



