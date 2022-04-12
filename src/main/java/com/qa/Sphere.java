package com.qa;


import java.text.DecimalFormat;

public class Sphere {
    private static DecimalFormat f = new DecimalFormat("##.00");

    public static double getVolume(double j) {
        double volume;
        double fourThirds = 1.33;
        double pi = 3.14;

        //Note: you must reuse the provided partial implementation above without changing it
        //Hint 1: volume of a sphere is: 4/3*radius^3
        //Hint 2: open the integrated terminal and run the command "gradle test" to execute all tests

        //your implementation goes here
        if(j>100){
            return 0.00;
        }
        if(j<0){
            throw new IllegalArgumentException("Radius can not be negative");
        }
        String volume_as_string;
        double radius_to_power_3 = Math.pow(j,3);
        System.out.println(radius_to_power_3);
        volume_as_string = f.format(fourThirds * pi * radius_to_power_3);
        volume = Double.parseDouble(volume_as_string);
        return volume;
    }
}