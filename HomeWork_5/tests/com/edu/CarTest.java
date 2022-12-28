package com.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    @DisplayName("isCarExists() returns TRUE")
    public void testSsCarExistsShouldReturnTrue() {
        //given
        Car[] cars = new Car[4];
        cars[0] = new Car("sedan", 2000, 1.5);
        cars[1] = new Car("SUV", 1995, 2);
        cars[2] = new Car("coupe", 1990, 1);
        cars[3] = new Car("sedan", 2010, 2.2);
        int year = 2010;

        //when
        boolean actual = Car.isCarExists(cars, year);

        //then
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("isCarExists() returns FALSE")
    public void testSsCarExistsShouldReturnFalse() {
        //given
        Car[] cars = new Car[4];
        cars[0] = new Car("sedan", 2000, 1.5);
        cars[1] = new Car("SUV", 1995, 2);
        cars[2] = new Car("coupe", 1990, 1);
        cars[3] = new Car("sedan", 2010, 2.2);
        int year = 2020;

        //when
        boolean actual = Car.isCarExists(cars, year);

        //then
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("sortCarsByYear() returns sorted array by year")
    public void testSortCarsByYearReturnsSortedArray() {
        //given
        Car[] cars = new Car[4];
        cars[0] = new Car("sedan", 2000, 1.5);
        cars[1] = new Car("SUV", 1995, 2);
        cars[2] = new Car("coupe", 1990, 1);
        cars[3] = new Car("sedan", 2010, 2.2);
        Car[] expected = new Car[4];
        expected[0] = new Car("coupe", 1990, 1);
        expected[1] = new Car("SUV", 1995, 2);
        expected[2] = new Car("sedan", 2000, 1.5);
        expected[3] = new Car("sedan", 2010, 2.2);

        //when
        Car[] actual = Car.sortCarsByYear(cars);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}