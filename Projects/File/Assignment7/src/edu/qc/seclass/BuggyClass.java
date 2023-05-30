package edu.qc.seclass;


import org.junit.Test;
// implementing the BuggyClass that contains a division
// by zero fault in buggyMethod1, where the denominator is (b - 1).
public class BuggyClass {

    public void buggyMethod1(int a, int b) {
        int result = a / (b - 1); // Division by zero fault
        System.out.println(result);
    }

    //This implementation contains a division by zero fault in buggyMethod2, where the denominator is either (x + y) or (x - y), depending on the values of x and y. This fault can
    // be hidden by creating test cases that cover all statements of the method but do not trigger the fault
    public void buggyMethod2(int x, int y, int z) {
        int result;
        if (x > 0 && y > 0) {
            result = z / (x + y); // Division by zero fault
        } else {
            result = z / (x - y); // Division by zero fault
        }
        System.out.println(result);
    }

 // 3rd method. The method buggyMethod3 takes two integer arguments a and b.
 //If a is zero, it enters a conditional block and checks whether b is also zero.
 // If so, it performs a division by zero. If not, it performs a division by b.
        public static void buggyMethod3(int a, int b) {
            if (a == 0) {
                if (b == 0) {
                    // division by zero
                    int c = 1 / 0;
                } else {
                    int x = 1 / b;
                }
            } else {
                int y = 1 / a;
            }
        }
        // The buggyMethod4 has a division by zero fault that can be revealed by any
        // test suite that achieves 100% statement coverage.
    public void buggyMethod4(int x, int y) {
        int z = x / y;
        if (y == 0) {
            System.out.println("Error: division by zero");
        }
    }

    public void buggyMethod5 (int i) {
        // It is not possible to create a method that satisfies both conditions without using exception handling mechanism,
        // code rewriting technique or reflection. Dividing any number by 0 results in an ArithmeticException, which cannot be
        // caught or handled without using an exception handling mechanism. Therefore, it is not possible to prevent the fault
        // from being revealed by any test suite.
    }

}




