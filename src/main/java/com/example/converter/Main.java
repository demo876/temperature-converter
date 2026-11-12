
package com.example.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== TEMPERATURE CONVERTER =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");

        System.out.print("Choose conversion: ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter temperature: ");
            double temperature = Double.parseDouble(scanner.nextLine());

            double result;

            switch (choice) {

                case 1:
                    result = TemperatureConverter
                            .celsiusToFahrenheit(temperature);
                    System.out.println("Fahrenheit: " + result);
                    break;

                case 2:
                    result = TemperatureConverter
                            .fahrenheitToCelsius(temperature);
                    System.out.println("Celsius: " + result);
                    break;

                case 3:
                    result = TemperatureConverter
                            .celsiusToKelvin(temperature);
                    System.out.println("Kelvin: " + result);
                    break;

                case 4:
                    result = TemperatureConverter
                            .kelvinToCelsius(temperature);
                    System.out.println("Celsius: " + result);
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
