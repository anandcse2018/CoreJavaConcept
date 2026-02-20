package com.corejava.basics;

public class VariableScope
{

    /*
     * =====================================================
     * 🔥 SENIOR LEVEL NOTES — VARIABLE SCOPE IN JAVA
     * =====================================================
     *
     * Variable Scope = where a variable is accessible
     * and how long it lives in memory.
     *
     * Types:
     *
     * 1. Local Variables
     * 2. Instance Variables
     * 3. Static (Class) Variables
     *
     */


    // =====================================================
    // 1️⃣ INSTANCE VARIABLE (OBJECT LEVEL)
    // =====================================================

    /*
     * Characteristics:
     *
     * - Declared inside class but outside methods.
     * - Belongs to object.
     * - Stored in HEAP memory.
     * - Each object has separate copy.
     * - Gets default values.
     *
     */

    int instanceVar = 10;


    // =====================================================
    // 2️⃣ STATIC VARIABLE (CLASS LEVEL)
    // =====================================================

    /*
     * Characteristics:
     *
     * - Shared across all objects.
     * - Single copy exists.
     * - Stored in Method Area / Metaspace.
     * - Access via class name preferred.
     *
     */

    static int staticVar = 20;


    public static void main(String[] args)
    {

        // =====================================================
        // 3️⃣ LOCAL VARIABLE (METHOD LEVEL)
        // =====================================================

        /*
         * Characteristics:
         *
         * - Declared inside method/block.
         * - Stored in STACK memory.
         * - No default value.
         * - Must initialize before use.
         * - Lifetime limited to block execution.
         *
         */

        int localVar = 30;

        System.out.println("Local Variable = " + localVar);


        // =====================================================
        // ACCESS INSTANCE & STATIC VARIABLES
        // =====================================================

        VariableScope obj = new VariableScope();

        System.out.println("Instance Variable = " + obj.instanceVar);

        System.out.println("Static Variable = " + VariableScope.staticVar);


        // =====================================================
        // 4️⃣ BLOCK SCOPE
        // =====================================================

        if(true)
        {
            int blockVar = 40;
            System.out.println("Block Variable = " + blockVar);
        }

        // blockVar not accessible here.


        // =====================================================
        // 5️⃣ LOOP SCOPE
        // =====================================================

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Loop variable i = " + i);
        }

        // i not accessible outside loop.


    }


    /*
     * =====================================================
     * 6️⃣ PARAMETER SCOPE
     * =====================================================
     */

    void display(int param)
    {
        System.out.println("Parameter variable = " + param);
    }



    /*
     * =====================================================
     * 7️⃣ SHADOWING (IMPORTANT SENIOR CONCEPT)
     * =====================================================
     *
     * Local variable hides instance variable with same name.
     *
     */

    int value = 100;

    void shadowExample()
    {
        int value = 50; // shadows instance variable

        System.out.println(value);        // local
        System.out.println(this.value);   // instance
    }



    /*
     * =====================================================
     * 8️⃣ VARIABLE LIFETIME SUMMARY
     * =====================================================
     *
     * Local variable:
     *      created when method called.
     *      destroyed after method ends.
     *
     * Instance variable:
     *      exists until object garbage collected.
     *
     * Static variable:
     *      exists until class unloaded.
     *
     */


    /*
     * =====================================================
     * 9️⃣ SENIOR ENGINEER NOTES
     * =====================================================
     *
     * - Prefer local variables when possible (stack faster).
     * - Avoid excessive static variables.
     * - Understand scope to avoid bugs.
     * - Thread safety important for static & instance fields.
     *
     */


}
