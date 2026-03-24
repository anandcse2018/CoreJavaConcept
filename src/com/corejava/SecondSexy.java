package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSexy 
{
	public static void main(String[] args) 
	{
		List<Integer> list1 =new ArrayList<>();
		list1.addAll(Arrays.asList(1,2,3,4,5,6,7));
		list1.stream()
		.filter(x-> x<7)
		.map(x-> x%2==0?x:(x+1))
		.sorted(Comparator.reverseOrder())
		.reduce(null);
		
		System.out.println(list1);
	}
}