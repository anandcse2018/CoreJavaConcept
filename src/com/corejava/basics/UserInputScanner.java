package com.corejava.basics;

import java.util.Scanner;

public class UserInputScanner
{

    /*
     * ===========================================
     * SENIOR LEVEL NOTES — SCANNER (USER INPUT)
     * ===========================================
     *
     * 1. Scanner is a high-level text parser.
     * 2. Located in java.util package.
     * 3. Internally uses:
     *        - InputStream / Readable
     *        - Buffer
     *        - Regex tokenizer
     *        - Type conversion engine
     *
     * 4. Common data source:
     *        System.in (keyboard input stream)
     *
     * 5. Default delimiter:
     *        whitespace (\s+)
     *
     * 6. Scanner reads TOKENS not characters.
     *
     * 7. Slower than BufferedReader because:
     *        - regex parsing
     *        - token boundary detection
     *        - type conversion
     *
     * 8. Not thread-safe.
     *
     * 9. Scanner is AutoCloseable.
     *
     * 10. Closing Scanner closes underlying stream.
     *
     */


    public static void main(String[] args)
    {

        // ======================================
        // 1️⃣ CREATE SCANNER OBJECT
        // ======================================

        Scanner sc = new Scanner(System.in);


        // ======================================
        // 2️⃣ READING DIFFERENT DATA TYPES
        // ======================================

        System.out.print("Enter integer: ");
        int number = sc.nextInt();   // reads next integer token

        System.out.print("Enter double: ");
        double decimal = sc.nextDouble();

        System.out.print("Enter single word: ");
        String word = sc.next();     // reads until whitespace


        // ======================================
        // 3️⃣ IMPORTANT SCANNER TRAP (NEWLINE ISSUE)
        // ======================================

        /*
         * nextInt(), nextDouble(), next() DO NOT consume newline.
         * nextLine() reads entire line including leftover newline.
         *
         * Always consume leftover newline before nextLine().
         */

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter full sentence: ");
        String sentence = sc.nextLine();


        // ======================================
        // 4️⃣ TOKEN MODEL (INTERNAL CONCEPT)
        // ======================================

        /*
         * Example input:
         *      10 hello world
         *
         * Tokens:
         *      "10"
         *      "hello"
         *      "world"
         */


        // ======================================
        // 5️⃣ HAS NEXT METHODS (SAFE READING)
        // ======================================

        /*
         * Useful when reading unknown input.
         */

        if(sc.hasNextInt())
        {
            int safeInt = sc.nextInt();
            System.out.println("Safe integer = " + safeInt);
        }


        // ======================================
        // 6️⃣ CUSTOM DELIMITER
        // ======================================

        /*
         * Default delimiter = whitespace.
         * Can change using regex.
         */

        sc.useDelimiter(",");

        /*
         * Now input like:
         *      10,20,30
         * will split using comma.
         */


        // ======================================
        // 7️⃣ LOCALE SUPPORT
        // ======================================

        /*
         * Useful for international number formats.
         * Example:
         * sc.useLocale(Locale.US);
         */


        // ======================================
        // 8️⃣ PERFORMANCE NOTE (VERY IMPORTANT)
        // ======================================

        /*
         * Scanner is slower due to:
         *      regex parsing
         *      internal buffering
         *      token validation
         *
         * For high-performance input:
         *      use BufferedReader.
         */


        // ======================================
        // 9️⃣ RESOURCE MANAGEMENT
        // ======================================

        /*
         * Closing scanner closes System.in.
         * Avoid closing in large applications
         * if further input is required.
         */

        sc.close();


        // ======================================
        // 🔟 MEMORY + INTERNAL FLOW
        // ======================================

        /*
         * Keyboard Input
         *        ↓
         * System.in (InputStream)
         *        ↓
         * Scanner Buffer
         *        ↓
         * Regex Tokenizer
         *        ↓
         * Type Conversion
         */


    }

}
