package com.corejava.functional;

import java.util.*;

public class ForEach {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS forEach() ?
        ============================================================

        forEach() is a method introduced in Java 8.

        It is used to iterate over elements of a collection or stream
        using Lambda expression.

        It belongs to:

        1️⃣ Iterable Interface
        2️⃣ Stream API

        Method signature:

        void forEach(Consumer<? super T> action)

        Consumer = functional interface
        Method = accept(T t)

        ============================================================
        */

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        /*
        ============================================================
        2. TRADITIONAL LOOP
        ============================================================
        */

        for(Integer n : list)
        {
            System.out.println(n);
        }


        /*
        ============================================================
        3. USING forEach()
        ============================================================
        */

        list.forEach(n -> System.out.println(n));


        /*
        ============================================================
        4. METHOD REFERENCE
        ============================================================

        Cleaner syntax
        */

        list.forEach(System.out::println);



        /*
        ============================================================
        5. forEach WITH STREAM API
        ============================================================
        */

        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);



        /*
        ============================================================
        6. forEach WITH MAP
        ============================================================
        */

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Spring");
        map.put(3,"React");

        map.forEach((key,value) -> {

            System.out.println(key + " : " + value);

        });



        /*
        ============================================================
        7. MODIFY ELEMENTS USING forEach
        ============================================================

        Important note:

        forEach cannot change immutable collection elements.

        But it can modify objects.
        */

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach(n -> {

            System.out.println(n * 10);

        });



        /*
        ============================================================
        8. forEach WITH CUSTOM OBJECT
        ============================================================
        */

        List<Employee> employees = Arrays.asList(

                new Employee(1,"Anand",60000),
                new Employee(2,"Rohit",50000),
                new Employee(3,"Vikas",70000)
        );


        employees.forEach(emp -> {

            System.out.println(emp.name + " salary : " + emp.salary);

        });



        /*
        ============================================================
        9. DIFFERENCE

        forEach vs forEachOrdered
        ============================================================

        forEach
        -------
        Parallel stream may not maintain order

        forEachOrdered
        --------------
        Maintains order
        */


        list.parallelStream()
                .forEach(n -> System.out.println(n));



        list.parallelStream()
                .forEachOrdered(n -> System.out.println(n));



        /*
        ============================================================
        10. INTERNAL WORKING
        ============================================================

        Iterable interface provides default method:

        default void forEach(Consumer action)

        Internally it works like:

        for(T element : collection)
        {
            action.accept(element);
        }

        So lambda expression becomes Consumer implementation.

        Example:

        n -> System.out.println(n)

        internally becomes

        Consumer<Integer> c = new Consumer<Integer>()
        {
            public void accept(Integer n)
            {
                System.out.println(n);
            }
        }

        ============================================================
        */



        /*
        ============================================================
        11. INTERVIEW QUESTIONS
        ============================================================

        Q1: What is forEach()?

        Java 8 method used to iterate collections using lambda.

        Q2: Which interface provides forEach()?

        Iterable interface.

        Q3: What parameter does forEach() accept?

        Consumer functional interface.

        Q4: Difference between stream().forEach() and list.forEach()?

        list.forEach()
        --------------
        Works directly on collection.

        stream().forEach()
        ------------------
        Works on stream pipeline.

        Q5: Difference between forEach and forEachOrdered?

        forEach → may not preserve order in parallel stream

        forEachOrdered → preserves order

        ============================================================
        */


        /*
        ============================================================
        12. TIME COMPLEXITY
        ============================================================

        forEach() → O(n)

        Because every element must be processed.

        Parallel Stream:

        O(n / CPU cores)

        ============================================================
        */


        /*
        ============================================================
        13. BEST PRACTICES
        ============================================================

        ✔ Use method reference when possible
        ✔ Avoid modifying external state
        ✔ Use stream operations before forEach
        ✔ Avoid heavy logic inside forEach

        Example (Bad)

        list.forEach(n -> {
            if(n % 2 == 0)
            {
                System.out.println(n);
            }
        });

        Example (Better)

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);

        ============================================================
        */

    }

}


/*
============================================================
CUSTOM CLASS
============================================================
*/

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}