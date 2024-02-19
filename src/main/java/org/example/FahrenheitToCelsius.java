package org.example;

public class FahrenheitToCelsius {
    private double fahrenheit;
    private double celsius;
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

// Method to convert boiling point of water (212 Fahrenheit) to Celsius
    public static double convertFahrenheitToCelsius_BoilingPointToCelsius() {
        return convertFahrenheitToCelsius(212);
    }

    // Method to convert a negative Fahrenheit value (-10 Fahrenheit) to Celsius
    public static double convertFahrenheitToCelsius_NegativeValue() {
        return convertFahrenheitToCelsius(-10);
    }

    // Method to convert a high Fahrenheit temperature (1000 Fahrenheit) to Celsius
    public static double convertFahrenheit_HighTemperature() {
        return convertFahrenheitToCelsius(1000);
    }

    // Method to convert zero Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius_ZeroFahrenheit() {
        return convertFahrenheitToCelsius(0);
    }


}
