package com.corejava.basics;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasics 
{
	    /*
	     * ===============================
	     * SENIOR LEVEL NOTES ABOUT ARRAYS
	     * ===============================
	     *
	     * 1. Arrays are objects in Java.
	     * 2. Stored in HEAP memory.
	     * 3. Fixed size after creation.
	     * 4. Index starts from 0 for fast address calculation.
	     * 5. Supports primitives and objects.
	     * 6. Provides O(1) random access.
	     *
	     */

	    public static void main(String[] args)
	    {
	        // ===============================
	        // 1️⃣ DECLARATION & INITIALIZATION
	        // ===============================

	        int[] arr = {10, 9, 18, 14, 7};

	        int[] arrNew = new int[] {5, 2, 8, 1, 3};

	        int[] defaultArr = new int[5]; // default values = 0


	        // ===============================
	        // 2️⃣ ARRAY IS OBJECT
	        // ===============================

	        System.out.println(arr instanceof Object); // true


	        // ===============================
	        // 3️⃣ TRAVERSAL
	        // ===============================

	        // index-based loop (more control)
	        for(int i = 0; i < arr.length; i++)
	        {
	            System.out.println("Index "+i+" value "+arr[i]);
	        }

	        // enhanced for loop
	        for(int value : arr)
	        {
	            System.out.println(value);
	        }


	        // ===============================
	        // 4️⃣ MODIFY ELEMENT
	        // ===============================

	        arr[2] = 100; // update element


	        // ===============================
	        // 5️⃣ SORTING
	        // ===============================

	        Arrays.sort(arrNew); // Dual-Pivot QuickSort for primitives

	        System.out.println(Arrays.toString(arrNew));


	        // ===============================
	        // 6️⃣ SEARCHING
	        // ===============================

	        int index = Arrays.binarySearch(arrNew, 8);
	        System.out.println("Index of 8 = " + index);


	        // ===============================
	        // 7️⃣ COPYING ARRAYS
	        // ===============================

	        int[] copy = Arrays.copyOf(arr, arr.length);

	        int[] clone = arr.clone(); // shallow copy


	        // ===============================
	        // 8️⃣ MULTI-DIMENSIONAL ARRAY
	        // ===============================

	        int[][] matrix = {
	                {1,2,3},
	                {4,5,6}
	        };

	        System.out.println(matrix[1][2]); // 6


	        // ===============================
	        // 9️⃣ JAGGED ARRAY
	        // ===============================

	        int[][] jagged = new int[3][];

	        jagged[0] = new int[2];
	        jagged[1] = new int[4];
	        jagged[2] = new int[1];


	        // ===============================
	        // 🔟 OBJECT ARRAY
	        // ===============================

	        String[] names = {"Anand","Rahul","Amit"};

	        Arrays.sort(names, Comparator.reverseOrder());


	        // ===============================
	        // 1️⃣1️⃣ PASS ARRAY TO METHOD
	        // ===============================

	        printArray(arr);


	        // ===============================
	        // 1️⃣2️⃣ ARRAY FILL
	        // ===============================

	        Arrays.fill(defaultArr, 99);

	        System.out.println(Arrays.toString(defaultArr));


	        // ===============================
	        // 1️⃣3️⃣ ARRAY COMPARISON
	        // ===============================

	        boolean same = Arrays.equals(arr, copy);

	        System.out.println("Arrays equal = " + same);


	        // ===============================
	        // 1️⃣4️⃣ REVERSE ARRAY (Manual)
	        // ===============================

	        reverseArray(arr);

	        System.out.println("Reversed = "+Arrays.toString(arr));

	    }


	    // ===============================
	    // Utility Method - Print
	    // ===============================
	    static void printArray(int[] arr)
	    {
	        for(int v : arr)
	            System.out.println(v);
	    }


	    // ===============================
	    // Reverse array in-place
	    // ===============================
	    static void reverseArray(int[] arr)
	    {
	        int left = 0;
	        int right = arr.length - 1;

	        while(left < right)
	        {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            left++;
	            right--;
	        }
	    }

}
