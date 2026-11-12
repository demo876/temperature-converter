
package com.example.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private static final double DELTA = 0.0001;

    // Test 1: Celsius to Fahrenheit
    @Test
    void testCelsiusToFahrenheit() {

        assertEquals(32.0,
                TemperatureConverter.celsiusToFahrenheit(0), DELTA);

        assertEquals(212.0,
                TemperatureConverter.celsiusToFahrenheit(100), DELTA);
    }

    // Test 2: Fahrenheit to Celsius
    @Test
    void testFahrenheitToCelsius() {

        assertEquals(0.0,
                TemperatureConverter.fahrenheitToCelsius(32), DELTA);

        assertEquals(100.0,
                TemperatureConverter.fahrenheitToCelsius(212), DELTA);
    }

    // Test 3: Celsius to Kelvin
    @Test
    void testCelsiusToKelvin() {

        assertEquals(273.15,
                TemperatureConverter.celsiusToKelvin(0), DELTA);

        assertEquals(373.15,
                TemperatureConverter.celsiusToKelvin(100), DELTA);
    }

    // Test 4: Negative Celsius
    @Test
    void testNegativeCelsius() {

        assertEquals(23.0,
                TemperatureConverter.celsiusToFahrenheit(-5), DELTA);

        assertEquals(263.15,
                TemperatureConverter.celsiusToKelvin(-10), DELTA);
    }

    // Test 5: Negative Fahrenheit
    @Test
    void testNegativeFahrenheit() {

        assertEquals(-40.0,
                TemperatureConverter.fahrenheitToCelsius(-40), DELTA);
    }

    // Test 6: Absolute zero
    @Test
    void testAbsoluteZero() {

        assertEquals(0.0,
                TemperatureConverter.celsiusToKelvin(-273.15), DELTA);

        assertEquals(-273.15,
                TemperatureConverter.kelvinToCelsius(0), DELTA);

        assertEquals(-459.67,
                TemperatureConverter.celsiusToFahrenheit(-273.15), DELTA);
    }

    // Test 7: Negative Kelvin validation
    @Test
    void testNegativeKelvin() {

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.kelvinToCelsius(-1));
    }

    // Test 8: Invalid Celsius validation
    @Test
    void testInvalidCelsius() {

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(-274));

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToFahrenheit(-274));
    }

    // Test 9: Invalid Fahrenheit validation
    @Test
    void testInvalidFahrenheit() {

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.fahrenheitToCelsius(-460));
    }

    // Test 10: Invalid numeric inputs
    @Test
    void testInvalidInput() {

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(Double.NaN));

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(
                        Double.POSITIVE_INFINITY));

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.fahrenheitToCelsius(
                        Double.NEGATIVE_INFINITY));
    }
}
