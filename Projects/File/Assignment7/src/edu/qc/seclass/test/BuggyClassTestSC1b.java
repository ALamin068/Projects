package edu.qc.seclass;

import org.junit.Test;

// create a test suite that achieves less than 50% statement coverage and reveals the fault

public class BuggyClassTestSC1b {

    @Test
    public void testBuggyMethod1() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.buggyMethod1(5, 1);
    }

}
