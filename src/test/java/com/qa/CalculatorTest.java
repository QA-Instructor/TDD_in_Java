package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add_PositiveIntegers_GivesPositiveCorrectResult(){
//        arrange
        int num1 = 2;
        int num2 = 4;
        int expected_answer = 6;
//        act
        int answer = Calculator.add(num1, num2);
//        assert
        assertEquals(expected_answer, answer);
    }


    //    TDD - add test
    @Test
    public void add_PositiveNumbers_2_and_4_GivesPositiveNumber_6(){
//        Triple 'A' pattern
//        Arrange
        double num1 = 2.0;
        double num2 = 4.0;
        double expectedAnswer = 6.0;

//        Act
        double answer = Calculator.add(num1, num2);

//        Assert
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void add_PositiveNumbers_1_and_2_GivesPositiveNumber_3(){
//        Triple 'A' pattern
//        Arrange
        double num1 = 1.0;
        double num2 = 2.0;
        double expectedAnswer = 3.0;

//        Act
        double answer = Calculator.add(num1, num2);

//        Assert
        assertEquals(expectedAnswer, answer);
    }

    //    Divide test
    @Test
    public void divide_PositiveNumbers_10_and_5_GivesPositiveNumber_2(){
        //        Arrange
        double num1 = 10;
        double num2 = 5;
        double expectedAnswer = 2;

//        Act
        double answer = Calculator.divide(num1, num2);

//        Assert
        assertEquals(expectedAnswer, answer);

    }

    //    Divide test
    @Test
    public void divide_PositiveIntegers_10_and_5_GivesPositiveInteger_2(){
        //        Arrange
        int num1 = 10;
        int num2 = 5;
        int expectedAnswer = 2;

//        Act
        int answer = Calculator.divide(num1, num2);

//        Assert
        assertEquals(expectedAnswer, answer);

    }

    @Test
    public void divide_PositiveNumbers_10_and_0_ThrowsException(){
        //        Arrange
        int num1 = 10;
        int num2 = 0;

        assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, num2));

    }


    @Test
    public void divide_PositiveDoubles_10_and_0_GivesInfinity(){
        //        Arrange
        double num1 = 10;
        double num2 = 0;
        double expectedAnswer = Double.POSITIVE_INFINITY;
//        assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, num2));
        //        Act
        double answer = Calculator.divide(num1, num2);
//        Assert
        assertEquals(expectedAnswer, answer);
    }
}