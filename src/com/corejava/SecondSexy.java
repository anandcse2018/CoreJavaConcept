package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondSexy {
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list1.forEach(System.out::println);
		
		List<Integer> list2 = new LinkedList<>();
		list2.addAll(Arrays.asList(1,2,3,4,5));
		list2.forEach(System.out::print);
	}

}
