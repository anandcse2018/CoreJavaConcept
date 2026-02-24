package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER THIS KEYWORD REVISION ================
 ===============================================================

 THIS KEYWORD OVERVIEW

 ✔ 'this' refers to current object.
 ✔ Used inside instance methods and constructors.

 ===============================================================
 MAIN USES OF THIS KEYWORD

 1) Refer current class instance variable.
 2) Call current class method.
 3) Call another constructor (this()).
 4) Pass current object as argument.
 5) Return current object.

 ===============================================================
*/

public class ThisKeyword
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= VARIABLE SHADOWING ======================
        ===========================================================

        When local variable name same as instance variable,
        use 'this' to differentiate.
        */

        Employee e1 = new Employee("Anand", 30);

        e1.display();

        /*
        ===========================================================
        ================= PASS CURRENT OBJECT =====================
        ===========================================================
        */

        e1.showCurrentObject();

        /*
        ===========================================================
        ================= METHOD CHAINING =========================
        ===========================================================
        */

        e1.updateName("Ajay").updateAge(35).display();
    }
}


/*
 ===============================================================
 ======================= EMPLOYEE CLASS ========================
 ===============================================================
*/

class Employee
{
    String name;
    int age;

    /*
     Constructor using 'this'
    */
    Employee(String name, int age)
    {
        this.name = name; // refers instance variable
        this.age = age;
    }

    /*
     Call current class method using this
    */
    void display()
    {
        System.out.println("Name : " + this.name + " Age : " + this.age);
    }

    /*
     Passing current object as parameter
    */
    void showCurrentObject()
    {
        helperMethod(this);
    }

    void helperMethod(Employee obj)
    {
        System.out.println("Current object received : " + obj.name);
    }

    /*
     Returning current object for method chaining
    */
    Employee updateName(String name)
    {
        this.name = name;
        return this;
    }

    Employee updateAge(int age)
    {
        this.age = age;
        return this;
    }
}


/*
 ===============================================================
 ================= CONSTRUCTOR CHAINING ========================

 this() -> calls another constructor in same class.

 Must be first statement.

 Example:

   this("Anand", 30);

 ===============================================================

 ====================== INTERVIEW IMPORTANT ====================

 ✔ this refers to CURRENT object only.
 ✔ Cannot use this in static context.
 ✔ this() vs super():

      this()  -> same class constructor
      super() -> parent constructor

 ===============================================================
*/