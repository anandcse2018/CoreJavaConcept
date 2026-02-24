package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ===================== MASTER ITERATOR REVISION ================
 ===============================================================

 ITERATOR OVERVIEW

 ✔ Iterator is used to traverse collection elements.
 ✔ Works with all Collection types (List, Set, Queue).
 ✔ Allows SAFE removal during iteration.

 WHY ITERATOR?

 -> Avoid ConcurrentModificationException
 -> Generic traversal without knowing collection type.

 ===============================================================
 MAIN METHODS

 hasNext()   -> boolean
 next()      -> return next element
 remove()    -> remove last returned element

 ===============================================================
 TIME COMPLEXITY

 hasNext()   -> O(1)
 next()      -> O(1)
 remove()    -> depends on underlying collection

 ===============================================================
 IMPORTANT RULES

 ✔ remove() must be called AFTER next().
 ✔ Only ONE remove() allowed per next().
 ✔ Iterator is FAIL-FAST.

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

        System.out.println("test");
        Iterator<String> it = list.iterator();

        while(it.hasNext())
        {
            String name = it.next();
            System.out.println(name);
        }


        /*
        ===========================================================
        ================= SAFE REMOVE USING ITERATOR ==============
        ===========================================================

        Correct way to remove during iteration.
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
        ====================== FAIL-FAST ==========================

        If collection modified outside iterator during iteration
        -> ConcurrentModificationException

        Uncomment to test:

        for(String s : list)
        {
            list.add("New"); // Exception
        }
        ===========================================================
        */


        /*
        ===========================================================
        ======================= LIST ITERATOR =====================

        Only for List implementations.
        Allows:

        ✔ Bidirectional traversal
        ✔ Modify element
        ✔ Add element during iteration
        ✔ Previous navigation
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
        ===================== FOR-EACH VS ITERATOR ================

        for-each loop internally uses iterator.

        for(String s : list)
        {
            // internally iterator used
        }
        ===========================================================
        */


        /*
        ===========================================================
        ==================== INTERVIEW IMPORTANT ==================

        ✔ Iterator is universal traversal mechanism.
        ✔ ListIterator only for List.
        ✔ Iterator supports remove but NOT add.
        ✔ ListIterator supports add/set/remove.
        ✔ Fail-fast detection using modCount internally.
        ✔ Enumeration (legacy) vs Iterator.

        ===========================================================
        */

    }
}
