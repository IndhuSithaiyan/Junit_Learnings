package Junit_Learnings_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "Printing hello here class level")
class DisplayNames {

    @Test
    @DisplayName("Printing hello here")
    public void printHello() {
        System.out.println("Hello");
    }

}