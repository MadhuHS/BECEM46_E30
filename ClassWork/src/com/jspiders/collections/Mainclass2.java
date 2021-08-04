package com.jspiders.collections;

import java.util.HashSet;

public class Mainclass2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(null);
		hs1.add(50);
		hs1.add(30);
		hs1.add(null);
		hs1.add(40);
		hs1.add(50);
		
		for(Integer i1 : hs1)
		{
			System.out.println(i1);
		}
	}

}
