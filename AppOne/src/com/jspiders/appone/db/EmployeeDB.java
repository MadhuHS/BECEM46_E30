package com.jspiders.appone.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDB implements MysqlDB 
{
	private static final String dbUrl = "jdbc:mysql://localhost:3306/AppOneDB";
	private Connection dbCon;
	private PreparedStatement prStmt;
	
	@Override
	public void connect()
	{
	  	
	}

	@Override
	public void create() {
		
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
		
	}

}
