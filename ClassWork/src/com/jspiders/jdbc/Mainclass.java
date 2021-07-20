package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainclass {
	public static void main(String[] args) {
		System.out.println("Program starts...");

		String dburl = "jdbc:mysql://localhost:3306/AppOneDB";
		String dbUsername = "root";
		String dbPasswrod = "root";
		Connection dbCon= null;

		try
		{
			       //register and load the driver
		    dbCon = DriverManager.getConnection(dburl,dbUsername,dbPasswrod);
			System.out.println("Connection opend successfully...");
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		
		}
		finally
		{
			try
			{
				dbCon.close();
				System.out.println("Connection closed successfully...");
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
		}

		System.out.println("Program ends...");
	}
}
