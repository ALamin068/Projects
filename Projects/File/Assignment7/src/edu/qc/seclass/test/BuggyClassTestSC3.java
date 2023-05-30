package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

//test class BuggyClassTestSC3 achieves 100% statement coverage,
// less than 100% branch coverage and should reveal the fault in buggyMethod3.

public class BuggyClassTestSC3 {

    @Test
    public void testBuggyMethod3() {
        BuggyClass bc = new BuggyClass();
        bc.buggyMethod3(5, 1);
    }
}

