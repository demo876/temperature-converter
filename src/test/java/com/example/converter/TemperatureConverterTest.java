
package com.example.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private static final double DELTA = 0.0001;

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0,
                TemperatureConverter.celsiusToFahrenheit(0), DELTA);

        assertEquals(212.0,
                TemperatureConverter.celsiusToFahrenheit(100), DELTA);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0,
                TemperatureConverter.fahrenheitToCelsius(32), DELTA);

        assertEquals(100.0,
                TemperatureConverter.fahrenheitToCelsius(212), DELTA);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15,
                TemperatureConverter.celsiusToKelvin(0), DELTA);

        assertEquals(373.15,
                TemperatureConverter.celsiusToKelvin(100), DELTA);
    }

    @Test
    void testNegativeCelsius() {
        assertEquals(23.0,
                TemperatureConverter.celsiusToFahrenheit(-5), DELTA);

        assertEquals(263.15,
                TemperatureConverter.celsiusToKelvin(-10), DELTA);
    }

    @Test
    void testNegativeFahrenheit() {
        assertEquals(-40.0,
                TemperatureConverter.fahrenheitToCelsius(-40), DELTA);
    }

    @Test
    void testAbsoluteZero() {
        assertEquals(0.0,
                TemperatureConverter.celsiusToKelvin(-273.15), DELTA);
    }

    @Test
    void testNegativeKelvin() {
        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.kelvinToCelsius(-1));
    }

    @Test
    void testInvalidCelsius() {
        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(-274));
    }

    @Test
    void testInvalidFahrenheit() {
        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.fahrenheitToCelsius(-460));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(Double.NaN));

        assertThrows(IllegalArgumentException.class,
                () -> TemperatureConverter.celsiusToKelvin(
                        Double.POSITIVE_INFINITY));
    }
}
