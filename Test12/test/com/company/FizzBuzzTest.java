package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    public static final String FIZZ = "Fizz";

    @Test
    @DisplayName("abc")
    void fizzBuzz() {
        String result = FizzBuzz.fizzBuzz();
        String expected = FIZZ;
        assertEquals(expected,result);
    }
}