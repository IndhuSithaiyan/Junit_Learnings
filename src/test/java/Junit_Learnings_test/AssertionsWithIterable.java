package Junit_Learnings_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class AssertionsWithIterable {

    @Test
    public void assertIterableEquals(){
        Iterable<String> list1 = new ArrayList<>(Arrays.asList("Java", "Python", "PHP"));
        Iterable<String> list2 = new LinkedList<>(Arrays.asList("Java", "Python", "PHP"));

        Assertions.assertIterableEquals(list1, list2);

    }
}
