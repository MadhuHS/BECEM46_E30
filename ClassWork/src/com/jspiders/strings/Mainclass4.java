package com.jspiders.strings;

public class Mainclass4
{
	
   //Write a fun. that returns second half of the string
   //Write a fun. that returns reverse of the string
   public static void main(String[] args)
   {
	  StringBuilder sb1 = new StringBuilder("hello");
	  StringBuilder sb2 = new StringBuilder("hello");
	  
	  StringBuilder sb3 = sb1.append(sb2);
	  
	  System.out.println(sb1.hashCode());
	  System.out.println(sb2.hashCode());
	  
	  System.out.println(sb2.toString());
	  
	  System.out.println(sb1.equals(sb2));
	  
   }	
	
}
