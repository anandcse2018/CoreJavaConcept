package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ===================== MASTER ITERATOR REVISION ================
 ===============================================================

 CURSOR OVERVIEW

 ✔ Cursor = Object used to traverse collection
 ✔ Types of Cursors in Java:

    1. Enumeration  (Legacy)
    2. Iterator     (Universal)
    3. ListIterator (Advanced for List)

 ===============================================================
 ======================= ENUMERATION ===========================

 ✔ Introduced in JDK 1.0 (Legacy)
 ✔ Used with:
    - Vector
    - Stack
    - Hashtable

 ✔ Only forward traversal
 ✔ Read-only (NO remove operation)

 METHODS:

 hasMoreElements() -> boolean
 nextElement()     -> returns element

 ===============================================================
 ========================= ITERATOR ============================

 ✔ Introduced in JDK 1.2
 ✔ Works with ALL collections (List, Set, Queue)
 ✔ Allows SAFE removal during iteration

 WHY ITERATOR?

 -> Avoid ConcurrentModificationException
 -> Generic traversal

 METHODS:

 hasNext()   -> boolean
 next()      -> return next element
 remove()    -> remove last returned element

 ===============================================================
 ====================== LIST ITERATOR ==========================

 ✔ Only for List implementations
 ✔ Bidirectional traversal
 ✔ Allows modification

 EXTRA METHODS:

 hasPrevious()
 previous()
 add()
 set()

 ===============================================================
 ======================= TIME COMPLEXITY =======================

 hasNext() / hasMoreElements() -> O(1)
 next() / nextElement()       -> O(1)
 remove()                     -> depends on collection

 ===============================================================
 ======================= IMPORTANT RULES =======================

 ✔ remove() must be called AFTER next()
 ✔ Only ONE remove() per next()
 ✔ After remove()/add() → cannot call remove()/set() immediately
 ✔ Most iterators are FAIL-FAST (modCount concept)

 ===============================================================
 ================== ENUMERATION vs ITERATOR ====================

 | Feature        | Enumeration        | Iterator        |
 |---------------|--------------------|-----------------|
 | Introduced    | JDK 1.0            | JDK 1.2         |
 | Direction     | Forward only       | Forward only    |
 | Remove        | ❌ Not allowed     | ✔ Allowed       |
 | Usage         | Legacy classes     | All collections |
 | Methods       | hasMoreElements()  | hasNext()       |
 |               | nextElement()      | next()          |

 ===============================================================
 ===================== FINAL SUMMARY ===========================

 ✔ Enumeration -> Legacy, read-only
 ✔ Iterator    -> Universal, supports remove
 ✔ ListIterator-> Bidirectional + add/set/remove

 ✔ Prefer Iterator/ListIterator in modern Java

 ===============================================================
*/

public class IteratorDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ===================== BASIC ITERATOR ======================
        ===========================================================
        */

        List<String> list = new ArrayList<>();

        list.add("Anand");
        list.add("Ajay");
        list.add("Aman");

        Iterator<String> it = list.iterator();

        while(it.hasNext())
        {
            String name = it.next();
            System.out.println("Iterator : " + name);
        }


        /*
        ===========================================================
        ================= SAFE REMOVE USING ITERATOR ==============
        ===========================================================
        */

        Iterator<String> it2 = list.iterator();

        while(it2.hasNext())
        {
            String name = it2.next();

            if(name.equals("Ajay"))
                it2.remove(); // safe removal
        }

        System.out.println("After remove : " + list);


        /*
        ===========================================================
        ======================= LIST ITERATOR =====================
        ===========================================================
        */

        ListIterator<String> listIterator = list.listIterator();

        // forward traversal
        while(listIterator.hasNext())
            System.out.println("Forward : " + listIterator.next());

        // backward traversal
        while(listIterator.hasPrevious())
            System.out.println("Backward : " + listIterator.previous());


        /*
        ===========================================================
        ===================== ENUMERATION =========================
        ===========================================================
        */

        Vector<String> vector = new Vector<>();

        vector.add("Anand");
        vector.add("Ajay");
        vector.add("Aman");

        Enumeration<String> en = vector.elements();

        while(en.hasMoreElements())
        {
            System.out.println("Enumeration : " + en.nextElement());
        }


        /*
        ===========================================================
        ===================== FOR-EACH LOOP =======================
        ===========================================================

        Internally uses Iterator
        */

        for(String s : list)
        {
            System.out.println("For-each : " + s);
        }


        /*
        ===========================================================
        ====================== FAIL-FAST ==========================

        Uncomment to test:

        for(String s : list)
        {
            list.add("New"); // ConcurrentModificationException
        }

        ===========================================================
        */

    }
}