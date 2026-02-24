package com.corejava.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 ===============================================================
 ======================= MASTER SET REVISION ===================
 ===============================================================

 SET OVERVIEW

 ✔ Set is an interface in java.util package
 ✔ Stores UNIQUE elements only (no duplicates)
 ✔ Duplicate check uses equals() + hashCode()
 ✔ No index-based access (no get(index))
 ✔ Not positional like List

 WHY NO INDEX?

 -> Set focuses on uniqueness, not ordering or position.

 ===============================================================

 MAIN IMPLEMENTATIONS

 1) HashSet
 2) LinkedHashSet
 3) TreeSet

 ===============================================================
 TIME COMPLEXITY SUMMARY

                add()        remove()        contains()

 HashSet        O(1)*        O(1)*           O(1)*
 LinkedHashSet  O(1)*        O(1)*           O(1)*
 TreeSet        O(log n)     O(log n)        O(log n)

 *Average case. Worst case HashSet = O(n) due to hash collision.

 ===============================================================
 INTERNAL STRUCTURE

 HashSet      -> HashMap (Hash Table)
 LinkedHashSet-> HashMap + Doubly Linked List
 TreeSet      -> Red-Black Tree (Self balancing BST)

 ===============================================================
 IMPORTANT RULES

 ✔ HashSet allows ONE null
 ✔ LinkedHashSet allows ONE null
 ✔ TreeSet DOES NOT allow null (NullPointerException)

 ✔ Iterator is FAIL-FAST

 ===============================================================
*/

public class SetDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ======================= HASHSET ===========================

        - No order guarantee
        - Fastest lookup via hashing
        - Uses hashCode() -> bucket index
        - Average complexity O(1)
        ===========================================================
        */

        Set<Integer> hashSet = new HashSet<>();

        // add() -> O(1)
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // duplicate ignored

        hashSet.add(null); // allowed

        System.out.println("HashSet : " + hashSet);

        // contains() -> O(1)
        System.out.println("Contains 20 : " + hashSet.contains(20));

        // remove() -> O(1)
        hashSet.remove(30);

        // size() -> O(1)
        System.out.println("Size : " + hashSet.size());

        // isEmpty() -> O(1)
        System.out.println("Is Empty : " + hashSet.isEmpty());


        /*
        ===========================================================
        ===================== ITERATION METHODS ===================

        Iteration complexity -> O(n)
        ===========================================================
        */

        // Enhanced for-loop
        for(Integer x : hashSet)
            System.out.println("for-each : " + x);

        // Iterator
        Iterator<Integer> it = hashSet.iterator();
        while(it.hasNext())
            System.out.println("Iterator : " + it.next());

        // Stream API
        hashSet.stream().forEach(e -> System.out.println("Stream : " + e));


        /*
        ===========================================================
        ==================== LINKEDHASHSET ========================

        - Maintains insertion order
        - Hash table + linked list
        - Slightly slower than HashSet
        - Complexity same as HashSet (O(1) average)
        ===========================================================
        */

        Set<Integer> linkedSet = new LinkedHashSet<>();

        linkedSet.add(5);
        linkedSet.add(1);
        linkedSet.add(9);
        linkedSet.add(null);

        System.out.println("LinkedHashSet (ordered): " + linkedSet);


        /*
        ===========================================================
        ======================= TREESET ===========================

        - Automatically sorted (natural order)
        - Uses Red-Black Tree
        - All operations O(log n)
        - No null allowed

        Sorting uses:
            Comparable OR Comparator
        ===========================================================
        */

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);  // O(log n)
        treeSet.add(10);
        treeSet.add(30);

        System.out.println("TreeSet sorted : " + treeSet);

        // Advanced NavigableSet methods -> O(log n)
        System.out.println("First : " + treeSet.first());
        System.out.println("Last : " + treeSet.last());
        System.out.println("Higher than 10 : " + treeSet.higher(10));
        System.out.println("Lower than 30 : " + treeSet.lower(30));
        System.out.println("Ceiling 25 : " + treeSet.ceiling(25));
        System.out.println("Floor 25 : " + treeSet.floor(25));


        /*
        ===========================================================
        ================= SET MATHEMATICAL OPERATIONS =============

        Union        -> addAll()
        Intersection -> retainAll()
        Difference   -> removeAll()

        Complexity approx O(n)
        ===========================================================
        */

        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> B = new HashSet<>(Arrays.asList(3,4,5,6));

        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("Union : " + union);

        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("Intersection : " + intersection);

        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("Difference : " + difference);


        /*
        ===========================================================
        =================== CUSTOM OBJECT SET =====================

        Duplicate detection uses equals() + hashCode()

        Complexity depends on hashCode distribution.
        ===========================================================
        */

        Set<SetEmployee> empSet = new HashSet<>();

        empSet.add(new SetEmployee(1,"Anand"));
        empSet.add(new SetEmployee(1,"Anand")); // duplicate blocked

        System.out.println("Custom Object Set : " + empSet.toString());


        /*
        ===========================================================
        ====================== FAIL-FAST ==========================

        Iterator throws ConcurrentModificationException
        if collection modified during iteration.
        ===========================================================
        */


        /*
        ===========================================================
        ====================== CLEAR METHOD =======================

        clear() -> removes all elements -> O(n)
        ===========================================================
        */

        hashSet.clear();
        System.out.println("After clear : " + hashSet);

    }
}


/*
 ===============================================================
 ============== CUSTOM OBJECT FOR HASHSET ======================
 ===============================================================
*/

class SetEmployee
{
    int id;
    String name;

    SetEmployee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(!(obj instanceof SetEmployee)) return false;

        SetEmployee e = (SetEmployee)obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return id + " - " + name;
    }
}