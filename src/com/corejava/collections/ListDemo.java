package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ======================= MASTER LIST REVISION ==================
 ===============================================================

 LIST OVERVIEW

 ✔ List is an interface (java.util)
 ✔ Ordered collection (maintains insertion order)
 ✔ Allows duplicate elements
 ✔ Allows index-based access
 ✔ Allows multiple null values

 WHY LIST?

 -> When positional access required
 -> When duplicates allowed

 ===============================================================
 IMPLEMENTATIONS

 1) ArrayList
 2) LinkedList
 3) Vector (legacy, synchronized)

 ===============================================================
 TIME COMPLEXITY SUMMARY

                     ArrayList        LinkedList

 add(e)              O(1)*            O(1)
 add(index,e)        O(n)             O(n)
 get(index)          O(1)             O(n)
 set(index,e)        O(1)             O(n)
 remove(index)       O(n)             O(n)
 contains()          O(n)             O(n)

 *Amortized (dynamic resizing may occur)

 ===============================================================
 INTERNAL STRUCTURE

 ArrayList  -> Dynamic Array
 LinkedList -> Doubly Linked List
 Vector     -> Synchronized Dynamic Array

 ===============================================================
*/

public class ListDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ======================= ARRAYLIST =========================

        - Backed by dynamic array
        - Fast random access (O(1))
        - Slow insertion/removal in middle (shifting required)
        ===========================================================
        */

        List<String> list1 = new ArrayList<>();

        // add(element) -> O(1)
        list1.add("Anand");

        // add(index, element) -> O(n)
        list1.add(0,"Ajay");

        System.out.println(list1);


        /*
        ===========================================================
        ======================= addAll() ==========================
        ===========================================================
        */

        List<String> list2 = new ArrayList<>();

        list2.add("Aman");

        // addAll(Collection) -> O(n)
        list2.addAll(list1);

        // addAll(index, Collection) -> O(n)
        list2.addAll(0,list1);

        System.out.println(list2);


        /*
        ===========================================================
        ======================== REMOVE ===========================

        remove(index)  -> O(n)
        remove(object) -> O(n)
        ===========================================================
        */

        list2.remove(0);
        list2.remove("Anand");

        System.out.println(list2);


        /*
        ===========================================================
        ======================== SET ==============================

        set(index, value) -> O(1)
        ===========================================================
        */

        list2.set(1,"Neeraj");

        System.out.println(list2);


        /*
        ===========================================================
        ========================= GET =============================

        get(index) -> O(1)
        ===========================================================
        */

        String name1 = list2.get(1);
        System.out.println("Index 1 : "+name1);


        /*
        ===========================================================
        ====================== SEARCH METHODS =====================

        contains() -> O(n)
        indexOf()  -> O(n)
        ===========================================================
        */

        boolean isIt = list2.contains("Anand");
        System.out.println("Contains Anand : "+isIt);

        int index = list2.indexOf("Anand");
        System.out.println("Index of Anand : "+index);


        /*
        ===========================================================
        ======================= SIZE & CLEAR ======================
        ===========================================================
        */

        int size = list2.size(); // O(1)
        System.out.println("Size : "+size);

        list2.clear(); // O(n)
        System.out.println(list2);


        /*
        ===========================================================
        ======================= LINKEDLIST ========================

        - Doubly linked list
        - Fast insertion/removal at ends
        - Slow random access
        ===========================================================
        */

        List<Integer> list3 = new LinkedList<>();

        list3.add(23);
        list3.add(12);
        list3.add(0,16);

        System.out.println(list3);

        list3.set(0, 12);

        System.out.println(list3);

        list3.remove(1);           // remove by index
        System.out.println(list3);

        list3.remove((Object)12);  // remove by value (important casting)
        System.out.println(list3);


        /*
        ===========================================================
        ========================= VECTOR ==========================

        - Legacy class
        - Thread-safe (synchronized)
        - Slower than ArrayList

        Used in multithread legacy systems.
        ===========================================================
        */

        List<String> vector = new Vector<>();
        vector.add("ThreadSafe");

        System.out.println(vector);


        /*
        ===========================================================
        ===================== ITERATION METHODS ===================

        All -> O(n)
        ===========================================================
        */

        list1.forEach(System.out::println); // Stream/Lambda

        for(String s : list1)               // enhanced for
            System.out.println(s);

        Iterator<String> it = list1.iterator();
        while(it.hasNext())
            System.out.println(it.next());


        /*
        ===========================================================
        =================== INTERVIEW IMPORTANT ===================

        ✔ ArrayList faster for read-heavy operations
        ✔ LinkedList better for frequent insert/remove
        ✔ Vector is synchronized (legacy)
        ✔ List allows duplicates
        ✔ List allows index access
        ✔ remove(int) vs remove(Object) confusion
        ✔ ArrayList resizing cost (grow by ~1.5x internally)

        ===========================================================
        */
    }
}