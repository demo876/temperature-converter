
package com.example.converter;

public class TemperatureConverter {

    private TemperatureConverter() {
    }

    public static double celsiusToFahrenheit(double celsius) {
        validateFinite(celsius);

        if (celsius < -273.15) {
            throw new IllegalArgumentException(
                "Celsius cannot be below absolute zero");
        }

        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        validateFinite(fahrenheit);

        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException(
                "Fahrenheit cannot be below absolute zero");
        }

        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static double celsiusToKelvin(double celsius) {
        validateFinite(celsius);

        if (celsius < -273.15) {
            throw new IllegalArgumentException(
                "Celsius cannot be below absolute zero");
        }

        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        validateFinite(kelvin);

        if (kelvin < 0) {
            throw new IllegalArgumentException(
                "Kelvin cannot be negative");
        }

        return kelvin - 273.15;
    }

    private static void validateFinite(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(
                "Temperature must be a finite number");
        }
    }
}
