package com.codedifferently.petshop.birds;

import com.codedifferently.petshop.ActivityTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoveBirdsTest {

    @Test
    public void constructorTest01(){
        LoveBirds loveBirds = new LoveBirds("Yenni", 25, ActivityTime.NOCTURNAL);
        String expected = "Yenni 25 NOCTURNAL";
        String actual = loveBirds.toString();
        Assertions.assertEquals(expected,actual);
    }
}
