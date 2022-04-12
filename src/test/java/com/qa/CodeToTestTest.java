package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeToTestTest {

    @Test
    public void testSayHello(){
        CodeToTest code = new CodeToTest();
        assertEquals("Hello!", code.sayHello());
    }
}
