package com.corejava.basics;
class B{
	int y = 20;
}
public class StaticMethod 
{
//	 A static method cannot directly access non-static instance variables or 
//	 instance methods of the same class or different class.

	static void display(int x)
	{
		System.out.println("Static Method Called : "+x);
		B obj = new B();
		System.out.println(obj.y);
   //   a static method access an instance variable of another class using an object
	}

	public static void main(String[] args) 
	{
		int x = 10;
		StaticMethod.display(x);
	}
}
