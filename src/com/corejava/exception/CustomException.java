package com.corejava.exception;

/*
============================================================
1. WHAT IS CUSTOM EXCEPTION ?
============================================================

Custom Exception = User-defined exception.

Sometimes built-in exceptions are not enough
to describe business errors.

Example:

✔ Invalid age
✔ Invalid transaction
✔ Insufficient balance
✔ Invalid order

In such cases we create our own exception class.
*/

public class CustomException {

    public static void main(String[] args) {

        try {

            validateAge(16);

        } catch (InvalidAgeException e) {

            System.out.println("Exception caught: " + e.getMessage());

        }

        System.out.println("Program continues...");

    }


    /*
    ============================================================
    METHOD THAT MAY THROW CUSTOM EXCEPTION
    ============================================================
    */

    static void validateAge(int age) throws InvalidAgeException {

        if(age < 18)
        {
            /*
            throwing custom exception
            */
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Valid age");

    }

}



/*
============================================================
2. CUSTOM EXCEPTION CLASS
============================================================

Steps to create custom exception:

1️⃣ Extend Exception class (Checked Exception)

OR

Extend RuntimeException (Unchecked Exception)

Here we extend Exception.
*/

class InvalidAgeException extends Exception {

    /*
    constructor
    */

    public InvalidAgeException(String message) {

        super(message);  // calling parent constructor

    }

}