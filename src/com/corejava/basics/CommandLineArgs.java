package com.corejava.basics;

import java.util.Arrays;

public class CommandLineArgs 
{
    /*
     * ======================================
     * COMMAND LINE ARGUMENTS - SENIOR NOTES
     * ======================================
     *
     * Command line arguments are values passed
     * to the program during execution.
     *
     * They are received as:
     *
     *      public static void main(String[] args)
     *
     * args = String array created by JVM.
     *
     * Example run:
     *
     *      java CommandLineArgs Hello 123 true
     *
     * args becomes:
     *      args[0] = "Hello"
     *      args[1] = "123"
     *      args[2] = "true"
     *
     */

    public static void main(String[] args)
    {

        // ======================================
        // 1️⃣ PRINT ARGUMENTS LENGTH
        // ======================================

        System.out.println("Total arguments: " + args.length);


        // ======================================
        // 2️⃣ LOOP THROUGH ARGUMENTS
        // ======================================

        for(int i=0; i<args.length; i++)
        {
            System.out.println("args["+i+"] = " + args[i]);
        }


        // Enhanced loop
        for(String value : args)
        {
            System.out.println("Value = " + value);
        }


        // ======================================
        // 3️⃣ CONVERT STRING TO OTHER TYPES
        // ======================================

        /*
         * IMPORTANT:
         * All command-line arguments are String.
         * You must parse manually.
         */

        if(args.length >= 2)
        {
            int number = Integer.parseInt(args[1]);
            System.out.println("Parsed int = " + number);
        }


        // ======================================
        // 4️⃣ CHECK EMPTY ARGUMENTS (BEST PRACTICE)
        // ======================================

        if(args.length == 0)
        {
            System.out.println("No arguments provided.");
        }


        // ======================================
        // 5️⃣ PRINT FULL ARRAY
        // ======================================

        System.out.println(Arrays.toString(args));

    }
}
