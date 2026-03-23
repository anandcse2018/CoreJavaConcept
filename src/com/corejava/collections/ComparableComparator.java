package com.corejava.collections;

import java.util.*;

/*
 * ===============================================================
 *              COMPARABLE vs COMPARATOR (DEEP CONCEPT)
 * ===============================================================
 *
 * 1) Comparable:
 *    - Used for DEFAULT (natural) sorting.
 *    - Class itself defines sorting logic.
 *    - Present inside java.lang package.
 *    - Method:
 *          int compareTo(Object obj)
 *
 *    Example:
 *          String, Integer, Double already implement Comparable.
 *
 *    Rules:
 *          return negative -> this < other
 *          return zero     -> equal
 *          return positive -> this > other
 *
 * ---------------------------------------------------------------
 *
 * 2) Comparator:
 *    - Used for CUSTOM sorting.
 *    - Separate class defines sorting logic.
 *    - Present inside java.util package.
 *    - Method:
 *          int compare(Object o1, Object o2)
 *
 *    Used when:
 *          - Multiple sorting needed.
 *          - Cannot modify original class.
 *          
 *          
 *   Collections.sort()

   |
   |---- compareTo()   (Comparable)
   |         |
   |         --> Integer.compare(...)
   |         --> String.compareTo(...)
   |
   |---- compare()     (Comparator)
             |
             --> Integer.compare(...)
             --> String.compareTo(...)
 *          
 *          
 *
 * ===============================================================
 */

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /*
     * ===========================================================
     * Comparable implementation
     * Default sorting by ID
     *
     * Collections.sort(list) will use this method.
     * ===========================================================
     */
    @Override
    public int compareTo(Employee other)
    {
        // Ascending order by ID

        // return this.id - other.id;  // basic way

        // Better way (avoid overflow)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString()
    {
        return id + " " + name + " " + salary;
    }
}


/*
 * ===============================================================
 * Comparator Example 1
 * Custom sorting by Name
 * ===============================================================
 */
class NameComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2)
    {
        return e1.name.compareTo(e2.name);
    }
}

/*
 * ===============================================================
 * Comparator Example 2
 * Custom sorting by Salary
 * ===============================================================
 */
class SalaryComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2)
    {
        return Double.compare(e1.salary, e2.salary);
    }
}

class Student{
	int id;
	String name;
	float weight;
	
	Student(int id, String name, float weight)
	{
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
}

public class ComparableComparator
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(3, "Anand", 50000));
        list.add(new Employee(1, "Rahul", 70000));
        list.add(new Employee(2, "Suraj", 60000));

        /*
         * =======================================================
         * DEFAULT SORT (Comparable)
         * =======================================================
         */
        Collections.sort(list);

        System.out.println("Sort by ID (Comparable)");
        System.out.println(list);


        /*
         * =======================================================
         * CUSTOM SORT (Comparator)
         * =======================================================
         */

        // Sort by Name
        Collections.sort(list, new NameComparator());
        System.out.println("Sort by Name (Comparator)");
        System.out.println(list);

        // Sort by Salary
        Collections.sort(list, new SalaryComparator());
        System.out.println("Sort by Salary (Comparator)");
        System.out.println(list);
        
//        *****************************************************************
        
        Student s1 = new Student(10,"Anand",82.5f);
		Student s2 = new Student(9,"Aman",46.5f);
		Student s3 = new Student(15,"Ajay",65.5f);
		
		List<Student> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(s1,s2,s3));
		
		list1.sort((a,b)-> a.id -b.id);
		
		list1.sort(Comparator.comparingInt(s->s.id));
		list1.sort(Comparator.comparingInt((Student s)->s.id).reversed());
		
		list1.sort(Comparator.comparing(s->s.name));
		list1.sort(Comparator.comparing((Student s)->s.name).reversed());
		
		list1.sort(Comparator.comparingDouble(s->s.weight));
		list1.sort(Comparator.comparing((Student s)->s.weight).reversed());
		
		list1.sort(Comparator.comparingInt((Student s) -> s.id)
   .thenComparing(Comparator.comparing((Student s) -> s.name).reversed())
   .thenComparing(Comparator.comparingDouble((Student s)->s.weight)));
		
		
		list1.forEach(s -> System.out.println(s.weight));
    }
}