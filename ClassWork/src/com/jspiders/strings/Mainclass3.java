package com.jspiders.strings;

public class Mainclass3 {
	// return the first half of the given string

	public static String firstHalf(String str)
	{
		String res = "";
		
		for (int i = 0; i <= (str.length() - 1)/2; i++) 
		{
			char c1 = str.charAt(i);
			res = res + c1;
			System.out.println(res);
		}

		return res;
	}
	
	
	public static String firstHalfSb(String str)
	{
		String res = "";
		StringBuffer sb1 = new StringBuffer();
		
		for (int i = 0; i <= (str.length() - 1)/2; i++) 
		{
			char c1 = str.charAt(i);
			sb1.append(c1);//concat
		}
        
		res = sb1.toString();
		return res;	
	}

	public static void main(String[] args)
	{
		String res = "";
		res = firstHalfSb("aaaa");
	    System.out.println(res);
	}
}
