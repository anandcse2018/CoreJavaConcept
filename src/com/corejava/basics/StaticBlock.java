package com.corejava.basics;

public class StaticBlock 
{

    /*
     * =====================================
     * STATIC BLOCK - SENIOR LEVEL NOTES
     * =====================================
     *
     * Static block is executed:
     *      ✅ When class is loaded into JVM memory.
     *      ❌ NOT when object is created.
     *
     * Execution order:
     *
     * 1️⃣ Class loaded by ClassLoader
     * 2️⃣ Static variables initialized
     * 3️⃣ Static blocks executed (top to bottom)
     * 4️⃣ main() method executed
     *
     * Static block runs ONLY ONCE per class loading.
     */

    // Static variable
    static int value = initializeValue();

    // Static block 1
    static {
        System.out.println("Static Block 1 Executed");
    }

    // Static block 2
    static {
        System.out.println("Static Block 2 Executed");
    }

    // Static method used during initialization
    static int initializeValue()
    {
        System.out.println("Static variable initialized");
        return 10;
    }

    public static void main(String[] args) 
    {
        System.out.println("Main Method Executed");

        // Creating object DOES NOT re-run static block
        StaticBlock obj = new StaticBlock();
        System.out.println(value);
    }
}
