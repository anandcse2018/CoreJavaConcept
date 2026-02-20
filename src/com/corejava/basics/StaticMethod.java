package com.corejava.basics;

// Simple non-static class
class B 
{
    int y = 20; // instance variable (belongs to object)
}

public class StaticMethod 
{
    /*
     * ======================================
     * STATIC METHOD - SENIOR NOTES
     * ======================================
     *
     * Static method belongs to CLASS, not object.
     *
     * Memory:
     *     Stored in METHOD AREA (class-level memory).
     *
     * Can be called without object:
     *     ClassName.methodName()
     *
     * Important Rule:
     *
     * ❌ Static method CANNOT directly access:
     *      - non-static variables
     *      - non-static methods
     *
     * WHY?
     * Because static method loads when class loads,
     * but instance members require object creation.
     *
     */

    // Static method
    static void display(int x)
    {
        System.out.println("Static Method Called : " + x);

        /*
         * Accessing instance variable from another class
         * requires object creation.
         */

        B obj = new B(); // create object of class B

        System.out.println(obj.y);

        /*
         * IMPORTANT:
         * Static method accessing instance variable
         * through object reference.
         */
    }

    public static void main(String[] args) 
    {
        int x = 10;

        // Static method call using class name (best practice)
        StaticMethod.display(x);
    }
}
