package com.jspiders.appone.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public Employee read(Integer id)throws SQLException
	{
       prStmt = dbCon.prepareStatement(EmpQueries.selectQuery);
       prStmt.setInt(1, id);
       
       ResultSet rs = prStmt.executeQuery();
       
       rs.next();
       
       /*Integer empid = rs.getInt("Emp_ID");
       String firstname = rs.getString("Emp_First_Name");
       String lastname = rs.getString("Emp_Last_Name");
       String grade = rs.getString("Emp_Grade");
       String desg = rs.getString("Emp_Designation");*/
       
       Employee emp = new Employee();
       
       emp.setEmpID(rs.getInt("Emp_ID"));
       emp.setEmpFirstName(rs.getString("Emp_First_Name"));
       emp.setEmpLastName(rs.getString("Emp_Last_Name"));
       emp.setEmpGrade(rs.getString("Emp_Grade"));
       emp.setEmpDesignation(rs.getString("Emp_Designation"));
       
       
       prStmt = dbCon.prepareStatement(EmpQueries.selectDeptNameQuery);
       prStmt.setInt(1, rs.getInt("Emp_Dept_ID"));
       
       ResultSet rs2 = prStmt.executeQuery();
       rs2.next();
       String deptName = rs2.getString("Dept_Name");
       
       emp.setEmpDepartmentName(deptName);
       
       return emp;
	}
	
	@Override
	public List<Employee> readAll() throws SQLException
	{
		prStmt = dbCon.prepareStatement(EmpQueries.selectAllEmpQuery);
	    
		ResultSet rs = prStmt.executeQuery();
	    
	    List<Employee> empList = new ArrayList<Employee>();
	       
	       while(rs.next())
	       {
	       
	         Employee emp = new Employee();
	       
	         emp.setEmpID(rs.getInt("Emp_ID"));
	         emp.setEmpFirstName(rs.getString("Emp_First_Name"));
	         emp.setEmpLastName(rs.getString("Emp_Last_Name"));
	         emp.setEmpGrade(rs.getString("Emp_Grade"));
	         emp.setEmpDesignation(rs.getString("Emp_Designation"));
	       
	         prStmt = dbCon.prepareStatement(EmpQueries.selectDeptNameQuery);
	         prStmt.setInt(1, rs.getInt("Emp_Dept_ID"));
	       
	         ResultSet rs2 = prStmt.executeQuery();
	         rs2.next();
	         String deptName = rs2.getString("Dept_Name");
	       
	         emp.setEmpDepartmentName(deptName);
	         
	         empList.add(emp);
	        
	       }
	       
	       return empList;
	}

	@Override
	public void update(Employee emp)throws SQLException
	{
		 prStmt = dbCon.prepareStatement(EmpQueries.updateQuery);
	      
	      prStmt.setString(1,emp.getEmpFirstName());
	      prStmt.setString(2,emp.getEmpLastName());
	      prStmt.setInt(3,emp.getEmpBasic());
	      prStmt.setString(4,emp.getEmpGrade());
	      prStmt.setInt(5,emp.getEmpDeptID());
	      prStmt.setString(6,emp.getEmpDesignation());
	      prStmt.setString(7,emp.getEmpGender());
	      prStmt.setString(8,emp.getEmpMaritalStatus());
	      prStmt.setString(9,emp.getEmpHomeAddress());
	      prStmt.setString(10,emp.getEmpContactNum());
	      prStmt.setInt(11,emp.getEmpID());
	      
	      System.out.println(prStmt);
	      
	      int count = prStmt.executeUpdate();
	      
	      System.out.println(count+" record updated");
	      
	      
	}

	@Override
	public void delete() {
      //left as assignment
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

	

}
