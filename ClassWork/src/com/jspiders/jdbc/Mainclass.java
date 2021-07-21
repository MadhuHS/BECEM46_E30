package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mainclass 
{
	static Connection dbCon= null;
	static Scanner scn = new Scanner(System.in);
	
	public static void openConnection() throws SQLException
	{
		String dburl = "jdbc:mysql://localhost:3306/AppOneDB";
		String dbUsername = "root";
		String dbPasswrod = "root";
		
	       //register and load the driver
			    dbCon = DriverManager.getConnection(dburl,dbUsername,dbPasswrod);
				System.out.println("Connection opend successfully...");
				
	}
	
	public static void closeConnection() throws SQLException
	{
		dbCon.close();
		System.out.println("Connection closed successfully...");
	}
	
	
	
	public static void insertUser(User us)
	{
		//Create --> Insert
		 String insertUserQuery = "insert into PracticeDB.User values(?,?,?,?)";
		//Statement stmt = dbCon.createStatement();
		
		PreparedStatement prstmt;
		try {
			prstmt = dbCon.prepareStatement(insertUserQuery);
			prstmt.setString(1, us.getUid());
			prstmt.setString(2, us.getName());
			prstmt.setString(3, us.getEmail());
			prstmt.setString(4, us.getMob());
			
			
			prstmt.executeUpdate();
			System.out.println("Record inserted to DB");
		}
		catch (SQLException e)
		{
			System.out.println("OOPS!! User already exists in the App");
		}	
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		try
		{
			openConnection();
			
			System.out.println("enter user details");
			
			System.out.println("enter UID");
			String uid =scn.next();
			
			System.out.println("enter Name");
			String name =scn.next();
			
			System.out.println("enter email");
			String email =scn.next();
			
			System.out.println("enter mob");
			String mob =scn.next();
			
			User us1 = new User();
			
			us1.setUid(uid);
			us1.setName(name);
			us1.setEmail(email);
			us1.setMob(mob);
			
			insertUser(us1);
			
			closeConnection();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		

		System.out.println("Program ends...");
	}
}
