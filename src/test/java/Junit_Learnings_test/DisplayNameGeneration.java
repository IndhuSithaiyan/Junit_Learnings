package Junit_Learnings_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

//@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
//@org.junit.jupiter.api.DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("Display Name Generation")
public class DisplayNameGeneration {

    @Test
//    @DisplayName("Hello world method")
    public void print_Hello_World() {
        System.out.println("Hello world..");
    }

    @Test
    public void print_Java_World() {
        System.out.println("I love Java world..");
    }

    /*
    * If you want to run the custom displayname generator for all the test classes then use a property in junit-platform.properties
    * */
}
