package com.corejava.basics;

class Student{
	int id;					// instance variable
	String name;			// instance variable
	static String collage;	// static variable
}

public class StaticVariable 
{
	public static void main(String[] args)
	{
		Student.collage = "IIIT Allhabad";
		Student s1 = new Student();
		s1.id = 7;
		s1.name = "Anand";
		
		Student s2 = new Student();
		s2.id = 10;
		s2.name = "Nidhi";
		
		System.out.println("ID : "+s1.id+", Name : "+s1.name+", Collage : "+Student.collage);
		Student.collage = "BU Jhansi";
		System.out.println("ID : "+s2.id+", Name : "+s2.name+", Collage : "+Student.collage);
	}
}
