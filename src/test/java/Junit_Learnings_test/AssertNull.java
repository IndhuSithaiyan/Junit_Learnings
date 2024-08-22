package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNull {

    JavaOperations java = new JavaOperations();
//    JavaOperations java = null;

    @Test
    public void assertNull(){

        Assertions.assertAll(
                () ->  Assertions.assertNull(java),
                () -> Assertions.assertNull(java, "The JavaOperations object should be null"),
                () -> Assertions.assertNull(java, () -> "The object should be null")
        );

    }
}
