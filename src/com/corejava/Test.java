package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class Test 
{	
    static int[] arr = {1,2,3};

    static void recFun(int i, List<Integer> list)
    {
        // Base case
        if(i == arr.length)
        {
            System.out.println(list);
            return;
        }

        // Include element
        list.add(arr[i]);
        recFun(i + 1, list);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude element
        recFun(i + 1, list);
    }

    public static void main(String[] args) 
    {
        System.out.println("Print all subset of {1,2,3}");
        recFun(0, new ArrayList<>());
    }
}