package com.jspiders.appone.db;

import java.sql.SQLException;

import com.jspiders.appone.enities.Employee;

public interface Database
{
   public void connect();
   
   public void insert(Employee emp) throws SQLException;
   public Employee read(Integer id)throws SQLException;
   public void update(Employee emp)throws SQLException;
   public void delete()throws SQLException;
   public void readAll()throws SQLException;
   
   public void disconnect();
}
