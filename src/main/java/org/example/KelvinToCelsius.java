package org.example;

public class KelvinToCelsius {
    private static final double ABSOLUTE_ZERO_KELVIN = 273.15;

    public static double kelvinToCelsius(double kel){
        // Use the variable for absolute zero in the calculation
        return kel - ABSOLUTE_ZERO_KELVIN;
    }
}
