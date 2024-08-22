package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertEquals {

    @Test
    public void assertAlternative() {
        JavaOperations javaOperations = new JavaOperations();
        if (javaOperations.add(4, 5) == 8)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    @Test
    public void assertDemo() {
        JavaOperations javaOperations = new JavaOperations();
        int actual = javaOperations.add(4, 5);
        Assertions.assertEquals(8, actual);
        Assertions.assertEquals(8, actual, "Assertion add(4,5) failed");
    }
}