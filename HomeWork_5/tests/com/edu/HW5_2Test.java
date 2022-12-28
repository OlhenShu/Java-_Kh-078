package com.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HW5_2Test {
    @Test
    @DisplayName("checkIfFirst5ElementsArePositive() returns TRUE")
    public void testCheckIfFirst5ElementsArePositiveShouldReturnTrue() {
        //given
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        //when
        boolean actual = HW5_2.checkIfFirst5ElementsArePositive(array);

        //then
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("checkIfFirst5ElementsArePositive() returns FALSE")
    public void testCheckIfFirst5ElementsArePositiveShouldReturnFalse() {
        //given
        int[] array = {1, -1, 1, 1, 1, 1, 1, 1, 1, 1};

        //when
        boolean actual = HW5_2.checkIfFirst5ElementsArePositive(array);

        //then
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("sumOfFirst5Elements() returns 5")
    public void testSumOfFirst5ElementsShouldReturn5() {
        //given
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 5;

        //when
        int actual = HW5_2.sumOfFirst5Elements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfLast5Elements() returns 0")
    public void testMultOfLast5ElementsShouldReturnZero() {
        //given
        int[] array = {1, 1, 1, 1, 1, 10, 10, 10, 10, 0};
        int expected = 0;

        //when
        int actual = HW5_2.multOfLast5Elements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfLast5Elements() returns 100000")
    public void testMultOfLast5ElementsShouldReturn100000() {
        //given
        int[] array = {1, 1, 1, 1, 1, 10, 10, 10, 10, 10};
        int expected = 100000;

        //when
        int actual = HW5_2.multOfLast5Elements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfLast5Elements() returns -1")
    public void testMultOfLast5ElementsShouldReturnNegative1() {
        //given
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, -1, 1};
        int expected = -1;

        //when
        int actual = HW5_2.multOfLast5Elements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }
}