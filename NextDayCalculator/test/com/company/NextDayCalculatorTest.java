package com.company;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void checkNumberDayOfMonth() {
        int month = 1;
        int year = 2018;
        int expected = 31;
        int result = NextDayCalculator.checkNumberDayOfMonth(month, year);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        int year = 2020;
        boolean expected = true;
        boolean result = NextDayCalculator.checkLeapYear(year);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void calculateNextDay() {
        int day = 28;
        int month = 2;
        int year = 2019;

    }
}