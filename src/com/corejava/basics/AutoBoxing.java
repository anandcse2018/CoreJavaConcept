package com.corejava.basics;

public class AutoBoxing 
{
    /*
     * =====================================
     * AUTOBOXING & UNBOXING - SENIOR NOTES
     * =====================================
     *
     * Autoboxing:
     *    Automatic conversion from primitive -> Wrapper object
     *
     * Unboxing:
     *    Automatic conversion from Wrapper object -> primitive
     *
     * Introduced in Java 5.
     *
     * WHY needed?
     *    Collections (ArrayList, HashMap, etc.) work with Objects only,
     *    not primitives.
     *
     * Wrapper Classes:
     *    int     -> Integer
     *    double  -> Double
     *    char    -> Character
     *    boolean -> Boolean
     *    long    -> Long
     *
     */

    public static void main(String[] args) 
    {
        // =====================================
        // 1️⃣ BASIC AUTOBOXING
        // =====================================

        int x = 8;

        // Compiler automatically converts primitive int to Integer object
        Integer y = x;   // Autoboxing

        // Compiler automatically converts Integer to primitive int
        int z = y;       // Unboxing

        System.out.println(x+" : "+y+" : "+z);



        // =====================================
        // 2️⃣ WHAT COMPILER ACTUALLY DOES (IMPORTANT)
        // =====================================

        // Autoboxing internally becomes:
        Integer a = Integer.valueOf(10);

        // Unboxing internally becomes:
        int b = a.intValue();



        // =====================================
        // 3️⃣ WRAPPER CLASS METHODS
        // =====================================

        Integer num = 100;

        // Convert to String
        String s = num.toString();

        // Parse string into integer
        int parsed = Integer.parseInt("123");



        // =====================================
        // 4️⃣ COMPARISON PITFALL (VERY IMPORTANT)
        // =====================================

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1 == i2); 
        // TRUE because of Integer cache (-128 to 127)

        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i3 == i4); 
        // FALSE (different objects outside cache range)

        // Correct way:
        System.out.println(i3.equals(i4)); // TRUE



        // =====================================
        // 5️⃣ NULL POINTER DANGER (SENIOR LEVEL)
        // =====================================

        Integer nullable = null;

        // int danger = nullable;  // ⚠️ NullPointerException during unboxing



        // =====================================
        // 6️⃣ AUTOBOXING INSIDE EXPRESSIONS
        // =====================================

        Integer val = 10;

        val++; 
        /*
         * Compiler does:
         * val = Integer.valueOf(val.intValue() + 1);
         */



        // =====================================
        // 7️⃣ PERFORMANCE CONSIDERATION
        // =====================================

        /*
         * Avoid heavy autoboxing inside loops:
         * creates many temporary objects -> slow
         */

        long start = System.currentTimeMillis();

        Integer sum = 0;

        for(int i=0; i<10000; i++)
        {
            sum += i; // boxing/unboxing happening repeatedly
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: "+(end-start));



        // =====================================
        // 8️⃣ COLLECTIONS REQUIRE WRAPPER TYPES
        // =====================================

        /*
         * ArrayList<int>  ❌ not allowed
         * ArrayList<Integer> ✅ required
         */


        // =====================================
        // 9️⃣ MANUAL BOXING (OLD STYLE)
        // =====================================

        Integer manual = new Integer(5); 
        // Deprecated - avoid

        Integer preferred = Integer.valueOf(5);



        // =====================================
        // 🔟 AUTOBOXING IN METHOD CALLS
        // =====================================

        printInteger(20); // int automatically boxed to Integer

    }


    // Method expecting Integer object
    static void printInteger(Integer value)
    {
        System.out.println("Wrapper value = "+value);
    }
}
