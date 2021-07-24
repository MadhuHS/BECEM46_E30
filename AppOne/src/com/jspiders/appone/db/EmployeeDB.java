package com.jspiders.appone.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jspiders.appone.enities.Employee;

public class EmployeeDB implements Database {
	private static final String dbUrl = "jdbc:mysql://localhost:3306/AppOneDB";
	private static final String username = "root";
	private static final String password = "root";

	private Connection dbCon;
	private PreparedStatement prStmt;

	@Override
	public void connect() {
		try {
			dbCon = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connected to DB");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(Employee emp) throws SQLException
	{
      prStmt = dbCon.prepareStatement(EmpQueries.insetQuery);
      
      prStmt.setInt(1,emp.getEmpID());
      prStmt.setString(2,emp.getEmpFirstName());
      prStmt.setString(3,emp.getEmpLastName());
      prStmt.setDate(4,emp.getEmpDateofBirth());
      prStmt.setDate(5,emp.getEmpDateofJoining());
      prStmt.setInt(6,emp.getEmpDeptID());
      prStmt.setString(7,emp.getEmpGrade());
      prStmt.setString(8,emp.getEmpDesignation());
      prStmt.setInt(9,emp.getEmpBasic());
      prStmt.setString(10,emp.getEmpGender());
      prStmt.setString(11,emp.getEmpMaritalStatus());
      prStmt.setString(12,emp.getEmpHomeAddress());
      prStmt.setString(13,emp.getEmpContactNum());
      
      System.out.println(prStmt);
      
      prStmt.executeUpdate();
      System.out.println("Emp added to db");
	}

	@Override
	public void read() {

	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

	@Override
	public void disconnect() {
		try 
		{
			dbCon.close();
			System.out.println("Connection to DB closed");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void readAll() throws SQLException
	{
		
	}

}
