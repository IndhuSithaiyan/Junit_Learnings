package Junit_Learnings_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class AssertNotSame {


    String str1 = "Heloo world";
    String str2 = new String("Heloo world");
    Optional<String> optionalStr = Optional.of(str1);


    @Test
    public void assertSame(){
        Assertions.assertNotSame(str1, str2);
        Assertions.assertNotSame(str2, optionalStr.get());
    }
}
