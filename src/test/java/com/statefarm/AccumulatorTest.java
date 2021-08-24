package com.statefarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccumulatorTest {

    @Test
    public void toSentenceTest() {
        Accumulator accumulator1 = new Accumulator();
        String[] names = {"christian"};
        assertEquals( "", accumulator1.toSentence(names));

    }


}
