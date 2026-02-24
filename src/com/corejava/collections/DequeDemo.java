package com.corejava.collections;

import java.util.*;

/*
 ===============================================================
 ====================== MASTER DEQUE REVISION ==================
 ===============================================================

 DEQUE OVERVIEW

 ✔ Deque = Double Ended Queue
 ✔ Allows insertion/removal from BOTH ends.
 ✔ Can work as:

        Queue (FIFO)
        Stack (LIFO)

 ===============================================================
 MAIN IMPLEMENTATIONS

 1) ArrayDeque   (Recommended)
 2) LinkedList

 ===============================================================
 INTERNAL STRUCTURE

 ArrayDeque -> Resizable Circular Array
 LinkedList -> Doubly Linked List

 ===============================================================
 TIME COMPLEXITY

                      add/remove first    add/remove last

 ArrayDeque           O(1)                O(1)
 LinkedList           O(1)                O(1)

 Random access NOT supported.

 ===============================================================
 IMPORTANT NOTES

 ✔ Faster than Stack class.
 ✔ Prefer ArrayDeque over LinkedList for performance.
 ✔ No null allowed in ArrayDeque.

 ===============================================================
*/

public class DequeDemo
{
    public static void main(String[] args)
    {

        /*
        ===========================================================
        ======================= ARRAYDEQUE ========================
        ===========================================================
        */

        Deque<Integer> deque = new ArrayDeque<>();

        // add at end
        deque.addLast(10);
        deque.addLast(20);

        // add at front
        deque.addFirst(5);

        System.out.println("Deque : " + deque);

        // peek operations (O(1))
        System.out.println("Peek First : " + deque.peekFirst());
        System.out.println("Peek Last : " + deque.peekLast());

        // remove operations (O(1))
        System.out.println("Remove First : " + deque.removeFirst());
        System.out.println("Remove Last : " + deque.removeLast());

        System.out.println(deque);


        /*
        ===========================================================
        ==================== USING AS QUEUE (FIFO) ================
        ===========================================================
        */

        Deque<String> queue = new ArrayDeque<>();

        queue.offerLast("Anand"); // enqueue
        queue.offerLast("Ajay");

        System.out.println("Queue poll : " + queue.pollFirst());


        /*
        ===========================================================
        ==================== USING AS STACK (LIFO) ================
        ===========================================================
        */

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1); // addFirst
        stack.push(2);
        stack.push(3);

        System.out.println("Stack pop : " + stack.pop()); // removeFirst


        /*
        ===========================================================
        ======================= LINKEDLIST ========================

        LinkedList implements Deque interface.
        ===========================================================
        */

        Deque<Integer> linkedDeque = new LinkedList<>();

        linkedDeque.addFirst(100);
        linkedDeque.addLast(200);

        System.out.println("LinkedList Deque : " + linkedDeque);


        /*
        ===========================================================
        ===================== ITERATION METHODS ===================
        ===========================================================
        */

        for(Integer x : deque)
            System.out.println("for-each : " + x);

        Iterator<Integer> it = deque.iterator();
        while(it.hasNext())
            System.out.println("Iterator : " + it.next());


        /*
        ===========================================================
        ==================== INTERVIEW IMPORTANT ==================

        ✔ Deque supports both queue and stack operations.
        ✔ ArrayDeque faster than Stack and LinkedList.
        ✔ ArrayDeque does NOT allow null.
        ✔ push() == addFirst()
        ✔ pop()  == removeFirst()

        ===========================================================
        */

    }
}
