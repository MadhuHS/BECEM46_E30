package com.jspiders.appone.db;

public class EmpQueries {

	static String insetQuery = "insert into AppOneDB.Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?);";
	static String updateQuery = "update AppOneDB.Employee set Emp_First_Name = ? ,Emp_Last_Name =  ?,Emp_Basic = ?, Emp_Grade = ?,Emp_Dept_ID = ?, Emp_Designation = ?,Emp_Gender = ? ,Emp_Marital_Status = ?,Emp_Home_Address = ?, Emp_Contact_Num = ? where Emp_ID = ?;";
	
	/*
	 * insert into AppOneDB.Employee values(1,'Virat','Kholi','1970-01-01','1970-01-01',1,'m1','intern',0,'M','S','Bangalore','9989918181');
	 * 
	 * 
	 */
}
