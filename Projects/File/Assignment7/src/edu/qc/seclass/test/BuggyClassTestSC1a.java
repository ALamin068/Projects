package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.Test;

//creating test cases that cover all statements of the method but do not trigger the fault
public class BuggyClassTestSC1a {

    @Test
    public void testBuggyMethod1() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.buggyMethod1(5, 2);
    }

}
