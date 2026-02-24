package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER INHERITANCE REVISION =================
 ===============================================================

 INHERITANCE OVERVIEW

 ✔ Inheritance = Child class acquires properties of parent class.
 ✔ Represents IS-A relationship.

 Example:
      Dog IS-A Animal

 ===============================================================
 WHY INHERITANCE?

 ✔ Code reuse
 ✔ Method overriding
 ✔ Runtime polymorphism
 ✔ Maintain hierarchy

 ===============================================================
 TYPES OF INHERITANCE (Java)

 ✔ Single          A -> B
 ✔ Multilevel      A -> B -> C
 ✔ Hierarchical    A -> B and A -> C
 ❌ Multiple class inheritance NOT allowed
 ✔ Multiple inheritance using interfaces

 ===============================================================
 IMPORTANT CONCEPTS

 ✔ Constructor is NOT inherited.
 ✔ Parent constructor always runs first.
 ✔ Method overriding requires inheritance.
 ✔ Supports runtime polymorphism.

 ===============================================================
*/

public class Inheritance
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= SINGLE INHERITANCE ======================
        ===========================================================
        */

        BaseDog dog = new BaseDog();

        dog.eat();   // inherited + overridden method
        dog.bark();  // child class method


        /*
        ===========================================================
        ================= RUNTIME POLYMORPHISM ====================
        ===========================================================

        Parent reference -> Child object

        Method selection happens at runtime.
        */

        BaseAnimal animal = new BaseDog(); // upcasting

        animal.eat(); // calls BaseDog version


        /*
        ===========================================================
        ================= CONSTRUCTOR CHAINING ====================
        ===========================================================

        Execution order:

            Parent constructor
            -> Child constructor
        */

        new BaseCat();
    }
}


/*
 ===============================================================
 ======================== PARENT CLASS =========================
 ===============================================================

 Parent class provides common behaviour.
*/

class BaseAnimal
{
    BaseAnimal()
    {
        System.out.println("BaseAnimal constructor");
    }

    void eat()
    {
        System.out.println("Animal eats");
    }
}


/*
 ===============================================================
 ======================== CHILD CLASS ==========================
 ===============================================================

 extends keyword used for inheritance.

 Overriding example included.
*/

class BaseDog extends BaseAnimal
{
    BaseDog()
    {
        // super() automatically called
        System.out.println("BaseDog constructor");
    }

    void bark()
    {
        System.out.println("Dog barks");
    }

    @Override
    void eat()
    {
        System.out.println("Dog eats");
    }
}


/*
 ===============================================================
 ================= MULTILEVEL INHERITANCE ======================
 ===============================================================

 Child class calling parent constructor explicitly.
*/

class BaseCat extends BaseAnimal
{
    BaseCat()
    {
        super(); // explicit parent constructor call
        System.out.println("BaseCat constructor");
    }
}


/*
 ===============================================================
 ====================== ACCESS MODIFIER RULES ==================

 Modifier        Inherited?

 public          YES
 protected       YES
 default         YES (same package)
 private         NO

 ===============================================================

 ====================== super KEYWORD ==========================

 super():

 ✔ Calls parent constructor.
 ✔ Access parent method.
 ✔ Access parent variable.

 ===============================================================

 ===================== INTERVIEW IMPORTANT =====================

 ✔ Constructor NOT inherited but invoked.
 ✔ Overriding needs inheritance.
 ✔ Java avoids diamond problem by disallowing multiple class inheritance.

 Diamond Problem:

         A
        / \
       B   C
        \ /
         D

 ===============================================================
*/