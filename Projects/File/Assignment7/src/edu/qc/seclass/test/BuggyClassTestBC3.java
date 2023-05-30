package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

//test class BuggyClassTestBC3 achieves 100% branch coverage and should
// not reveal the fault in buggyMethod3.
public class BuggyClassTestBC3 {

    @Test
    public void testBuggyMethod3() {
        BuggyClass bc = new BuggyClass();
        bc.buggyMethod3(5, 0);
    }
}

