package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ======================= MASTER QUEUE REVISION =================
 ===============================================================

 QUEUE OVERVIEW

 ✔ Queue is an interface (java.util)
 ✔ FIFO (First In First Out)
 ✔ Used for processing tasks sequentially
 ✔ No index-based access

 Common Operations:

    add() / offer()     -> insert element
    remove() / poll()   -> remove head
    element() / peek()  -> read head

 ===============================================================
 IMPORTANT DIFFERENCE

 add()   -> throws Exception if fails
 offer() -> returns false if fails

 remove() -> throws Exception if empty
 poll()   -> returns null if empty

 element() -> exception if empty
 peek()    -> returns null if empty

 ===============================================================

 IMPLEMENTATIONS

 1) PriorityQueue
 2) LinkedList (implements Queue + Deque)
 3) ArrayDeque (Recommended modern queue)

 ===============================================================
 TIME COMPLEXITY

                   add()       remove()       peek()

 PriorityQueue     O(log n)    O(log n)       O(1)
 LinkedList        O(1)        O(1)           O(1)
 ArrayDeque        O(1)        O(1)           O(1)

 ===============================================================
 INTERNAL STRUCTURE

 PriorityQueue -> Binary Heap
 LinkedList    -> Doubly Linked List
 ArrayDeque    -> Resizable Array

 ===============================================================
*/

public class QueueDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ====================== PRIORITY QUEUE =====================

        - NOT FIFO strictly
        - Elements sorted based on priority
        - Default = Min Heap (smallest first)
        - No null allowed
        ===========================================================
        */

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        // smallest element at head
        System.out.println("PriorityQueue : " + pq);

        // peek() -> O(1)
        System.out.println("Peek : " + pq.peek());

        // poll() -> O(log n)
        System.out.println("Poll : " + pq.poll());

        System.out.println(pq);


        /*
        ===========================================================
        ======================= LINKEDLIST ========================

        - True FIFO behaviour
        - Can be used as Queue or Deque
        ===========================================================
        */

        Queue<String> queue = new LinkedList<>();

        queue.offer("Anand"); // O(1)
        queue.offer("Ajay");
        queue.offer("Aman");
        queue.add("Nidhi");

        System.out.println("Queue : " + queue);

        // peek() -> read head
        System.out.println("Head : " + queue.peek());

        // poll() -> remove head
        System.out.println("Removed : " + queue.poll());

        System.out.println(queue);


        /*
        ===========================================================
        ======================= ARRAYDEQUE ========================

        Recommended over LinkedList for queue usage.
        Faster due to array structure.
        ===========================================================
        */

        Queue<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);

        System.out.println("ArrayDeque : " + arrayDeque);


        /*
        ===========================================================
        ====================== ITERATION ==========================

        All iteration -> O(n)
        ===========================================================
        */

        for(Integer x : pq)
            System.out.println("for-each : " + x);

        Iterator<Integer> it = pq.iterator();
        while(it.hasNext())
            System.out.println("Iterator : " + it.next());


        /*
        ===========================================================
        =================== INTERVIEW IMPORTANT ===================

        ✔ PriorityQueue is NOT sorted when printed
          (only head guaranteed smallest)

        ✔ Queue has no index access.

        ✔ Prefer offer/poll/peek instead of add/remove/element.

        ✔ ArrayDeque usually faster than LinkedList.

        ✔ PriorityQueue internally uses Binary Heap.

        ===========================================================
        */
    }
}