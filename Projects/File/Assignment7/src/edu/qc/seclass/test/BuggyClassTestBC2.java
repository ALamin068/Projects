package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

// This test case executes both branches of the if statement in buggyMethod2,
// and therefore achieves more than 50% branch coverage. It also triggers the division
// by zero fault because the input values x=1, y=-1, and z=6 result in a denominator of 0 in the second branch.
public class BuggyClassTestBC2 {

    @Test
    public void testBuggyMethod2() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.buggyMethod2(1, -1, 6);
    }

}
