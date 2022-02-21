package com.codedifferently.petshop.birds;

import com.codedifferently.petshop.ActivityTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParrotTest {

    @Test
    public void constructorTest01(){
        Parrot parrot = new Parrot("Polly", 25, ActivityTime.DAYTIME);
        String expected = "Polly 25 DAYTIME";
        String actual = parrot.toString();
        Assertions.assertEquals(expected, actual);
    }
}
