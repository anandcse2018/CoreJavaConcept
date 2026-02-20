package com.corejava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>();
		list1.add("Anand");
		list1.add(0,"Ajay");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Aman");
		list2.addAll(list1);
		list2.addAll(0,list1);
		System.out.println(list2);
		
		list2.remove(0);
		list2.remove("Anand");
		System.out.println(list2);
		
		list2.set(1,"Neeraj");
		System.out.println(list2);
		
		String name1 = list2.get(1);
		System.out.println("In List2 Value of Index 1 : "+name1);
		
		boolean isIt = list2.contains("Anand");
		System.out.println("List2 Contain Anand : "+isIt);
		
		int index = list2.indexOf("Anand");
		System.out.println("Index of Anand : "+index);
		
		int size = list2.size();
		System.out.println("List2 Size : "+size);
		
		list2.clear();
		System.out.println(list2);
		
//		::::::::  LinkedList   ::::::::
		
		List<Integer> list3 = new LinkedList<>();
		list3.add(23);
		list3.add(12);
		list3.add(0,16);
		System.out.println(list3);
		
		list3.set(0, 12);
		System.out.println(list3);
		
		list3.remove(1);
		System.out.println(list3);
		
		list3.remove((Object)12);
		System.out.println(list3);
		
		
		
		
	}
	
}
