package com.demo.Collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list=new ArrayList<>();
		list.add("om");
		list.add("sai");
		list.add("ram");
		list.add("sham");
		
		System.out.println("list");
		
		//using iterator
		Iterator <String> itr=list.iterator();
		
		while(itr.hasNext())
		{
		
			System.out.println(itr.next());
			
		}
		//using foreach loop
		//without iterator
		for(String name:list)
		{
			System.out.println(name);
		}
		
		
	}

}
