package com.corejava.functional;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS STREAM API?
        ============================================================

        Stream API introduced in Java 8.

        A Stream is a sequence of elements that supports functional
        style operations (map, filter, reduce etc) to process data.

        IMPORTANT:
        Stream DOES NOT store data.
        It processes data from a source (Collection, Array, IO).

        Data Source → Stream → Intermediate Operations → Terminal Operation

        Example:
        List → stream() → filter() → map() → collect()

        ============================================================
        KEY FEATURES
        ============================================================

        1. Functional Programming style
        2. Declarative programming
        3. Internal Iteration
        4. Lazy evaluation
        5. Parallel processing support
        */

        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        numbers.stream().forEach(n -> System.out.println(n));


        /*
        ============================================================
        2. STREAM VS COLLECTION
        ============================================================

        COLLECTION
        ----------
        - Stores data
        - Eager processing
        - External iteration (for loop)

        STREAM
        ------
        - Does NOT store data
        - Lazy processing
        - Internal iteration
        - Functional style operations
        */


        /*
        ============================================================
        3. HOW TO CREATE STREAM
        ============================================================
        */

        // 1. From Collection
        List<String> list = List.of("Java","Spring","AWS");

        Stream<String> s1 = list.stream();

        // 2. Parallel Stream
        Stream<String> s2 = list.parallelStream();

        // 3. From Array
        int[] arr = {1,2,3,4,5};
        IntStream s3 = Arrays.stream(arr);

        // 4. Stream.of()
        Stream<Integer> s4 = Stream.of(1,2,3,4,5);

        // 5. Generate infinite stream
        Stream<Integer> infinite = Stream.iterate(0, n -> n + 2)
                                         .limit(5);

        infinite.forEach(System.out::println);


        /*
        ============================================================
        4. STREAM OPERATIONS
        ============================================================

        Two types:

        1️⃣ Intermediate Operations
        2️⃣ Terminal Operations
        */

        /*
        ---------------------------
        INTERMEDIATE OPERATIONS
        ---------------------------

        - Returns another Stream
        - Lazy execution
        - Multiple allowed
        */

        List<Integer> data = List.of(1,2,3,4,5,6,7,8);

        data.stream()
            .filter(n -> n % 2 == 0)     // filter even numbers
            .map(n -> n * n)             // square them
            .forEach(System.out::println); // terminal


        /*
        Common Intermediate Operations

        filter()
        map()
        flatMap()
        sorted()
        distinct()
        limit()
        skip()
        peek()
        */


        /*
        filter()

        used to select elements based on condition
        */

        List<Integer> even =
                data.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());


        /*
        map()

        transforms each element
        */

        List<Integer> squares =
                data.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());


        /*
        flatMap()

        used to flatten nested collections
        */

        List<List<Integer>> nested =
                List.of(List.of(1,2), List.of(3,4));

        List<Integer> flat =
                nested.stream()
                      .flatMap(List::stream)
                      .collect(Collectors.toList());


        /*
        sorted()
        */

        List<Integer> sorted =
                data.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());


        /*
        distinct()

        removes duplicates
        */

        List<Integer> duplicates =
                List.of(1,2,2,3,3,4);

        duplicates.stream()
                  .distinct()
                  .forEach(System.out::println);


        /*
        ============================================================
        TERMINAL OPERATIONS
        ============================================================

        Terminal operation produces result or side effect.

        Once terminal operation executed,
        stream is CLOSED.
        */

        /*
        Common Terminal Operations

        forEach()
        collect()
        reduce()
        count()
        min()
        max()
        findFirst()
        anyMatch()
        allMatch()
        */


        /*
        collect()

        converts stream to collection
        */

        List<Integer> result =
                data.stream()
                    .filter(n -> n > 3)
                    .collect(Collectors.toList());


        /*
        reduce()

        reduces stream to single value
        */

        int sum =
                data.stream()
                    .reduce(0, (a,b) -> a + b);

        System.out.println("Sum = " + sum);


        /*
        count()
        */

        long count =
                data.stream()
                    .filter(n -> n > 3)
                    .count();


        /*
        min() / max()
        */

        Optional<Integer> max =
                data.stream()
                    .max(Integer::compare);

        max.ifPresent(System.out::println);


        /*
        ============================================================
        5. LAZY EVALUATION
        ============================================================

        Intermediate operations do NOT execute immediately.

        They run ONLY when terminal operation starts.

        Example pipeline:
        */

        data.stream()
            .filter(n -> {
                System.out.println("Filtering " + n);
                return n > 3;
            })
            .map(n -> {
                System.out.println("Mapping " + n);
                return n * 2;
            })
            .findFirst();


        /*
        Only minimum operations executed.
        This improves performance.
        */


        /*
        ============================================================
        6. PARALLEL STREAM
        ============================================================

        Stream API can process data in parallel using
        ForkJoinPool.

        Example
        */

        List<Integer> bigData =
                IntStream.rangeClosed(1,1000)
                         .boxed()
                         .collect(Collectors.toList());

        bigData.parallelStream()
               .map(n -> n * 2)
               .forEach(System.out::println);


        /*
        Use parallel streams when:

        ✔ Large dataset
        ✔ CPU intensive tasks
        ✔ Stateless operations
        */


        /*
        ============================================================
        7. STREAM PIPELINE
        ============================================================

        Stream processing pipeline has 3 parts:

        1️⃣ Source
        2️⃣ Intermediate Operations
        3️⃣ Terminal Operation

        Example:

        List → stream()
              → filter()
              → map()
              → collect()

        */


        /*
        ============================================================
        8. OPTIONAL IN STREAM
        ============================================================

        Many stream operations return Optional.

        Why?

        Because result may not exist.
        */

        Optional<Integer> first =
                data.stream()
                    .filter(n -> n > 100)
                    .findFirst();

        first.ifPresent(System.out::println);


        /*
        ============================================================
        9. INTERVIEW QUESTIONS
        ============================================================

        Q1: Difference between map() and flatMap()?

        map() → one input → one output
        flatMap() → one input → multiple outputs


        Q2: Stream vs Parallel Stream?

        stream() → sequential
        parallelStream() → multi-threaded


        Q3: Why Stream is lazy?

        To improve performance by executing
        only required operations.


        Q4: Can we reuse Stream?

        ❌ NO

        Stream can be used only once.


        Q5: What is reduce()?

        Reduce combines stream elements
        into single result.

        Example: sum, multiplication etc.


        ============================================================
        10. TIME COMPLEXITY
        ============================================================

        filter()   → O(n)
        map()      → O(n)
        sorted()   → O(n log n)
        distinct() → O(n)
        reduce()   → O(n)

        Parallel Stream can reduce processing time
        depending on CPU cores.


        ============================================================
        11. BEST PRACTICES
        ============================================================

        ✔ Prefer stream for data transformation
        ✔ Avoid modifying shared state
        ✔ Avoid parallel stream for small datasets
        ✔ Keep operations stateless
        ✔ Use method references when possible

        Example:
        list.forEach(System.out::println);

        ============================================================
        */
    }
}