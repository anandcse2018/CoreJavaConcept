package com.corejava;

public class CoreJava
{

    /*
     * =====================================================
     * 🔥 FULL CORE JAVA — SENIOR LEVEL REFERENCE NOTES
     * =====================================================
     *
     * Java Philosophy:
     * ----------------
     * 1. Write Once Run Anywhere (WORA).
     * 2. Compiled + Interpreted language.
     * 3. Strongly typed, object-oriented.
     * 4. Managed memory via JVM.
     *
     */


    /*
     * =====================================================
     * 1️⃣ JVM ARCHITECTURE (HIGH LEVEL)
     * =====================================================
     *
     * Java Code (.java)
     *        ↓
     * Compiler (javac)
     *        ↓
     * Bytecode (.class)
     *        ↓
     * JVM executes bytecode.
     *
     * JVM Components:
     * ----------------
     * - ClassLoader
     * - Runtime Data Areas
     * - Execution Engine
     * - Garbage Collector
     *
     */


    /*
     * =====================================================
     * 2️⃣ MEMORY AREAS (VERY IMPORTANT)
     * =====================================================
     *
     * STACK:
     * - Method calls
     * - Local variables
     *
     * HEAP:
     * - Objects
     * - Arrays
     *
     * METASPACE:
     * - Class metadata
     * - Static variables
     *
     * PC REGISTER:
     * - Current instruction pointer.
     *
     */


    /*
     * =====================================================
     * 3️⃣ CLASS LOADING LIFECYCLE
     * =====================================================
     *
     * Loading
     * Linking
     *    - Verify
     *    - Prepare
     *    - Resolve
     * Initialization
     *
     * Static blocks execute during initialization.
     *
     */


    /*
     * =====================================================
     * 4️⃣ OOP CONCEPTS (DEEP UNDERSTANDING)
     * =====================================================
     *
     * Encapsulation:
     * - Data hiding using private fields.
     *
     * Inheritance:
     * - Code reuse.
     *
     * Polymorphism:
     *    Compile-time → Method overloading.
     *    Runtime → Method overriding.
     *
     * Abstraction:
     * - Abstract classes / Interfaces.
     *
     */


    /*
     * =====================================================
     * 5️⃣ CLASS VS OBJECT
     * =====================================================
     *
     * Class:
     * - Blueprint.
     *
     * Object:
     * - Instance of class.
     *
     * Object creation:
     *
     * new keyword →
     *      memory allocation
     *      default initialization
     *      constructor call
     *
     */


    /*
     * =====================================================
     * 6️⃣ VARIABLES TYPES
     * =====================================================
     *
     * Local variable:
     * - inside method.
     *
     * Instance variable:
     * - belongs to object.
     *
     * Static variable:
     * - belongs to class.
     *
     */


    /*
     * =====================================================
     * 7️⃣ METHODS
     * =====================================================
     *
     * Instance methods:
     * - require object.
     *
     * Static methods:
     * - belong to class.
     *
     * Method Signature:
     * - method name + parameter types.
     *
     */


    /*
     * =====================================================
     * 8️⃣ ACCESS MODIFIERS
     * =====================================================
     *
     * public
     * protected
     * default (package-private)
     * private
     *
     */


    /*
     * =====================================================
     * 9️⃣ STRING INTERN CONCEPT
     * =====================================================
     *
     * String pool exists in heap.
     *
     * String s1 = "hello";
     * String s2 = "hello";   // same reference from pool.
     *
     */


    /*
     * =====================================================
     * 🔟 COLLECTION FRAMEWORK OVERVIEW
     * =====================================================
     *
     * List:
     *      ArrayList → dynamic array.
     *      LinkedList → doubly linked list.
     *
     * Set:
     *      HashSet → no duplicates.
     *
     * Map:
     *      HashMap → key-value storage.
     *
     */


    /*
     * =====================================================
     * 1️⃣1️⃣ EXCEPTION HANDLING
     * =====================================================
     *
     * try
     * catch
     * finally
     *
     * Checked vs Unchecked exceptions.
     *
     */


    /*
     * =====================================================
     * 1️⃣2️⃣ MULTITHREADING
     * =====================================================
     *
     * Thread lifecycle:
     * NEW → RUNNABLE → RUNNING → BLOCKED → TERMINATED
     *
     * Synchronization prevents race condition.
     *
     */


    /*
     * =====================================================
     * 1️⃣3️⃣ GARBAGE COLLECTION
     * =====================================================
     *
     * Automatically removes unused objects.
     *
     * GC triggers when:
     * - memory pressure
     * - JVM decision
     *
     */


    /*
     * =====================================================
     * 1️⃣4️⃣ IMPORTANT KEYWORDS
     * =====================================================
     *
     * this → current object reference.
     * super → parent reference.
     * final → constant / prevent override.
     * abstract → incomplete class.
     *
     */


    /*
     * =====================================================
     * 1️⃣5️⃣ SENIOR ENGINEER MENTAL MODEL
     * =====================================================
     *
     * Java Program =
     *
     * Source Code
     *      ↓
     * Bytecode
     *      ↓
     * ClassLoader
     *      ↓
     * Memory Areas
     *      ↓
     * Execution Engine
     *
     */
	
	/*
     * =====================================================
     * 🔥 CONTINUATION — ULTRA SENIOR CORE JAVA NOTES
     * =====================================================
     */


    /*
     * =====================================================
     * 1️⃣6️⃣ CLASSLOADER ARCHITECTURE (VERY IMPORTANT)
     * =====================================================
     *
     * Types of ClassLoader:
     *
     * 1. Bootstrap ClassLoader
     *      - Loads core Java classes (java.lang.*)
     *
     * 2. Platform ClassLoader
     *      - Loads extension libraries.
     *
     * 3. Application ClassLoader
     *      - Loads user-defined classes.
     *
     * Delegation Model:
     *      Child asks parent first.
     *
     * Why?
     *      Security + Avoid duplicate loading.
     *
     */


    /*
     * =====================================================
     * 1️⃣7️⃣ OBJECT MEMORY STRUCTURE (JVM INTERNALS)
     * =====================================================
     *
     * Object layout:
     *
     * 1. Object Header
     *      - Mark Word (lock state, hashcode)
     *      - Class metadata pointer
     *
     * 2. Instance Data
     *      - actual fields
     *
     * 3. Padding
     *      - memory alignment.
     *
     */


    /*
     * =====================================================
     * 1️⃣8️⃣ STRING INTERNALS (VERY IMPORTANT)
     * =====================================================
     *
     * String is immutable.
     *
     * Reasons:
     *      - security
     *      - caching
     *      - thread safety
     *
     * String Pool:
     *
     * String a = "abc";
     * String b = "abc";   // same reference.
     *
     * new String("abc") → new object in heap.
     *
     * Interning:
     *      s.intern();
     *
     */


    /*
     * =====================================================
     * 1️⃣9️⃣ HASHMAP INTERNAL WORKING (SENIOR LEVEL)
     * =====================================================
     *
     * Data Structure:
     *      Array of Nodes.
     *
     * Hashing:
     *      hash(key) → index.
     *
     * Collision Handling:
     *      - Linked list (Java 7)
     *      - Tree (Java 8+) if bucket large.
     *
     * Steps during put():
     *
     * 1. calculate hash
     * 2. find bucket index
     * 3. check collision
     * 4. insert node
     *
     */


    /*
     * =====================================================
     * 2️⃣0️⃣ EQUALS & HASHCODE CONTRACT
     * =====================================================
     *
     * Rules:
     *
     * If equals() true → hashCode must same.
     *
     * Used heavily in:
     *      HashMap
     *      HashSet
     *
     */


    /*
     * =====================================================
     * 2️⃣1️⃣ COLLECTIONS PERFORMANCE OVERVIEW
     * =====================================================
     *
     * ArrayList:
     *      get() → O(1)
     *      add() → amortized O(1)
     *
     * LinkedList:
     *      insert/remove fast
     *      random access slow.
     *
     * HashMap:
     *      average O(1).
     *
     */


    /*
     * =====================================================
     * 2️⃣2️⃣ THREAD CREATION METHODS
     * =====================================================
     *
     * 1. Extend Thread class.
     * 2. Implement Runnable.
     * 3. ExecutorService (recommended).
     *
     */


    /*
     * =====================================================
     * 2️⃣3️⃣ THREAD STATES
     * =====================================================
     *
     * NEW
     * RUNNABLE
     * BLOCKED
     * WAITING
     * TIMED_WAITING
     * TERMINATED
     *
     */


    /*
     * =====================================================
     * 2️⃣4️⃣ SYNCHRONIZATION CONCEPT
     * =====================================================
     *
     * synchronized keyword:
     *
     * - ensures only one thread enters.
     *
     * Types:
     *      synchronized method
     *      synchronized block
     *
     * Uses monitor lock.
     *
     */


    /*
     * =====================================================
     * 2️⃣5️⃣ VOLATILE KEYWORD
     * =====================================================
     *
     * Guarantees:
     *      - visibility
     *      - no caching by thread.
     *
     * Not for atomic operations.
     *
     */


    /*
     * =====================================================
     * 2️⃣6️⃣ EXECUTOR FRAMEWORK (SENIOR)
     * =====================================================
     *
     * Thread pool management.
     *
     * Executors.newFixedThreadPool()
     *
     * Benefits:
     *      - reuse threads
     *      - performance
     *
     */


    /*
     * =====================================================
     * 2️⃣7️⃣ STREAM API (JAVA 8)
     * =====================================================
     *
     * Functional processing of collections.
     *
     * Example:
     * list.stream()
     *     .filter()
     *     .map()
     *     .collect()
     *
     */


    /*
     * =====================================================
     * 2️⃣8️⃣ LAMBDA EXPRESSIONS
     * =====================================================
     *
     * Short syntax for functional interface.
     *
     * (a,b) -> a + b
     *
     */


    /*
     * =====================================================
     * 2️⃣9️⃣ OPTIONAL CLASS
     * =====================================================
     *
     * Avoid NullPointerException.
     *
     * Optional.ofNullable(value)
     *
     */


    /*
     * =====================================================
     * 3️⃣0️⃣ SENIOR ENGINEER MENTAL MODEL
     * =====================================================
     *
     * Understand:
     *      JVM memory
     *      Object creation
     *      Collections internals
     *      Thread safety
     *      Performance trade-offs.
     *
     */
	
	/*
     * =====================================================
     * 🔥 MASTER LEVEL CORE JAVA NOTES (ULTRA SENIOR)
     * =====================================================
     */


    /*
     * =====================================================
     * 3️⃣1️⃣ JVM GARBAGE COLLECTION (DEEP UNDERSTANDING)
     * =====================================================
     *
     * Purpose:
     *      Automatically remove unreachable objects.
     *
     * Memory Generations:
     *
     * Young Generation:
     *      - Eden
     *      - Survivor S0
     *      - Survivor S1
     *
     * Old Generation:
     *      - Long living objects.
     *
     * Metaspace:
     *      - Class metadata.
     *
     */


    /*
     * =====================================================
     * 3️⃣2️⃣ GC ALGORITHMS (SENIOR LEVEL)
     * =====================================================
     *
     * Serial GC:
     *      Single-threaded.
     *
     * Parallel GC:
     *      Multiple threads.
     *
     * CMS (Concurrent Mark Sweep):
     *      Low pause times.
     *
     * G1 GC:
     *      Region-based memory.
     *      Predictable pause time.
     *
     * ZGC / Shenandoah:
     *      Ultra low latency collectors.
     *
     */


    /*
     * =====================================================
     * 3️⃣3️⃣ MEMORY LEAKS IN JAVA (YES, POSSIBLE!)
     * =====================================================
     *
     * Common causes:
     *
     * - Static collections holding references.
     * - Unclosed resources.
     * - Listener not removed.
     * - ThreadLocal misuse.
     *
     */


    /*
     * =====================================================
     * 3️⃣4️⃣ CONCURRENTHASHMAP INTERNAL DESIGN
     * =====================================================
     *
     * Java 7:
     *      Segmented locking.
     *
     * Java 8+:
     *      CAS operations.
     *      synchronized on buckets.
     *
     * Benefits:
     *      High concurrency.
     *
     */


    /*
     * =====================================================
     * 3️⃣5️⃣ THREADLOCAL INTERNALS
     * =====================================================
     *
     * ThreadLocalMap inside Thread.
     *
     * Each thread holds its own copy.
     *
     * Structure:
     *      Thread
     *          ↓
     *      ThreadLocalMap
     *          ↓
     *      Entry(key,value)
     *
     */


    /*
     * =====================================================
     * 3️⃣6️⃣ REFLECTION API (ADVANCED)
     * =====================================================
     *
     * Inspect class at runtime.
     *
     * Example:
     *
     * Class<?> c = Class.forName("MyClass");
     *
     * Uses:
     *      frameworks (Spring, Hibernate).
     *
     */


    /*
     * =====================================================
     * 3️⃣7️⃣ CLASS VS INTERFACE VS ABSTRACT
     * =====================================================
     *
     * Class:
     *      Full implementation.
     *
     * Abstract class:
     *      Partial implementation.
     *
     * Interface:
     *      Contract definition.
     *
     */


    /*
     * =====================================================
     * 3️⃣8️⃣ FUNCTIONAL INTERFACES
     * =====================================================
     *
     * Single abstract method.
     *
     * Example:
     *      Runnable
     *      Comparator
     *
     */


    /*
     * =====================================================
     * 3️⃣9️⃣ JAVA MEMORY MODEL (JMM)
     * =====================================================
     *
     * Defines:
     *      Thread visibility rules.
     *
     * Happens-before relationship.
     *
     * volatile ensures visibility.
     *
     */


    /*
     * =====================================================
     * 4️⃣0️⃣ LOCK TYPES (VERY SENIOR)
     * =====================================================
     *
     * Biased Locking
     * Lightweight Lock
     * Heavyweight Monitor Lock
     *
     * JVM upgrades lock depending on contention.
     *
     */


    /*
     * =====================================================
     * 4️⃣1️⃣ IMMUTABLE OBJECT DESIGN
     * =====================================================
     *
     * Benefits:
     *      Thread safety.
     *      Cacheable.
     *
     * Steps:
     *      final class
     *      private final fields
     *      no setters.
     *
     */


    /*
     * =====================================================
     * 4️⃣2️⃣ FAIL-FAST VS FAIL-SAFE ITERATORS
     * =====================================================
     *
     * Fail-fast:
     *      ArrayList iterator.
     *
     * Fail-safe:
     *      ConcurrentHashMap iterator.
     *
     */


    /*
     * =====================================================
     * 4️⃣3️⃣ PERFORMANCE OPTIMIZATION (SENIOR THINKING)
     * =====================================================
     *
     * Avoid unnecessary object creation.
     * Use StringBuilder instead of String concat.
     * Prefer primitives when possible.
     * Understand GC pressure.
     *
     */


    /*
     * =====================================================
     * 4️⃣4️⃣ DESIGN PRINCIPLES (HIGH LEVEL)
     * =====================================================
     *
     * SOLID Principles:
     *
     * S - Single Responsibility
     * O - Open Closed
     * L - Liskov Substitution
     * I - Interface Segregation
     * D - Dependency Inversion
     *
     */


    /*
     * =====================================================
     * 4️⃣5️⃣ SENIOR ENGINEER MINDSET
     * =====================================================
     *
     * Always ask:
     *
     * - Memory cost?
     * - Thread safety?
     * - Performance?
     * - Scalability?
     *
     */
	
	/*
     * =====================================================
     * 🔥 ARCHITECT LEVEL JAVA NOTES (ULTRA DEEP)
     * =====================================================
     */


    /*
     * =====================================================
     * 4️⃣6️⃣ BYTECODE EXECUTION FLOW
     * =====================================================
     *
     * Java source (.java)
     *        ↓
     * javac compiler
     *        ↓
     * Bytecode (.class)
     *        ↓
     * JVM executes bytecode instruction-by-instruction.
     *
     * Bytecode is platform independent.
     *
     * Example instructions:
     *      aload_0
     *      invokespecial
     *      return
     *
     */


    /*
     * =====================================================
     * 4️⃣7️⃣ INTERPRETER VS JIT COMPILER
     * =====================================================
     *
     * Interpreter:
     *      Executes bytecode line by line.
     *
     * JIT (Just-In-Time compiler):
     *      Converts hot code into native machine code.
     *
     * Benefit:
     *      Faster execution after warm-up.
     *
     */


    /*
     * =====================================================
     * 4️⃣8️⃣ HOTSPOT OPTIMIZATION (VERY IMPORTANT)
     * =====================================================
     *
     * JVM monitors frequently executed methods.
     *
     * Hot methods → compiled by JIT.
     *
     * Optimizations:
     *      - method inlining
     *      - loop unrolling
     *      - dead code elimination
     *
     */


    /*
     * =====================================================
     * 4️⃣9️⃣ ESCAPE ANALYSIS
     * =====================================================
     *
     * JVM checks if object escapes method scope.
     *
     * If NOT escaping:
     *      - allocate on stack instead of heap.
     *      - eliminate synchronization.
     *
     */


    /*
     * =====================================================
     * 5️⃣0️⃣ LOCK OPTIMIZATION (ADVANCED JVM)
     * =====================================================
     *
     * Lock Elimination:
     *      Remove unnecessary synchronization.
     *
     * Lock Coarsening:
     *      Combine multiple locks into one.
     *
     * Biased locking:
     *      Optimized for single-thread access.
     *
     */


    /*
     * =====================================================
     * 5️⃣1️⃣ JAVA MEMORY MODEL VS CPU CACHE
     * =====================================================
     *
     * CPU has multiple cores.
     * Each core has its own cache.
     *
     * Problem:
     *      visibility between threads.
     *
     * Java Memory Model ensures:
     *      happens-before rules.
     *
     */


    /*
     * =====================================================
     * 5️⃣2️⃣ FALSE SHARING (ARCHITECT LEVEL)
     * =====================================================
     *
     * Multiple variables in same cache line.
     *
     * Different threads update them →
     * cache invalidation → performance drop.
     *
     * Solution:
     *      padding / @Contended.
     *
     */


    /*
     * =====================================================
     * 5️⃣3️⃣ FORKJOINPOOL (ADVANCED CONCURRENCY)
     * =====================================================
     *
     * Divide task into smaller subtasks.
     *
     * Work-stealing algorithm:
     *      idle thread steals work from busy thread.
     *
     */


    /*
     * =====================================================
     * 5️⃣4️⃣ NON-BLOCKING CONCURRENCY (CAS)
     * =====================================================
     *
     * Compare-And-Swap (CAS).
     *
     * Used in:
     *      AtomicInteger
     *      ConcurrentHashMap
     *
     * Avoids heavy locks.
     *
     */


    /*
     * =====================================================
     * 5️⃣5️⃣ ATOMIC CLASSES
     * =====================================================
     *
     * AtomicInteger
     * AtomicLong
     *
     * Internally uses:
     *      Unsafe class + CAS instructions.
     *
     */


    /*
     * =====================================================
     * 5️⃣6️⃣ DIRECT MEMORY (OFF-HEAP)
     * =====================================================
     *
     * Allocated outside JVM heap.
     *
     * Used in:
     *      NIO buffers.
     *
     * Benefits:
     *      reduce GC pressure.
     *
     */


    /*
     * =====================================================
     * 5️⃣7️⃣ GC PAUSE & LATENCY (ARCHITECT VIEW)
     * =====================================================
     *
     * Stop-the-world events.
     *
     * Architect must choose GC based on:
     *      latency requirements.
     *
     */


    /*
     * =====================================================
     * 5️⃣8️⃣ THREAD POOL DESIGN (SYSTEM LEVEL)
     * =====================================================
     *
     * Core size
     * Queue type
     * Rejection policy
     *
     * Avoid creating too many threads.
     *
     */


    /*
     * =====================================================
     * 5️⃣9️⃣ REACTIVE VS BLOCKING ARCHITECTURE
     * =====================================================
     *
     * Blocking:
     *      one thread per request.
     *
     * Reactive:
     *      event-driven.
     *      non-blocking IO.
     *
     */


    /*
     * =====================================================
     * 6️⃣0️⃣ ARCHITECT ENGINEER MENTAL MODEL
     * =====================================================
     *
     * Always consider:
     *
     * - CPU cache behavior
     * - memory allocation
     * - GC pauses
     * - lock contention
     * - scalability under load.
     *
     */

    public static void main(String[] args)
    {
        System.out.println("Core Java Senior Reference Class");
    }

}