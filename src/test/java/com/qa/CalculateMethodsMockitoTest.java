package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {

//    extra POM dependencies
//        <!-- https://mvnrepository.com/artifact/org.mockito/mockito-junit-jupiter -->
//    <dependency>
//      <groupId>org.mockito</groupId>
//      <artifactId>mockito-junit-jupiter</artifactId>
//      <version>4.0.0</version>
//      <scope>test</scope>
//    </dependency>
//
//    <!-- https://mvnrepository.com/artifact/org.mockito/mockito-core -->
//    <dependency>
//      <groupId>org.mockito</groupId>
//      <artifactId>mockito-core</artifactId>
//      <version>4.0.0</version>
//      <scope>test</scope>
//    </dependency>

    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setupMocks(){
        Mockito.when(calculateMethods.divide(6,3)).thenReturn(2);
    }

    @Test
    public void testDivide(){
        assertEquals(2, calculateMethods.divide(6,3));
    }
}
