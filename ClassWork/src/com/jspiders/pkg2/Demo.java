package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;

public class Demo extends Sample
{
	public static void main(String[] args)
	{  
	// public members
      Sample s1 = new Sample();//superclass
      System.out.println(s1.v1);
      s1.view(); 
      
   // protected members
      Demo d1 = new Demo();//subclass
   	  System.out.println(d1.v2);
   	  d1.display();
   	  
	}
}
