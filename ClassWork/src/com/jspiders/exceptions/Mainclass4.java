package com.jspiders.exceptions;

public class Mainclass4
{
	public static void test(int num1, int num2) 
	{
		System.out.println("test() starts..");
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		int[] a1 = {20,40,80,100};

		try
		{
		  int res = num1 / num2;
		  System.out.println(res);
		  System.out.println("array element : "+a1[res]);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
		}

		System.out.println("test() ends...");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Program starts..");
		test(50,0);
		test(50,2);
		test(50,25);
		
		System.out.println("Program ends...");
	}
}
