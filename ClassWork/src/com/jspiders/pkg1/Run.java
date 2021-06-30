package com.jspiders.pkg1;

public class Run
{
	public static void main(String[] args)
	{
		Sample s1 = new Sample();

		// public members
		System.out.println(s1.v1);
		s1.view();

		// protected members
		System.out.println(s1.v2);
		s1.display();

		// pkg-level(default) members
		System.out.println(s1.v3);
		s1.count();
	}
}
