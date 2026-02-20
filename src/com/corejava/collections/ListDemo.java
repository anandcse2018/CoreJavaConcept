package com.corejava.collections;

import java.util.List;
import java.util.Vector;

public class ListDemo 
{
	/*	 List implementations
	 * 		ArrayList 
	 * 		LinkedList 
	 * 		Vector
	 */
	
	public static void main(String[] args) 
	{
		List<Integer> list4 = new Vector<>();
		list4.add(10);
		System.out.println(list4);
		System.out.println(list4.size());
		list4.addAll(list4);
		System.out.println(list4);
	}
	
	

}
