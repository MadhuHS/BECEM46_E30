package com.jspiders.appone.db;

public class DataBaseManager
{
   Database db;
   
   public Database getDB(String table)
   {
	  db =  new EmployeeDB();
	  
	  return db;
   }
}
