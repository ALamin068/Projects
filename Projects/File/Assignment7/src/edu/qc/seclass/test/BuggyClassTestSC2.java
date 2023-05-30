package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

// This test case covers all statements of buggyMethod2,
// but it does not reveal the fault because the input values do not trigger the division by zero fault.
public class BuggyClassTestSC2 {

    @Test
    public void testBuggyMethod2() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.buggyMethod2(1, 2, 6);
        buggyClass.buggyMethod2(0, 0, 1);
    }

}

