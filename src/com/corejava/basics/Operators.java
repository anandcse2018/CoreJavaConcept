package com.corejava.basics;

public class Operators 
{
    public static void main(String[] args) {

        System.out.println("========= JAVA OPERATORS FULL REVISION =========\n");

        /* =====================================================
         * 1. ARITHMETIC OPERATORS
         * ===================================================== */
        int a = 10, b = 3;

        System.out.println("---- Arithmetic Operators ----");
        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division (int division → floor)
        System.out.println("a % b = " + (a % b));   // Modulus (remainder)

        // IMPORTANT:
        // int/int = int (decimal lost)
        System.out.println("10/3 = " + (10/3));     // 3
        System.out.println("10/3.0 = " + (10/3.0)); // 3.333...


        /* =====================================================
         * 2. UNARY OPERATORS
         * ===================================================== */
        int x = 5;

        System.out.println("\n---- Unary Operators ----");
        System.out.println("+x = " + (+x));   // Unary plus
        System.out.println("-x = " + (-x));   // Unary minus
        System.out.println("++x = " + (++x)); // Pre-increment → first increment, then use
        System.out.println("x++ = " + (x++)); // Post-increment → first use, then increment
        System.out.println("x after x++ = " + x);
        System.out.println("--x = " + (--x)); // Pre-decrement
        System.out.println("x-- = " + (x--)); // Post-decrement

        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // Logical NOT


        /* =====================================================
         * 3. RELATIONAL (COMPARISON) OPERATORS
         * ===================================================== */
        System.out.println("\n---- Relational Operators ----");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));  // value comparison
        System.out.println("a != b = " + (a != b));


        /* =====================================================
         * 4. LOGICAL OPERATORS
         * ===================================================== */
        boolean p = true, q = false;

        System.out.println("\n---- Logical Operators ----");
        System.out.println("p && q = " + (p && q)); // AND
        System.out.println("p || q = " + (p || q)); // OR
        System.out.println("!p     = " + (!p));     // NOT

        // Short-circuit behavior
        int n = 10;
        System.out.println("\nShort-circuit demo:");
        if (false && (++n > 5)) { }   // ++n not executed
        System.out.println("n after && = " + n);    // still 10

        if (true || (++n > 5)) { }    // ++n not executed
        System.out.println("n after || = " + n);    // still 10


        /* =====================================================
         * 5. BITWISE OPERATORS
         * ===================================================== */
        int m = 5;  // 0101
        int k = 3;  // 0011

        System.out.println("\n---- Bitwise Operators ----");
        System.out.println("m & k = " + (m & k));  // AND  -> 0001 = 1
        System.out.println("m | k = " + (m | k));  // OR   -> 0111 = 7
        System.out.println("m ^ k = " + (m ^ k));  // XOR  -> 0110 = 6
        System.out.println("~m    = " + (~m));     // NOT  -> 2's complement (flip bits)


        /* =====================================================
         * 6. SHIFT OPERATORS
         * ===================================================== */
        int s = 8;  // 1000

        System.out.println("\n---- Shift Operators ----");
        System.out.println("s << 1  = " + (s << 1));   // Left shift (multiply by 2)
        System.out.println("s >> 1  = " + (s >> 1));   // Right shift (divide by 2)
        System.out.println("s >>> 1 = " + (s >>> 1));  // Unsigned right shift

        // IMPORTANT:
        // >>  = preserves sign bit
        // >>> = does NOT preserve sign bit (fills with 0)


        /* =====================================================
         * 7. ASSIGNMENT OPERATORS
         * ===================================================== */
        int z = 10;

        System.out.println("\n---- Assignment Operators ----");
        z += 5;   // z = z + 5
        System.out.println("z += 5 -> " + z);

        z -= 2;
        System.out.println("z -= 2 -> " + z);

        z *= 2;
        System.out.println("z *= 2 -> " + z);

        z /= 2;
        System.out.println("z /= 2 -> " + z);

        z %= 3;
        System.out.println("z %= 3 -> " + z);


        /* =====================================================
         * 8. TERNARY OPERATOR
         * ===================================================== */
        int age = 20;

        System.out.println("\n---- Ternary Operator ----");
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result = " + result);

        // Syntax:
        // condition ? value_if_true : value_if_false


        /* =====================================================
         * 9. instanceof OPERATOR
         * ===================================================== */
        String str = "Java";

        System.out.println("\n---- instanceof Operator ----");
        System.out.println(str instanceof String);   // true
        System.out.println(str instanceof Object);   // true


        /* =====================================================
         * 10. TYPE CASTING OPERATOR
         * ===================================================== */
        System.out.println("\n---- Type Casting ----");

        double d = 10.75;
        int di = (int) d;  // explicit casting (narrowing)
        System.out.println("double to int = " + di); // 10

        int ii = 10;
        double id = ii;   // implicit casting (widening)
        System.out.println("int to double = " + id);


        /* =====================================================
         * 11. STRING CONCATENATION OPERATOR (+)
         * ===================================================== */
        System.out.println("\n---- String Concatenation ----");
        System.out.println("Java" + 8);       // Java8
        System.out.println(10 + 20 + "Java"); // 30Java
        System.out.println("Java" + 10 + 20); // Java1020


        System.out.println("\n========= END OF OPERATORS REVISION =========");
    }
}
