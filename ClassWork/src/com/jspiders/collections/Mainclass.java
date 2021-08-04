package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		
		System.out.println(alist);
		Integer deleteValue = 30;
		
		//search
		if(alist.contains(deleteValue) == true)
		{
			//delete
			alist.remove(deleteValue);
			
			//add
			alist.add(2,1000);
		}
		
		System.out.println(alist);
		

	}

}
