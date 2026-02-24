package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER FINAL KEYWORD REVISION ===============
 ===============================================================

 FINAL KEYWORD OVERVIEW

 ✔ final = restriction keyword.
 ✔ Used with:

        variables
        methods
        classes

 ===============================================================
 PURPOSE

 ✔ Prevent modification.
 ✔ Increase security.
 ✔ Create constants.
 ✔ Prevent overriding/inheritance.

 ===============================================================
*/

public class FinalKeyword
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= FINAL VARIABLE ==========================
        ===========================================================

        Value cannot be changed after initialization.
        */

        final int x = 10;

        // x = 20; // ❌ compile-time error

        System.out.println("Final variable : " + x);


        /*
        ===========================================================
        ================= FINAL OBJECT REFERENCE ==================

        Reference cannot change, object data CAN change.
        */

        final Person p = new Person("Anand");

        p.name = "Ajay"; // allowed

        System.out.println(p.name);

        // p = new Person("Aman"); // ❌ not allowed


        /*
        ===========================================================
        ================= FINAL METHOD ============================

        Cannot be overridden.
        */

        Parent obj = new Child();

        obj.show();


        /*
        ===========================================================
        ================= FINAL CLASS =============================

        Cannot be extended.
        */

        Utility u = new Utility();

        u.display();

    }
}


/*
 ===============================================================
 ================= FINAL METHOD EXAMPLE ========================
 ===============================================================
*/

class Parent
{
    final void show()
    {
        System.out.println("Final method in parent");
    }
}

class Child extends Parent
{
    // void show() {}  // ❌ cannot override final method
}


/*
 ===============================================================
 ================= FINAL CLASS EXAMPLE =========================
 ===============================================================
*/

final class Utility
{
    void display()
    {
        System.out.println("Final class method");
    }
}

// class Test extends Utility {} // ❌ cannot inherit final class


/*
 ===============================================================
 ================= FINAL VARIABLE OBJECT EXAMPLE ===============
 ===============================================================
*/

class Person
{
    String name;

    Person(String name)
    {
        this.name = name;
    }
}


/*
 ===============================================================
 ================= BLANK FINAL VARIABLE ========================

 final variable declared but initialized later.

 Must be assigned:

 ✔ inside constructor
 ✔ inside initialization block

 ===============================================================

 ================= STATIC FINAL ================================

 Used for constants.

 Example:

    static final double PI = 3.14;

 ===============================================================

 ================= INTERVIEW IMPORTANT =========================

 ✔ final variable -> value cannot change.
 ✔ final reference -> reference cannot change.
 ✔ final method -> cannot override.
 ✔ final class -> cannot extend.

 ===============================================================
*/