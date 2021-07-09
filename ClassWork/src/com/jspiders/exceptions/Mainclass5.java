package com.jspiders.exceptions;

public class Mainclass5 {
	//called
	public static void test(int num1, int num2)throws InterruptedException {
		System.out.println("test() starts..");
		System.out.println("num1 : " + num1 + " num2 : " + num2);

		Thread.sleep(num1);

		System.out.println("test() ends...");
		System.out.println();
	}

	//calling
	public static void main(String[] args) {
		System.out.println("Program starts..");
		
		try
		{
		test(50, 0);
		test(50, 2);
		test(50, 25);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("Program ends...");
	}
}
