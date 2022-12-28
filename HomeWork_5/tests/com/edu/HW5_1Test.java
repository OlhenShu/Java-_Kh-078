package com.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HW5_1Test {
    @Test
    @DisplayName("daysInMonth() returns 31")
    public void testDaysInMonthShouldReturn31() {
        //given
        int month = 1;
        int expected = 31;

        //when
        int actual = HW5_1.daysInMonth(month);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("daysInMonth() returns 30")
    public void testDaysInMonthShouldReturn30() {
        //given
        int month = 6;
        int expected = 30;

        //when
        int actual = HW5_1.daysInMonth(month);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("daysInMonth() raises Exception")
    public void testDaysInMonthShouldRaiseException() {
        //given
        int month = 13;

        //then
        Assertions.assertThrows(Exception.class, () -> HW5_1.daysInMonth(month));
    }
}