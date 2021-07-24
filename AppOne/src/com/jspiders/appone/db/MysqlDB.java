package com.jspiders.appone.db;

public interface MysqlDB
{
   public void connect();
   
   public void create();
   public void read();
   public void update();
   public void delete();
   
   public void disconnect();
}
