package com.qa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculateMethodsTest {
    private CalculateMethods calculateMethods = new CalculateMethods();

    @Test
    public void testDivideSuccess(){
        assertEquals(10, calculateMethods.divide(100,10));
    }

    @Test
    @Disabled
    public void testDivideFails(){
        assertEquals(11, calculateMethods.divide(100,10));
    }

    @Test
    public void testDivideByZero(){
//        this is a lambda statement that expresses the instance of a Functional Interface
//        a Functional Interface is an interface with only one callable method
//        a lambda is an anonymous method
        assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100,0));
    }


}
