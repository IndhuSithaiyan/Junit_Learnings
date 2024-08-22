package Junit_Learnings_test;

import Junit_Learnings.JavaOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupedAssertions {

    @Test
    public void multipleAssertions() {
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertEquals(4, javaOperations.add(3, 1));
        Assertions.assertEquals(25, javaOperations.add(3, 22));
        Assertions.assertEquals(100, javaOperations.add(70, 30));
    }

    @Test
    public void groupAssertionDemo() {
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertAll(() ->
                        Assertions.assertEquals(5, javaOperations.add(3, 1)),
                () -> Assertions.assertEquals(26, javaOperations.add(3, 22)),
                () -> Assertions.assertEquals(101, javaOperations.add(70, 30))
        );
    }

}
