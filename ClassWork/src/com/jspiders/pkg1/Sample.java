package com.jspiders.pkg1;

public class Sample
{
   public    int    v1 = 10;
   protected double v2 = 2.54;
             long   v3 = 9999999877711l;
   private   String v4 = "hello";
   
   public void view()
   {
	   System.out.println("this is public-view() of Sample");
   }
   
   protected void display()
   {
	   System.out.println("this is protected-display() of Sample");
   }
   
   void count()
   {
	   System.out.println("this is pkg-level-display() of Sample");
   }
   
   private void test()
   {
	   System.out.println("this is private-test() of Sample");
   }
}
