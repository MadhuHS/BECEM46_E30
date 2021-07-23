package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mainclass {
	static Connection dbCon = null;
	static Scanner scn = new Scanner(System.in);

	public static void openConnection() throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/";
		String dbUsername = "root";
		String dbPasswrod = "root";

		// register and load the driver
		dbCon = DriverManager.getConnection(dburl, dbUsername, dbPasswrod);
		System.out.println("Connection opend successfully...");

	}

	public static void closeConnection() throws SQLException {
		dbCon.close();
		System.out.println("Connection closed successfully...");
	}

	public static void insertUser() {
		// Create --> Insert
		String insertUserQuery = "insert into PracticeDB.User values(?,?,?,?)";
		// Statement stmt = dbCon.createStatement();
		System.out.println("enter user details");

		System.out.println("enter UID");
		String uid = scn.next();

		System.out.println("enter Name");
		String name = scn.next();

		System.out.println("enter email");
		String email = scn.next();

		System.out.println("enter mob");
		String mob = scn.next();

		User us = new User();

		us.setUid(uid);
		us.setName(name);
		us.setEmail(email);
		us.setMob(mob);

		PreparedStatement prstmt;
		try {
			prstmt = dbCon.prepareStatement(insertUserQuery);
			prstmt.setString(1, us.getUid());
			prstmt.setString(2, us.getName());
			prstmt.setString(3, us.getEmail());
			prstmt.setString(4, us.getMob());

			prstmt.executeUpdate();
			System.out.println("Record inserted to DB");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("OOPS!! User already exists in the App");
		}
	}

	public static void updateUserEmail(String uid, String newEamil) {
		String updateEmailQuery = "update PracticeDB.User set email = ? where UID = ?";
		try {
			PreparedStatement pstmt = dbCon.prepareStatement(updateEmailQuery);
			pstmt.setString(1, newEamil);
			pstmt.setString(2, uid);

			int count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("emailID updated for the user " + uid);
			} else {
				System.out.println("ERROR : " + uid + " DOES NOT EXIST IN THE SYSTEM!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteUser(String uid) {
		String deleteUserQuery = "delete from PracticeDB.User where uid = ?";

		try {
			PreparedStatement psm = dbCon.prepareStatement(deleteUserQuery);

			psm.setString(1, uid);
			int count = psm.executeUpdate();

			if (count > 0) {
				System.out.println("User with UID : " + uid + " deleted");
			} else {
				System.out.println("User with UID : " + uid + " CANNOT be deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void showUser(String uid) {
		String selectUserQuery = "Select * from PracticeDB.User where uid = ? ";

		try
		{
			PreparedStatement psm = dbCon.prepareStatement(selectUserQuery);
			psm.setString(1, uid);
			ResultSet rs = psm.executeQuery();
			
			rs.next();
			String usid = rs.getString("UID");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String mob = rs.getString("mob");
			
			System.out.println(usid);
			System.out.println(name);
			System.out.println(email);
			System.out.println(mob);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void showAllUsers() {
		String selectUserQuery = "Select * from PracticeDB.User";

		try
		{
			PreparedStatement psm = dbCon.prepareStatement(selectUserQuery);
			ResultSet rs = psm.executeQuery();
			
			while(rs.next())
			{
			  String usid = rs.getString("UID");
			  String name = rs.getString("name");
			  String email = rs.getString("email");
			  String mob = rs.getString("mob");
			
			  System.out.println(usid +" "+name+ " "+email+" "+mob);
			  System.out.println();
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Program starts...");

		try {
			openConnection();

			showAllUsers();

			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Program ends...");
	}
}
