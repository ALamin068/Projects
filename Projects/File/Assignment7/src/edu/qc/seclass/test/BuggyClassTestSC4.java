package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

// To achieve 100% statement coverage but not reveal the fault, we can write test
// cases that ensure x and y are non-zero values, so that the division does not result in an error.
public class BuggyClassTestSC4 {
    @Test
    public void testBuggyMethod4() {
        BuggyClass buggy = new BuggyClass();
        int x = 4;
        int y = 2;
        buggy.buggyMethod4(x, y);
    }
}
