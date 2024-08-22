package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEachAfterEach {

    JavaOperations javaOperations;

    @BeforeEach
    public void init(){
        javaOperations = new JavaOperations();
        // all init tasks
        System.out.println("Initialization done");
    }

    @AfterEach
    public void cleanUp(){
        System.out.println("Cleanup done");
    }

    @Test
    void addTest(){
        System.out.println("First test .. using Junit_Learnings.JavaOperations");
    }

    @Test
    void multiplyTest(){
        System.out.println("Second test .. using Junit_Learnings.JavaOperations");
    }
}