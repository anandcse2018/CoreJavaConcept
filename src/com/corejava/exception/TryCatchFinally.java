package com.corejava.exception;

public class TryCatchFinally {

    public static void main(String[] args) {

        /*
        ============================================================
        1. WHAT IS TRY-CATCH ?
        ============================================================

        try-catch is used to handle exceptions in Java.

        try
        ----
        Code that may cause exception.

        catch
        -----
        Handles the exception.

        finally
        -------
        Always executes (whether exception occurs or not).
        Used for cleanup operations.

        Syntax:

        try {
            risky code
        }
        catch(Exception e){
            handle exception
        }
        finally{
            cleanup code
        }

        ============================================================
        */


        /*
        ============================================================
        2. SIMPLE TRY-CATCH
        ============================================================
        */

        try {

            int a = 10;
            int b = 0;

            int result = a / b;  // ArithmeticException

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }

        System.out.println("Program continues...");


        /*
        ============================================================
        3. MULTIPLE CATCH BLOCK
        ============================================================

        Order matters.

        Specific exception must come before general exception.
        */

        try {

            int arr[] = {1,2,3};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index invalid");

        } catch (Exception e) {

            System.out.println("General exception");

        }


        /*
        ============================================================
        4. FINALLY BLOCK
        ============================================================

        finally block always executes.

        Used for:

        ✔ Closing database connection
        ✔ Closing file streams
        ✔ Releasing resources
        */

        try {

            System.out.println("Inside try");

        } catch (Exception e) {

            System.out.println("Inside catch");

        } finally {

            System.out.println("Finally always executes");

        }


        /*
        ============================================================
        5. FINALLY WITHOUT CATCH
        ============================================================

        Valid syntax
        */

        try {

            System.out.println("Only try-finally example");

        } finally {

            System.out.println("Finally block executed");

        }


        /*
        ============================================================
        6. FINALLY NOT EXECUTED (RARE CASES)
        ============================================================

        finally may NOT execute when:

        1️⃣ System.exit() is called
        2️⃣ JVM crashes
        3️⃣ Power failure
        */

        try {

            System.out.println("Program about to exit");

            // System.exit(0); // finally will NOT execute

        } finally {

            System.out.println("Finally executed");

        }


        /*
        ============================================================
        7. RETURN IN TRY AND FINALLY
        ============================================================

        Important interview question.
        */

        System.out.println(testMethod());


        /*
        ============================================================
        8. NESTED TRY-CATCH
        ============================================================
        */

        try {

            try {

                int arr[] = {1,2,3};
                System.out.println(arr[5]);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Inner catch block");

            }

        } catch (Exception e) {

            System.out.println("Outer catch block");

        }


        /*
        ============================================================
        9. MULTI-CATCH (Java 7 Feature)
        ============================================================

        One catch block can handle multiple exceptions.
        */

        try {

            int num = Integer.parseInt("ABC");

        } catch (NumberFormatException | ArithmeticException e) {

            System.out.println("Handled multiple exceptions");

        }


        /*
        ============================================================
        10. IMPORTANT METHODS
        ============================================================
        */

        try {

            String s = null;
            s.length();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            e.printStackTrace();

        }


        /*
        ============================================================
        11. INTERVIEW QUESTIONS
        ============================================================

        Q1: Can we write try without catch?

        ✔ Yes (if finally exists)

        try {
        }
        finally {
        }

        Q2: Can we write try without finally?

        ✔ Yes (if catch exists)

        Q3: Can we write catch without try?

        ❌ No

        Q4: Will finally always execute?

        ✔ Yes (except System.exit / JVM crash)

        Q5: What happens if exception occurs in finally?

        The finally exception overrides previous exception.

        */


        /*
        ============================================================
        12. BEST PRACTICES
        ============================================================

        ✔ Catch specific exception first
        ✔ Avoid empty catch blocks
        ✔ Use finally for resource cleanup
        ✔ Prefer try-with-resources for IO

        Example (Bad)

        catch(Exception e){}

        Example (Good)

        catch(IOException e){
            logger.error("File error", e);
        }

        ============================================================
        */

    }


    /*
    ============================================================
    METHOD FOR RETURN DEMONSTRATION
    ============================================================
    */

    static int testMethod() {

        try {

            System.out.println("Inside try");
            return 10;

        } finally {

            System.out.println("Inside finally");

        }

    }

}