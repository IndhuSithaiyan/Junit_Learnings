package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertNotEquals {

    @Test
    public void assertNotEqualsDemo(){
        JavaOperations javaOperations = new JavaOperations();
        //Assertions.assertNotEquals(9, javaOperations.add(4,5));
        Assertions.assertNotEquals(9, javaOperations.add(4,5), "Assertion add(4,5) failed");
    }
}