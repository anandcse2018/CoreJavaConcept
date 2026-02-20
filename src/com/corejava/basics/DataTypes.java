package com.corejava.basics;

public class DataTypes 
{
    // Example reference to another class (Reference type example)
    StaticVariable sv = new StaticVariable();

    public static void main(String[] args)
    {

        /* =========================================================
           JAVA DATA TYPES OVERVIEW
           =========================================================

           1) Primitive Data Types -> store actual value
           2) Reference Data Types -> store memory address

        ========================================================= */


        /* =========================================================
           PRIMITIVE DATA TYPES
           ========================================================= */

        byte b = 100;              // 1 byte
        short s = 20000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes
        float f = 10.5f;           // 4 bytes
        double d = 99.99;          // 8 bytes
        char c1 = 'A';             // Unicode character
        char c2 = 65;              // Unicode of 'A'
        boolean flag = true;       // true/false

        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char c1: " + c1);
        System.out.println("char c2 (unicode 65): " + c2);
        System.out.println("boolean: " + flag);


        /* =========================================================
           REFERENCE DATA TYPES
           ========================================================= */

        String name = "Anand";
        int[] marks = {90, 85, 88};
        Student student = new Student();
        Runnable r = new Thread();

        System.out.println("\n=== Reference Data Types ===");
        System.out.println("String: " + name);
        System.out.println("Array first element: " + marks[0]);
        System.out.println("Student object: " + student);
        System.out.println("Runnable reference: " + r);


        /* =========================================================
           TYPE CASTING
           ========================================================= */

        // Widening (automatic)
        int a = 10;
        double aDouble = a;

        // Narrowing (manual)
        double x = 10.75;
        int y = (int) x;

        System.out.println("\n=== Type Casting ===");
        System.out.println("Widening int->double: " + aDouble);
        System.out.println("Narrowing double->int: " + y);


        /* =========================================================
           WRAPPER CLASSES
           ========================================================= */

        int p = 20;
        Integer objP = p; // autoboxing
        int q = objP;     // unboxing

        System.out.println("\n=== Wrapper Classes ===");
        System.out.println("Primitive int p: " + p);
        System.out.println("Wrapper Integer objP: " + objP);
        System.out.println("Unboxed int q: " + q);


        /* =========================================================
           PRIMITIVE vs REFERENCE MEMORY
           ========================================================= */

        int m1 = 10;
        int m2 = m1;
        m2 = 20;

        int[] arr1 = {10};
        int[] arr2 = arr1;
        arr2[0] = 50;

        System.out.println("\n=== Memory Behavior ===");
        System.out.println("Primitive copy m1: " + m1);
        System.out.println("Primitive copy m2: " + m2);
        System.out.println("Reference arr1[0]: " + arr1[0]);
        System.out.println("Reference arr2[0]: " + arr2[0]);
    }
}
