package com.jspiders.exceptions;

public class Mainclass
{
	public static void test(int num1, int num2)
	{
		System.out.println("test() starts..");
		System.out.println("num1 : "+num1 +" num2 : "+num2);
		
		if(num2 != 0)
		{
		  int res = num1 / num2;
		  System.out.println(res);
		}
		else
		{
		   System.out.println("cannot divide by "+num2);
		}
      
		System.out.println("test() ends...");
		System.out.println();
	}

	public static void main(String[] args)
	{
		System.out.println("Program starts..");
		test(50,2);
		test(50,0);
		System.out.println("Program ends...");
	}
}
