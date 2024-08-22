package Junit_Learnings_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AssertionsInstanceOf {
//Assert That an Object Is From a Specific Type


    //assertThat -> comes from Hamcrest library
//    @Test
//    public void testInstanceOf() {
//        Object actualValue = "Hello, JUnit!";
//        assertThat(subClass, instanceOf(BaseClass.class));
//    }

    @Test
    void testInstanceOfString() {
        Object actualValue = "Hello, JUnit!";
        String result = assertInstanceOf(String.class, actualValue);   // This will pass because obj is an instance of String.
    }


    //Include a custom message to display if the assertion fails.
    @Test
    void testInstanceOfStringWithMessage() {
        Object actualValue = "Hello, JUnit!";
        String result = assertInstanceOf(String.class, actualValue, "The object should be an instance of String");
    }


    //Use a message supplier to lazily generate a custom message if the assertion fails.
    @Test
    void testInstanceOfStringWithMessageSupplier() {
        Object actualValue = "Hello, JUnit!";
        Supplier<String> messageSupplier = () -> "The object should be an instance of String";
        String result = assertInstanceOf(String.class, actualValue, messageSupplier);
    }


}
