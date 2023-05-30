package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

// To achieve 100% branch coverage, we need to test both the if and else paths of the
// conditional statement. Here's an example test
// class BuggyClassTestBC4 that achieves 100% branch coverage but does not reveal the fault
public class BuggyClassTestBC4 {
    @Test
    public void testBuggyMethod4() {
        BuggyClass buggy = new BuggyClass();
        int x = 4;
        int y = 2;
        buggy.buggyMethod4(x, y);
    }

    @Test
    public void testBuggyMethod4DivideByZero() {
        BuggyClass buggy = new BuggyClass();
        int x = 4;
        int y = 0;
        buggy.buggyMethod4(x, y);
    }
}
