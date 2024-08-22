package Junit_Learnings_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class AssertPreemptive {
    @Test
    public void timeOutTesting1(){
        Assertions.assertTimeout(Duration.ofMillis(3000), () ->
        {
            System.out.println("heloo");
            Thread.sleep(4000);
        });
    }

    @Test
    public void timeOutTesting2(){
        Assertions.assertTimeout(Duration.ofMillis(3000), () ->
        {
            System.out.println("heloo");
            Thread.sleep(4000);
        });
    }


    @Test
    public void timeOutPreemptive(){
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(3000), () ->
        {
            System.out.println("heloo");
            Thread.sleep(4000);
        });
    }
}
