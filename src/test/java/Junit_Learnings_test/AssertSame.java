package Junit_Learnings_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class AssertSame {


    String str1 = "Heloo world";
    String str2 = "Heloo world";

    Optional<String> optionalStr = Optional.of(str2);

    @Test
    public void assertSame(){

        Assertions.assertSame(str1, str2);
        Assertions.assertSame(str2, optionalStr.get());

    }
}
