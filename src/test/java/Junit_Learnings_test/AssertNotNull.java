package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNotNull {

    JavaOperations java = new JavaOperations();
//    JavaOperations java = null;

    @Test
    public void assertNotNull(){

        Assertions.assertAll(
                () ->  Assertions.assertNotNull(java),
                () -> Assertions.assertNotNull(java, "The JavaOperations object should not be null"),
                () -> Assertions.assertNotNull(java, () -> "The object should not be null")
        );

    }
}
