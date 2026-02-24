package com.corejava.oops;

/*
 ===============================================================
 ================= MASTER ENCAPSULATION REVISION ===============
 ===============================================================

 ENCAPSULATION OVERVIEW

 ✔ Encapsulation = Wrapping data + methods together.
 ✔ Data hiding using private variables.
 ✔ Access through public methods (getter/setter).

 Real Life Example:

    Bank Account:
        balance is private
        deposit()/withdraw() control access

 ===============================================================
 WHY ENCAPSULATION?

 ✔ Data security
 ✔ Controlled access
 ✔ Validation before modification
 ✔ Maintainability
 ✔ Loose coupling

 ===============================================================
 BASIC RULES

 ✔ Make variables private.
 ✔ Provide public getter/setter.
 ✔ Apply validation inside setter.

 ===============================================================
*/

public class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("Anand", 1000);

        System.out.println(account.getOwner());
        System.out.println(account.getBalance());

        account.deposit(500);

        account.withdraw(300);

        // invalid operation
        account.withdraw(10000);

        System.out.println("Final Balance : " + account.getBalance());
    }
}


/*
 ===============================================================
 ================= ENCAPSULATED CLASS EXAMPLE ==================
 ===============================================================
*/

class BankAccount
{
    // private variables -> data hiding
    private String owner;
    private double balance;

    // constructor
    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    // getter (read access)
    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    // controlled modification
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if(amount <= balance && amount > 0)
        {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }
        else
        {
            System.out.println("Invalid withdrawal");
        }
    }
}


/*
 ===============================================================
 ====================== IMMUTABLE CLASS NOTE ===================

 Immutable object:

 ✔ No setter methods.
 ✔ All fields private final.
 ✔ Values set only via constructor.

 Example:
    String class.

 ===============================================================

 ===================== INTERVIEW IMPORTANT =====================

 Encapsulation vs Abstraction

 Encapsulation:
    -> Data hiding (private variables)

 Abstraction:
    -> Hiding implementation details.

 Common mistake:

 ❌ Public variables = NOT encapsulation.

 ===============================================================
*/