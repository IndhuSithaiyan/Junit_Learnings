package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.*;

class BeforeAllAfterAll {

    JavaOperations javaOperations;

    @BeforeAll
    public static void openDatabase(){
        System.out.println("Open database connection");
    }

    @AfterAll
    public static void closeDatabase(){
        System.out.println("Close database connection");
    }

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
    void add_Test(){
        // open database
        System.out.println("First test .. using Database");
        // close database
    }

    @Test
    void multiply_Test(){
        // open database
        System.out.println("Second test .. using Database");
        // close database
    }
}