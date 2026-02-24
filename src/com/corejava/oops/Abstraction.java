package com.corejava.oops;

/*
 ===============================================================
 =================== MASTER ABSTRACTION REVISION ===============
 ===============================================================

 ABSTRACTION OVERVIEW

 ✔ Abstraction = Hiding implementation details
                 showing only essential features.

 Real Life Example:

    Car:
        Start()
        Stop()

    User knows WHAT to do,
    but not HOW internally works.

 ===============================================================
 WHY ABSTRACTION?

 ✔ Reduce complexity
 ✔ Increase security
 ✔ Loose coupling
 ✔ Easy maintenance
 ✔ Code reusability

 ===============================================================
 TYPES OF ABSTRACTION

 1) Abstract Class   -> Partial abstraction (0–100%)
 2) Interface        -> Full abstraction (Java 8+ supports default methods)

 ===============================================================
 ABSTRACT CLASS RULES

 ✔ Cannot create object directly.
 ✔ Can have abstract + concrete methods.
 ✔ Can have constructor.
 ✔ Can have instance variables.
 ✔ Supports inheritance using extends.

 ===============================================================
*/

public class Abstraction
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ================= ABSTRACT CLASS DEMO =====================
        ===========================================================
        */

        Vehicle v = new Car();

        // runtime polymorphism
        v.start();
        v.stop();

        /*
        ===========================================================
        ================= INTERFACE DEMO ==========================
        ===========================================================
        */

        Payment p = new UpiPayment();

        p.pay();

    }
}


/*
 ===============================================================
 ====================== ABSTRACT CLASS =========================
 ===============================================================
*/

abstract class Vehicle
{
    // abstract method (no body)
    abstract void start();

    // concrete method
    void stop()
    {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("Car started");
    }
}


/*
 ===============================================================
 ========================= INTERFACE ===========================
 ===============================================================
*/

interface Payment
{
    void pay(); // implicitly public abstract
}

class UpiPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment using UPI");
    }
}


/*
 ===============================================================
 ====================== INTERVIEW IMPORTANT ====================

 ABSTRACT CLASS vs INTERFACE

 Feature         Abstract Class        Interface

 Multiple inherit   NO                 YES
 Constructor        YES                NO
 Variables          Instance allowed   public static final
 Methods            Both types         abstract/default/static
 Access modifier    Any                public

 ===============================================================
*/