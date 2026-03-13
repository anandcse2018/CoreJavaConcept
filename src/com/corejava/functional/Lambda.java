package com.corejava.functional;

import java.util.*;
import java.util.function.*;

public class Lambda {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS LAMBDA EXPRESSION?
        ============================================================

        Lambda expression is a short way to represent an
        anonymous function (function without name).

        Introduced in Java 8.

        Lambda is mainly used with:
        ✔ Functional Interface
        ✔ Stream API
        ✔ Collections
        ✔ Multithreading

        Syntax:

        (parameters) -> expression

        OR

        (parameters) -> { statements }

        Example:

        (a,b) -> a + b

        ============================================================
        */


        /*
        ============================================================
        2. NORMAL JAVA vs LAMBDA
        ============================================================
        */

        // Traditional Java
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread using anonymous class");
            }
        };

        // Lambda version (cleaner)
        Runnable r2 = () -> System.out.println("Thread using Lambda");

        r1.run();
        r2.run();


        /*
        ============================================================
        3. FUNCTIONAL INTERFACE
        ============================================================

        Lambda works ONLY with Functional Interface.

        Functional Interface = Interface with ONLY ONE
        abstract method.

        Example:
        Runnable
        Comparator
        Callable
        Predicate
        Function
        Consumer
        Supplier

        Annotation:

        @FunctionalInterface
        */


        /*
        ============================================================
        4. SIMPLE LAMBDA EXAMPLES
        ============================================================
        */

        // Example 1 : addition
        MathOperation add = (a, b) -> a + b;

        System.out.println(add.operation(10, 20));


        // Example 2 : print message
        Printer printer = message -> System.out.println(message);

        printer.print("Hello Lambda");


        /*
        ============================================================
        5. LAMBDA WITH COLLECTION
        ============================================================
        */

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        // Without lambda
        for(Integer n : list)
        {
            System.out.println(n);
        }

        // With lambda
        list.forEach(n -> System.out.println(n));

        // Method reference
        list.forEach(System.out::println);


        /*
        ============================================================
        6. LAMBDA WITH SORTING
        ============================================================
        */

        List<String> names =
                Arrays.asList("Anand", "Rohit", "Vikas", "Aman");

        // Traditional comparator
        Collections.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        // Lambda comparator
        Collections.sort(names, (a,b) -> a.compareTo(b));

        // Modern way
        names.sort((a,b) -> a.compareTo(b));


        /*
        ============================================================
        7. BUILT-IN FUNCTIONAL INTERFACES
        ============================================================

        Java provides many ready interfaces.

        Most important ones:

        Predicate
        Function
        Consumer
        Supplier
        */


        /*
        ------------------------------------------------------------
        PREDICATE
        ------------------------------------------------------------

        Takes input → returns boolean

        Method:

        test()
        */

        Predicate<Integer> isEven =
                n -> n % 2 == 0;

        System.out.println(isEven.test(10));


        /*
        ------------------------------------------------------------
        FUNCTION
        ------------------------------------------------------------

        Takes input → returns result

        Method:

        apply()
        */

        Function<Integer,Integer> square =
                n -> n * n;

        System.out.println(square.apply(5));


        /*
        ------------------------------------------------------------
        CONSUMER
        ------------------------------------------------------------

        Takes input → returns nothing

        Method:

        accept()
        */

        Consumer<String> print =
                msg -> System.out.println(msg);

        print.accept("Hello");


        /*
        ------------------------------------------------------------
        SUPPLIER
        ------------------------------------------------------------

        Takes no input → returns value

        Method:

        get()
        */

        Supplier<Double> random =
                () -> Math.random();

        System.out.println(random.get());


        /*
        ============================================================
        8. LAMBDA WITH STREAM API
        ============================================================
        */

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);


        /*
        ============================================================
        9. LAMBDA WITH THREAD
        ============================================================
        */

        Thread t = new Thread(() -> {
            System.out.println("Thread running using Lambda");
        });

        t.start();


        /*
        ============================================================
        10. LAMBDA RULES
        ============================================================

        1️⃣ Lambda can only be used with Functional Interface

        2️⃣ Parameter type can be omitted

        Example:
        (int a, int b) -> a+b
        OR
        (a,b) -> a+b

        3️⃣ If single parameter → brackets optional

        n -> n*n

        4️⃣ If single statement → {} optional

        (a,b) -> a+b

        5️⃣ If multiple statements → {} required
        */


        /*
        ============================================================
        11. LAMBDA vs ANONYMOUS CLASS
        ============================================================

        Lambda
        ------
        ✔ Less code
        ✔ Functional programming
        ✔ No new scope for 'this'

        Anonymous Class
        ----------------
        ✔ More code
        ✔ Creates new class
        ✔ Own scope
        */


        /*
        ============================================================
        12. VARIABLE CAPTURE (IMPORTANT)
        ============================================================

        Lambda can access:

        ✔ Local variables (must be final or effectively final)
        ✔ Instance variables
        ✔ Static variables
        */

        int x = 10;

        Runnable r = () -> {

            // x must not change
            System.out.println(x);

        };

        r.run();


        /*
        ============================================================
        13. METHOD REFERENCE
        ============================================================

        Short form of lambda.

        Syntax:

        Class::method

        Types:

        1️⃣ Static method reference
        2️⃣ Instance method reference
        3️⃣ Constructor reference
        */

        List<String> cities =
                Arrays.asList("Delhi","Mumbai","Pune");

        cities.forEach(System.out::println);


        /*
        ============================================================
        14. INTERVIEW QUESTIONS
        ============================================================

        Q1. What is Lambda Expression?

        Lambda is an anonymous function used to implement
        functional interface.

        Q2. Why Lambda introduced?

        ✔ Reduce boilerplate code
        ✔ Enable functional programming
        ✔ Work with Stream API

        Q3. What is functional interface?

        Interface with exactly ONE abstract method.

        Q4. Can lambda access local variables?

        Yes, but must be effectively final.

        Q5. Can lambda have multiple statements?

        Yes, but use {} block.

        */


        /*
        ============================================================
        15. TIME COMPLEXITY
        ============================================================

        Lambda itself has no complexity.

        Complexity depends on the operation
        used with it (stream, loop etc).

        Example:

        list.forEach() → O(n)
        filter() → O(n)
        map() → O(n)
        sorted() → O(n log n)

        ============================================================
        */

    }
}


/*
============================================================
CUSTOM FUNCTIONAL INTERFACE
============================================================
*/

@FunctionalInterface
interface MathOperation {

    int operation(int a, int b);
}


@FunctionalInterface
interface Printer {

    void print(String message);
}