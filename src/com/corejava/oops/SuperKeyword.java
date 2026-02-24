package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER SUPER KEYWORD REVISION ===============
 ===============================================================

 SUPER KEYWORD OVERVIEW

 ✔ 'super' refers to immediate parent class object.

 Used for:

    1) Call parent constructor.
    2) Access parent variable.
    3) Call parent method.

 ===============================================================
 WHY SUPER?

 ✔ Resolve variable hiding.
 ✔ Call overridden parent method.
 ✔ Constructor chaining.

 ===============================================================
*/

public class SuperKeyword
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= BASIC INHERITANCE =======================
        ===========================================================
        */

        ChildClass obj = new ChildClass();

        obj.display();

    }
}


/*
 ===============================================================
 ========================= PARENT CLASS ========================
 ===============================================================
*/

class ParentClass
{
    String name = "Parent";

    ParentClass()
    {
        System.out.println("Parent constructor");
    }

    void show()
    {
        System.out.println("Parent method");
    }
}


/*
 ===============================================================
 ========================= CHILD CLASS =========================
 ===============================================================
*/

class ChildClass extends ParentClass
{
    String name = "Child";

    ChildClass()
    {
        super(); // calls parent constructor (implicit if not written)
        System.out.println("Child constructor");
    }

    void display()
    {
        /*
         Access parent variable using super.
        */
        System.out.println("Parent name : " + super.name);

        /*
         Access child variable using this.
        */
        System.out.println("Child name : " + this.name);

        /*
         Call parent method.
        */
        super.show();
    }
}


/*
 ===============================================================
 ===================== CONSTRUCTOR EXECUTION ===================

 Order:

    Parent constructor
        ↓
    Child constructor

 ===============================================================

 ====================== super vs this ==========================

 super:

    -> parent class reference
    -> call parent constructor
    -> access parent method/variable

 this:

    -> current object reference
    -> call same class constructor

 ===============================================================

 ===================== INTERVIEW IMPORTANT =====================

 ✔ super() must be first statement in constructor.
 ✔ If not written, compiler adds automatically.
 ✔ Cannot use super in static context.
 ✔ Used to resolve variable hiding.

 ===============================================================
*/