package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Test;

class WhatAreAssertions {

    @Test
    public void assertAlternative(){
        JavaOperations javaOperations = new JavaOperations();
        if (javaOperations.add(4,5) == 8)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }
}