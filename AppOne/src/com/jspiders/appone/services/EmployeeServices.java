package com.jspiders.appone.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.jspiders.appone.db.DataBaseManager;
import com.jspiders.appone.db.Database;
import com.jspiders.appone.enities.Employee;

public class EmployeeServices {
	private DataBaseManager dbMgr = new DataBaseManager();

	public void addEmployee(Employee emp) throws SQLException {
		Database db = dbMgr.getDB("Employee");

		db.connect();// open connection to DB

		db.insert(emp);

		db.disconnect();// close connection of DB

	}

	public void UpdateEmployee(Employee emp) throws SQLException {
		Database db = dbMgr.getDB("Employee");

		db.connect();// open connection to DB

		db.update(emp);

		db.disconnect();// close connection of DB

	}

	public Employee viewEmployee(Integer id) throws SQLException
	{
		Database db = dbMgr.getDB("Employee");

		db.connect();// open connection to DB

		Employee emp = db.read(id);

		db.disconnect();// close connection of DB

		return emp;
	}

	public List<Employee> viewEmployees() throws SQLException {
		
		Database db = dbMgr.getDB("Employee");

		db.connect();// open connection to DB

		List<Employee> emplist = db.readAll();

		db.disconnect();// close connection of DB
		
		return emplist;

	}
	
	public void addAllEmployees(List<Employee> emplist) throws SQLException {
		Database db = dbMgr.getDB("Employee");

		db.connect();// open connection to DB
		
		HashSet<Employee> hs1 =  new HashSet<Employee>(emplist);//remove all duplicates in emplist
		
		ArrayList<Employee> newEmplist = new ArrayList<Employee>(hs1);//convert hashSet to ArrayList
		
		System.out.println(emplist);
		System.out.println("HASHSET : "+hs1);
		System.out.println(newEmplist);
		
		db.insertAll(newEmplist);

		db.disconnect();// close connection of DB

	}


	public void viewEmployeesByDept(int deptId) {

	}

	public void deleteEmployee() {

	}
}



