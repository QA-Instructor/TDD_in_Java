package com.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SphereTest {
    @Test
    public void getVolume_PositiveRadiusOneHundred_ReturnsCorrectVolume() {
        //arrange
        double radius = 100;
        double expected = 4176200.00;

        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }



    @Test
    public void getVolume_RadiusTenPointFive_ReturnsCorrectVolumeToTwoDecimalPlaces() {
        //arrange
        double radius = 10.5;
        double expected = 4834.47;

        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

    @Test
    public void getVolume_PositiveRadiusGreaterThan1000_ReturnsZeroVolume() {
        //hint: this tests an arbitary rule - radius > 1000 should return 0

        //arrange
        double radius = 1100;
        double expected = 0;

        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

    @Test
    public void getVolume_ZeroRadius_ReturnsZeroVolume() {
        //arrange
        double radius = 0;
        double expected = 0;

        //act
        double volume = Sphere.getVolume(radius);

        //assert
        assertTrue(volume == expected);
    }

//    @Test(expected = IllegalArgumentException.class)
    @Test
    public void getVolume_NegativeRadius_ThrowsIllegalArgumentException() {
        //arrange
        double radius = -100;

        //act
//        double volume = Sphere.getVolume(radius);


        // assert & act
        Assertions.assertThrows(IllegalArgumentException.class, () -> Sphere.getVolume(radius));
    }
}
