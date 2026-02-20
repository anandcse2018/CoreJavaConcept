package com.corejava.basics;

public class ControlStatements 
{

    /*
     * =====================================
     * CONTROL STATEMENTS - SENIOR NOTES
     * =====================================
     *
     * Control statements control program flow.
     *
     * Types:
     *
     * 1. Decision Making
     *      - if
     *      - if-else
     *      - nested if
     *      - switch
     *
     * 2. Looping
     *      - for
     *      - while
     *      - do-while
     *
     * 3. Jump Statements
     *      - break
     *      - continue
     *      - return
     *
     */

    public static void main(String[] args)
    {

        // =====================================
        // 1️⃣ IF STATEMENT
        // =====================================

        int age = 20;

        if(age >= 18)
        {
            System.out.println("Adult");
        }


        // =====================================
        // 2️⃣ IF - ELSE
        // =====================================

        int number = 5;

        if(number % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }


        // =====================================
        // 3️⃣ ELSE IF LADDER
        // =====================================

        int marks = 75;

        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 75)
            System.out.println("Grade B");
        else
            System.out.println("Grade C");


        // =====================================
        // 4️⃣ SWITCH STATEMENT
        // =====================================

        int day = 2;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break; // prevents fall-through

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Unknown");
        }


        // =====================================
        // 5️⃣ FOR LOOP
        // =====================================

        for(int i=0; i<3; i++)
        {
            System.out.println("For loop i = "+i);
        }


        // =====================================
        // 6️⃣ WHILE LOOP
        // =====================================

        int x = 0;

        while(x < 3)
        {
            System.out.println("While loop x = "+x);
            x++;
        }


        // =====================================
        // 7️⃣ DO-WHILE LOOP
        // =====================================

        int y = 0;

        do
        {
            System.out.println("Do while y = "+y);
            y++;
        }
        while(y < 3);


        // =====================================
        // 8️⃣ BREAK STATEMENT
        // =====================================

        for(int i=0;i<10;i++)
        {
            if(i == 5)
                break; // exit loop immediately

            System.out.println("Break example "+i);
        }


        // =====================================
        // 9️⃣ CONTINUE STATEMENT
        // =====================================

        for(int i=0;i<5;i++)
        {
            if(i == 2)
                continue; // skip current iteration

            System.out.println("Continue example "+i);
        }


        // =====================================
        // 🔟 RETURN STATEMENT
        // =====================================

        checkNumber(10);

    }


    // Method example with return
    static void checkNumber(int n)
    {
        if(n < 0)
        {
            System.out.println("Negative");
            return; // exits method immediately
        }

        System.out.println("Positive");
    }

}
