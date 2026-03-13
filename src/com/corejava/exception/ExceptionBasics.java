package com.corejava.exception;

public class ExceptionBasics {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS EXCEPTION ?
        ============================================================

        Exception = An unwanted event that occurs during program
        execution and disrupts normal flow of program.

        Example:

        ✔ Divide by zero
        ✔ Array index out of bound
        ✔ Null pointer access
        ✔ File not found

        Without exception handling → program crashes.
        */

        /*
        ============================================================
        2. SIMPLE EXCEPTION EXAMPLE
        ============================================================
        */

        int a = 10;
        int b = 0;

        try {

            int result = a / b; // ArithmeticException

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }

        System.out.println("Program continues...");


        /*
        ============================================================
        3. EXCEPTION HIERARCHY
        ============================================================
		
Object
   │
Throwable
   │
   ├── Error
   │     ├ OutOfMemoryError
   │     └ StackOverflowError
   │
   └── Exception
         │
         ├ Checked Exception
         │    ├ IOException
         │    ├ SQLException
         │
         └ RuntimeException
              ├ NullPointerException
              ├ ArithmeticException
              ├ ArrayIndexOutOfBoundsException
              └ NumberFormatException
		
		
        Object
           ↓
        Throwable
           ↓
        -------------------------
        |                       |
        Error               Exception
                                ↓
                        RuntimeException
        */

        /*
        ERROR
        ------
        Serious problems that application should NOT handle.

        Example:
        OutOfMemoryError
        StackOverflowError


        EXCEPTION
        ---------
        Conditions that application can handle.
        */

        /*
        ============================================================
        4. TYPES OF EXCEPTION
        ============================================================

        1️⃣ Checked Exception
        2️⃣ Unchecked Exception
        */

        /*
        CHECKED EXCEPTION
        -----------------

        Checked at compile time.

        Must be handled using:

        try-catch
        OR
        throws keyword

        Examples:

        IOException
        SQLException
        FileNotFoundException
        */


        /*
        UNCHECKED EXCEPTION
        -------------------

        Occurs at runtime.

        Not checked at compile time.

        Examples:

        ArithmeticException
        NullPointerException
        ArrayIndexOutOfBoundsException
        NumberFormatException
        */


        /*
        ============================================================
        5. NULL POINTER EXCEPTION
        ============================================================
        */

        try {

            String str = null;

            System.out.println(str.length()); // NPE

        } catch (NullPointerException e) {

            System.out.println("Null object accessed");

        }


        /*
        ============================================================
        6. ARRAY INDEX OUT OF BOUND
        ============================================================
        */

        try {

            int arr[] = {1,2,3};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");

        }


        /*
        ============================================================
        7. MULTIPLE CATCH BLOCK
        ============================================================
        */

        try {

            int num = Integer.parseInt("ABC");

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format");

        } catch (Exception e) {

            System.out.println("General exception");

        }


        /*
        ============================================================
        8. IMPORTANT METHODS OF EXCEPTION
        ============================================================
        */

        try {

            int arr[] = {1,2};

            System.out.println(arr[5]);

        } catch (Exception e) {

            System.out.println("Message: " + e.getMessage());

            System.out.println("toString: " + e.toString());

            e.printStackTrace();

        }


        /*
        ============================================================
        9. STACK TRACE
        ============================================================

        Stack trace shows:

        ✔ Exception type
        ✔ File name
        ✔ Line number
        ✔ Method call sequence
        */


        /*
        ============================================================
        10. IMPORTANT INTERVIEW QUESTIONS
        ============================================================

        Q1: What is exception?

        Event that disrupts program flow.

        Q2: Difference between Error and Exception?

        Error → system level problem
        Exception → application level problem

        Q3: Checked vs Unchecked?

        Checked → compile time
        Unchecked → runtime

        Q4: Parent class of all exceptions?

        Throwable

        Q5: Can we catch Error?

        Technically yes, but not recommended.

        */


        /*
        ============================================================
        11. BEST PRACTICES
        ============================================================

        ✔ Catch specific exception first
        ✔ Avoid catching generic Exception
        ✔ Do not ignore exceptions
        ✔ Log exceptions properly
        ✔ Use meaningful messages

        Example (Bad)

        catch(Exception e){}

        Example (Good)

        catch(IOException e){
            logger.error("File not found", e);
        }
        */

    }

}