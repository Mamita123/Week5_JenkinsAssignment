package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class KelvinToCelsiusTest extends TestCase {
    @Test
    public void testKelvinToCelsius() {
        // Test case 1: 300 Kelvin
        double kelvin1 = 300.0;
        double expectedCelsius1 = 26.85; // Expected Celsius value
        assertEquals(expectedCelsius1, KelvinToCelsius.kelvinToCelsius(kelvin1), 0.01); // Allowing a tolerance of 0.01
    }

    @Test
    public void testKelvinToCelsius_ZeroKelvin() {
        // Test case 2: 0 Kelvin
        double kelvin2 = 0.0;
        double expectedCelsius2 = -273.15; // Expected Celsius value
        assertEquals(expectedCelsius2, KelvinToCelsius.kelvinToCelsius(kelvin2), 0.01); // Allowing a tolerance of 0.01
    }

    @Test
    public void testKelvinToCelsius_NegativeKelvin() {
        // Test case 3: Negative Kelvin
        double kelvin3 = -100.0;
        double expectedCelsius3 = -373.15; // Expected Celsius value for -100 Kelvin
        assertEquals(expectedCelsius3, KelvinToCelsius.kelvinToCelsius(kelvin3), 0.01); // Allowing a tolerance of 0.01
    }







}