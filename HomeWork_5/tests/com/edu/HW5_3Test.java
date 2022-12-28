package com.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HW5_3Test {
    @Test
    @DisplayName("quantityPositiveElements() returns 5")
    public void testQuantityPositiveElementsShouldReturn5() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        int expected = 5;

        //when
        int actual = HW5_3.quantityPositiveElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("quantityPositiveElements() returns 0")
    public void testQuantityPositiveElementsShouldReturnZero() {
        //given
        int[] array = {-1, -2, -3, -4, 0};
        int expected = 0;

        //when
        int actual = HW5_3.quantityPositiveElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("indexOf2ndPositiveElement() returns -1 (no positive elements)")
    public void testIndexOf2ndPositiveElementShouldReturnNegative1() {
        //given
        int[] array = {-1, -2, -3, -4, 0};
        int expected = -1;

        //when
        int actual = HW5_3.indexOf2ndPositiveElement(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("indexOf2ndPositiveElement() returns 1")
    public void testIndexOf2ndPositiveElementShouldReturn1() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        int expected = 1;

        //when
        int actual = HW5_3.indexOf2ndPositiveElement(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("indexOfMinElement() returns 0")
    public void testIndexOfMinElementShouldReturnZero() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        int expected = 0;

        //when
        int actual = HW5_3.indexOfMinElement(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("indexOfMinElement() returns 4")
    public void testIndexOfMinElementShouldReturn4() {
        //given
        int[] array = {1, 2, 3, 4, -5};
        int expected = 4;

        //when
        int actual = HW5_3.indexOfMinElement(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfEvenElements() returns 0")
    public void testMultOfEvenElementsShouldReturnZero() {
        //given
        int[] array = {0, 2, 3, 4, 5};
        int expected = 0;

        //when
        int actual = HW5_3.multOfEvenElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfEvenElements() returns 1")
    public void testMultOfEvenElementsShouldReturn1() {
        //given
        int[] array = {1, 3, 5, 7, 9};
        int expected = 1;

        //when
        int actual = HW5_3.multOfEvenElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfEvenElements() returns 100")
    public void testMultOfEvenElementsShouldReturn100() {
        //given
        int[] array = {1, 10, 3, 10, 5};
        int expected = 100;

        //when
        int actual = HW5_3.multOfEvenElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("multOfEvenElements() returns -100")
    public void testMultOfEvenElementsShouldReturnNegative100() {
        //given
        int[] array = {1, -10, 3, 10, 5};
        int expected = -100;

        //when
        int actual = HW5_3.multOfEvenElements(array);

        //then
        Assertions.assertEquals(expected, actual);
    }
}