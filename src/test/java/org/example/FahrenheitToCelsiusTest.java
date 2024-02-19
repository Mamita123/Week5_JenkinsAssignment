package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class FahrenheitToCelsiusTest extends TestCase {
    @Test
    public void testConvertFahrenheitToCelsius() {
        double fahrenheit = 32;
        double expectedCelsius = 0;
        double actualCelsius = FahrenheitToCelsius.convertFahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @Test
    public void testConvertFahrenheitToCelsius_BoilingPoint() {
        double expectedCelsius = 100;
        double actualCelsius = FahrenheitToCelsius.convertFahrenheitToCelsius_BoilingPointToCelsius();
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @Test
    public void testConvertFahrenheitToCelsius_NegativeValue() {
        double expectedCelsius = -23.3333; // Calculated value
        double actualCelsius = FahrenheitToCelsius.convertFahrenheitToCelsius_NegativeValue();
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @Test
    public void testConvertFahrenheitToCelsius_HighTemperature(){
        double expectedCelsius = 537.7777; // Calculated value
        double actualCelsius = FahrenheitToCelsius.convertFahrenheit_HighTemperature();
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

    @Test
    public void testConvertFahrenheitToCelsius_ZeroFahrenheit(){
        double expectedCelsius = -17.7778; // Calculated value
        double actualCelsius = FahrenheitToCelsius.convertFahrenheitToCelsius_ZeroFahrenheit();
        assertEquals(expectedCelsius, actualCelsius, 0.0001);
    }

}