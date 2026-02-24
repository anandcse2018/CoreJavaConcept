package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ======================= MASTER MAP REVISION ===================
 ===============================================================

 MAP OVERVIEW

 ✔ Map is NOT part of Collection interface.
 ✔ Stores KEY-VALUE pairs.
 ✔ Keys must be UNIQUE.
 ✔ Values can be duplicate.

 WHY MAP?

 -> Fast lookup using key.

 ===============================================================
 MAIN IMPLEMENTATIONS

 1) HashMap
 2) LinkedHashMap
 3) TreeMap
 4) Hashtable (legacy)

 ===============================================================
 TIME COMPLEXITY

                      put()      get()      remove()

 HashMap              O(1)*      O(1)*      O(1)*
 LinkedHashMap        O(1)*      O(1)*      O(1)*
 TreeMap              O(log n)   O(log n)   O(log n)
 Hashtable            O(1)       O(1)       O(1)

 *Average case. Worst case O(n) due to hash collision.

 ===============================================================
 INTERNAL STRUCTURE

 HashMap      -> Hash Table (array of buckets)
 LinkedHashMap-> HashMap + Doubly Linked List
 TreeMap      -> Red-Black Tree
 Hashtable    -> Synchronized Hash Table

 ===============================================================
 NULL RULES

 HashMap:
    ✔ 1 null key allowed
    ✔ multiple null values allowed

 LinkedHashMap:
    ✔ same as HashMap

 TreeMap:
    ❌ null key NOT allowed

 Hashtable:
    ❌ null key NOT allowed
    ❌ null value NOT allowed

 ===============================================================
*/

public class MapDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ======================== HASHMAP ==========================

        - No order guarantee
        - Fastest lookup
        - Uses hashCode() for indexing
        ===========================================================
        */

        Map<Integer,String> map1 = new HashMap<>();

        // put() -> O(1)
        map1.put(1,"Anand");
        map1.put(2,"Ajay");
        map1.put(3,"Aman");

        // duplicate key replaces value
        map1.put(1,"Updated");

        map1.put(null,"NullKey"); // allowed

        System.out.println("HashMap : " + map1);

        // get() -> O(1)
        System.out.println("Get key 2 : " + map1.get(2));

        // containsKey / containsValue
        System.out.println(map1.containsKey(1));
        System.out.println(map1.containsValue("Ajay"));

        // remove() -> O(1)
        map1.remove(3);

        System.out.println(map1);

        /*
        ===========================================================
        ======================= ITERATION =========================
        ===========================================================
        */

        // keySet()
        for(Integer key : map1.keySet())
            System.out.println("Key : " + key);

        // values()
        for(String value : map1.values())
            System.out.println("Value : " + value);

        // entrySet() (BEST performance)
        for(Map.Entry<Integer,String> entry : map1.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());


        /*
        ===========================================================
        ===================== LINKEDHASHMAP =======================

        Maintains insertion order.
        ===========================================================
        */

        Map<Integer,String> map2 = new LinkedHashMap<>();

        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");

        System.out.println("LinkedHashMap : " + map2);


        /*
        ===========================================================
        ======================== TREEMAP ==========================

        - Sorted by key
        - Uses Red-Black Tree
        ===========================================================
        */

        TreeMap<Integer,String> map3 = new TreeMap<>();

        map3.put(30,"Thirty");
        map3.put(10,"Ten");
        map3.put(20,"Twenty");

        System.out.println("TreeMap sorted : " + map3);

        // advanced navigation methods
        System.out.println("First key : " + map3.firstKey());
        System.out.println("Last key : " + map3.lastKey());
        System.out.println("Higher key than 10 : " + map3.higherKey(10));
        System.out.println("Lower key than 30 : " + map3.lowerKey(30));


        /*
        ===========================================================
        ======================= HASHTABLE =========================

        - Legacy synchronized map
        - Thread-safe
        - Slower due to synchronization
        ===========================================================
        */

        Map<Integer,String> map4 = new Hashtable<>();

        map4.put(1,"ThreadSafe");

        System.out.println("Hashtable : " + map4);


        /*
        ===========================================================
        ==================== INTERVIEW IMPORTANT ==================

        ✔ HashMap allows one null key.
        ✔ TreeMap sorted automatically.
        ✔ entrySet() iteration fastest.
        ✔ HashMap uses hashCode() + equals().
        ✔ Hash collision handled via chaining/tree (Java 8+).

        ===========================================================
        */
    }
}