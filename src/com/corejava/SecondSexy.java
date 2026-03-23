package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SecondSexy 
{
	public static void main(String[] args) 
	{
	    List<Integer> list2 = new ArrayList<>(); 
	    list2.addAll(Arrays.asList(0,1,2,3,4,5,6));
	    
	    ListIterator<Integer> it = list2.listIterator();
	    while(it.hasNext())
	    {
	    	int x = it.next();
	    	if(x == 4)
	    	{
	    		it.remove();
	    		it.set(19);
	    		
	    		it.add(9);
	    		
	    		
	    	}
	    	else
	    		System.out.println(x);
	    }
	    System.out.println(list2);
	}
}