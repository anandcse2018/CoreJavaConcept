package com.corejava.exception;

import java.io.IOException;

public class ThrowsThrow {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS "throw" ?
        ============================================================

        throw keyword is used to explicitly throw an exception.

        Used inside method body.

        Syntax:

        throw new ExceptionType("message");

        */

        try {

            checkAge(16);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }


        /*
        ============================================================
        2. WHAT IS "throws" ?
        ============================================================

        throws keyword is used in method signature.

        It tells the caller that this method may throw exception.

        Syntax:

        methodName() throws ExceptionType

        */

        try {

            readFile();

        } catch (IOException e) {

            System.out.println("File exception handled");

        }

    }



    /*
    ============================================================
    EXAMPLE 1 : USING throw
    ============================================================
    */

    static void checkAge(int age) {

        if(age < 18)
        {
            // manually throwing exception
            throw new ArithmeticException("Age must be 18+");
        }

        System.out.println("Valid age");

    }



    /*
    ============================================================
    EXAMPLE 2 : USING throws
    ============================================================

    This method tells compiler that it may throw IOException.

    Responsibility shifts to caller method.
    */

    static void readFile() throws IOException {

        // simulate file error
        throw new IOException("File not found");

    }



    /*
    ============================================================
    IMPORTANT INTERVIEW SCENARIO
    ============================================================
    */

    static void divide(int a, int b) throws ArithmeticException {

        int result = a / b;

        System.out.println(result);

    }

}