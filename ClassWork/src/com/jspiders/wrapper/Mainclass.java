package com.jspiders.wrapper;

public class Mainclass
{
	public static void test(Object v1) 
	{
		System.out.println("this is test(Object v1)");
		System.out.println("v1 : " + v1);
	}
	
	public static void main(String[] args)
	{
		Integer i1 = 10;
		test(i1);
		
		Byte by1 = 10;
		test(by1);
		
		Double d1 = 24.81;
		test(d1);
		
		String str = "hello";
		test(str);
		
		StringBuffer sb1 = new StringBuffer("hello");
		test(sb1);
		
		String s1 = new String("hello");
		Object obj1 = s1;
		
		String s2 = "hello";
		Object obj2 = s2;
		
		Object obj3 = "hello";//--->
		
		Integer i2 = 10;
		Object obj4 = i2;
		
		Object obj5 = 10;
	}
}




