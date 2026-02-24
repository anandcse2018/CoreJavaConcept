package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER POLYMORPHISM REVISION ================
 ===============================================================

 POLYMORPHISM OVERVIEW

 ✔ Polymorphism = "Many Forms"
 ✔ One interface, multiple implementations.

 Types:

 1) Compile-time Polymorphism  -> Method Overloading
 2) Runtime Polymorphism       -> Method Overriding

 ===============================================================
 WHY POLYMORPHISM?

 ✔ Flexibility
 ✔ Loose coupling
 ✔ Runtime behavior change
 ✔ Code reusability

 ===============================================================
*/

public class Polymorphism
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= COMPILE-TIME POLYMORPHISM ===============
        ===================== (OVERLOADING) ========================
        ===========================================================

        Same method name
        Different parameter list
        Resolved at compile time
        */

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.5));
        System.out.println(calc.add(5, 10, 15));


        /*
        ===========================================================
        ================= RUNTIME POLYMORPHISM ====================
        ===================== (OVERRIDING) =========================
        ===========================================================

        Parent reference -> Child object
        Method decided at runtime (Dynamic Dispatch)
        */

        Animal a = new Dog();   // Upcasting
        a.sound();              // Dog version called

        Animal b = new Cat();
        b.sound();


        /*
        ===========================================================
        ===================== DOWNCASTING ==========================
        ===========================================================

        Need explicit cast.
        */

        Animal obj = new Dog();

        if(obj instanceof Dog)
        {
            Dog d = (Dog) obj;
            d.fetch();
        }

    }
}


/*
 ===============================================================
 ================= METHOD OVERLOADING EXAMPLE ==================
 ===============================================================
*/

class Calculator
{
    // same method name, different parameters

    int add(int a, int b)
    {
        return a + b;
    }

    double add(double a, double b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }
}


/*
 ===============================================================
 ================= METHOD OVERRIDING EXAMPLE ===================
 ===============================================================
*/

class Animal
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }

    void fetch()
    {
        System.out.println("Dog fetches ball");
    }
}

class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cat meows");
    }
}


/*
 ===============================================================
 ======================= RULES OF OVERRIDING ===================

 ✔ Method signature must be same.
 ✔ Access modifier cannot be more restrictive.
 ✔ Return type can be covariant.
 ✔ Cannot override static method (method hiding).
 ✔ Cannot override final method.
 ✔ Private methods are not overridden.

 ===============================================================

 ===================== INTERVIEW IMPORTANT =====================

 Overloading:
    -> Resolved at compile time
    -> Based on method signature

 Overriding:
    -> Resolved at runtime
    -> Based on object type (not reference type)

 Dynamic Method Dispatch:
    JVM decides method at runtime.

 Example:
    Animal a = new Dog();
    a.sound();  // Dog version called

 ===============================================================
*/