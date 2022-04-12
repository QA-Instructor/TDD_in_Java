package com.qa;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorMockTest {


    @Test
    public void multiply_mockedStatic_returns_20() {

//Arrange
        MockedStatic<Calculator> calc = Mockito.mockStatic(Calculator.class);
        calc.when(() -> Calculator.multiply(10, 2)).thenReturn(20.0);

        double num1 = 10;
        double num2 = 2;
        double expectedAnswer = 20.0;

//        Act
        double answer = Calculator.multiply(num1, num2);

//        Assert
        assertEquals(expectedAnswer, answer);


    }
}
