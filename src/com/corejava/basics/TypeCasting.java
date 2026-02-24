package com.corejava.basics;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		/*
		=================================================
		TYPE CASTING IN JAVA
		=================================================

		Type Casting = Converting one datatype into another datatype.

		Two Types:

		1) Widening Casting (Implicit Casting)
		   - Smaller datatype -> Larger datatype
		   - Automatic (No data loss)

		2) Narrowing Casting (Explicit Casting)
		   - Larger datatype -> Smaller datatype
		   - Manual casting required
		   - Possible data loss

		=================================================
		*/

		// =============================================
		// 1) WIDENING CASTING (Automatic / Implicit)
		// =============================================

		// byte -> short -> int -> long -> float -> double

		int a = 10;

		// automatic conversion int -> double
		double b = a;

		System.out.println("Widening Casting:");
		System.out.println("int value = " + a);
		System.out.println("double value = " + b);


		// =============================================
		// 2) NARROWING CASTING (Manual / Explicit)
		// =============================================

		double x = 45.67;

		// explicit casting required
		int y = (int) x;   // decimal part lost

		System.out.println("\nNarrowing Casting:");
		System.out.println("double value = " + x);
		System.out.println("int value after casting = " + y);


		// =============================================
		// 3) CHAR AND INT CASTING
		// =============================================

		char ch = 'A';

		int ascii = ch;    // char -> int (automatic widening)

		System.out.println("\nChar to Int:");
		System.out.println("Character = " + ch);
		System.out.println("ASCII value = " + ascii);


		// =============================================
		// 4) INT TO CHAR (Explicit casting)
		// =============================================

		int num = 66;

		char newChar = (char) num;

		System.out.println("\nInt to Char:");
		System.out.println("Character = " + newChar);


		// =============================================
		// 5) WRAPPER CLASS CASTING
		// =============================================

		Integer obj = 100;

		// Unboxing (Integer -> int)
		int primitive = obj;

		// Widening after unboxing (int -> double)
		double newDouble = obj;

		System.out.println("\nWrapper Casting:");
		System.out.println("Integer object = " + obj);
		System.out.println("Primitive int = " + primitive);
		System.out.println("Double value = " + newDouble);


		// =============================================
		// 6) STRING TO NUMBER CONVERSION
		// =============================================

		String str = "25";

		int parsedValue = Integer.parseInt(str); // String -> int

		double converted = Double.parseDouble("34.56");

		System.out.println("\nString Conversion:");
		System.out.println("Parsed int = " + parsedValue);
		System.out.println("Parsed double = " + converted);


		// =============================================
		// IMPORTANT NOTES
		// =============================================

		/*
		Widening Casting:
		- Automatic
		- No data loss
		- Smaller -> Larger

		Narrowing Casting:
		- Manual
		- Possible data loss
		- Larger -> Smaller

		== Key Rule ==
		byte -> short -> int -> long -> float -> double
		*/
	}
}
