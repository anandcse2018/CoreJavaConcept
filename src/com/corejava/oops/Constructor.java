package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER CONSTRUCTOR REVISION =================
 ===============================================================

 CONSTRUCTOR OVERVIEW

 ✔ Special method used to initialize object.
 ✔ Name same as class name.
 ✔ No return type (not even void).
 ✔ Automatically called when object created.

 Example:

      new Student();

 ===============================================================
 WHY CONSTRUCTOR?

 ✔ Initialize fields
 ✔ Set default values
 ✔ Enforce mandatory data

 ===============================================================
 TYPES OF CONSTRUCTORS

 ✔ Default constructor
 ✔ Parameterized constructor
 ✔ Copy constructor (user-defined)
 ✔ Private constructor

 ===============================================================
  Learning Flow
 
		Constructor
		   ↓
		this keyword
		   ↓
		Inheritance
		   ↓
		super keyword
		   ↓
		Polymorphism
		   ↓
		Encapsulation
		   ↓
		Abstraction
		   ↓
		final keyword
		Anand Maurya
*/

public class Constructor
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= DEFAULT CONSTRUCTOR =====================
        ===========================================================
        */

        Student s1 = new Student();

        /*
        ===========================================================
        ================= PARAMETERIZED CONSTRUCTOR ===============
        ===========================================================
        */

        Student s2 = new Student("Anand", 30);

        /*
        ===========================================================
        ================= COPY CONSTRUCTOR ========================
        ===========================================================
        */

        Student s3 = new Student(s2);

        /*
        ===========================================================
        ================= CONSTRUCTOR OVERLOADING =================
        ===========================================================
        */

        Student s4 = new Student("Ajay");

    }
}


/*
 ===============================================================
 ======================= STUDENT CLASS =========================
 ===============================================================
*/

class Student
{
    String name;
    int age;

    /*
     Default constructor
     Called when no parameter passed.
    */
    Student()
    {
        System.out.println("Default constructor called");
    }

    /*
     Parameterized constructor
    */
    Student(String name, int age)
    {
        this.name = name; // this keyword refers current object
        this.age = age;

        System.out.println("Parameterized constructor");
    }

    /*
     Constructor overloading
    */
    Student(String name)
    {
        this(name, 0); // constructor chaining using this()
    }

    /*
     Copy constructor (custom implementation)
    */
    Student(Student other)
    {
        this.name = other.name;
        this.age = other.age;

        System.out.println("Copy constructor");
    }
}


/*
 ===============================================================
 ====================== CONSTRUCTOR CHAINING ===================

 this()  -> call another constructor in same class.
 super() -> call parent class constructor.

 Must be FIRST statement.

 ===============================================================

 ===================== EXECUTION ORDER =========================

 1) Parent constructor
 2) Instance initialization block
 3) Child constructor

 ===============================================================

 ====================== INTERVIEW IMPORTANT ====================

 ✔ Constructor cannot be overridden.
 ✔ Constructor can be overloaded.
 ✔ Constructor not inherited.
 ✔ If no constructor defined -> compiler provides default constructor.
 ✔ Private constructor used in Singleton design.

 ===============================================================
*/