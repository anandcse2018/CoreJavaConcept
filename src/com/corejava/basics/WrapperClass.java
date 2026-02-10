package com.corejava.basics;

public class WrapperClass 
{
	/*
	=================================================
	WRAPPER CLASS (CORE JAVA) - DEFINITION
	=================================================

	Wrapper Class = Object representation of primitive data types.

	Primitive Type   ->   Wrapper Class
	-----------------------------------
	int              ->   Integer
	long             ->   Long
	float            ->   Float
	double           ->   Double
	char             ->   Character
	boolean          ->   Boolean
	byte             ->   Byte
	short            ->   Short

	WHY WRAPPER CLASS IS USED:

	1) Java Collections (ArrayList, HashMap) work only with objects.
	2) Generics require objects, not primitives.
	3) Wrapper allows null values.
	4) Provides utility methods (parseInt, valueOf, compare, etc.).
	5) Used in frameworks, APIs, and advanced Java features.

	KEY CONCEPTS:

	- Auto Boxing  : primitive -> wrapper object
	- Unboxing     : wrapper object -> primitive
	- Integer Cache: JVM reuses Integer objects between -128 to 127.
	- == compares reference (memory)
	- equals() compares value

	=================================================
	*/
	
	public static void main(String[] args) 
	{	
		// Old java style (NOT recommended, always creates new object)
		Integer y = new Integer(10);  
		
		// Auto Boxing (primitive -> wrapper object)
		// Compiler converts: Integer z = Integer.valueOf(20);
		Integer z = 20;    
		
		// Unboxing (wrapper object -> primitive)
		// Compiler converts: int p = z.intValue();
		int p = z;
		
		// Wrapper supports null because it is object reference
		Integer x = null;  
		
		// Unboxing null causes NullPointerException
		// int n = x; 
		
		System.out.println(x+" : "+y+" : "+z+" : "+p);
		
		// Other Wrapper classes examples
		Long a = 23L;
		Float b = 23.67F;
		Double c = 67.98;
		Character d = 'A';
		Boolean e = true;
		Byte f = 34;
		Short g = 78;
		
		// String conversion examples
		String s = "15";
		
		int k = Integer.parseInt(s);   // String -> primitive int
		
		int l = Integer.valueOf(s);    // returns Integer object then auto-unboxing -> int
		
		String m = Integer.toString(l); // int -> String
		
		System.out.println(k+" : "+l+" : "+m);
		
		
		// Integer Cache concept
		// JVM reuses Integer objects in range -128 to 127
		
		Integer q = 10;
		Integer r = 10;
		
		// == compares memory reference
		if(q == r)
			System.out.println("q == r (same cached object)");
		else
			System.out.println("q != r");
		
		// equals() compares value
		if(q.equals(r))
			System.out.println("q.equals(r)");
		else
			System.out.println("!q.equals(r)");
		
		
		Integer u = 200;
		Integer t = 200;
		
		// Outside cache range -> different objects
		if(u == t)
			System.out.println("u == t");
		else
			System.out.println("u != t (different objects)");
		
		if(u.equals(t))
			System.out.println("u.equals(t)");
		else
			System.out.println("!u.equals(t)");
	}
}
