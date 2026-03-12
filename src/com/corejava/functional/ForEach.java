package com.corejava.functional;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(190);
		list.add(180);
		list.add(30);
		list.add(20);
		list.add(120);
		
		list.forEach(x->System.out.println(x));
	}

}
