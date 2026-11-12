
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

        if (!scanner.hasNextLine()) {
            System.out.println("No input received. Please run interactively.");
            return;
        }

        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter temperature: ");

            if (!scanner.hasNextLine()) {
                System.out.println("No temperature received.");
                return;
            }

            double temperature =
                    Double.parseDouble(scanner.nextLine().trim());

            switch (choice) {

                case 1:
                    System.out.println("Fahrenheit: " +
                            TemperatureConverter.celsiusToFahrenheit(temperature));
                    break;

                case 2:
                    System.out.println("Celsius: " +
                            TemperatureConverter.fahrenheitToCelsius(temperature));
                    break;

                case 3:
                    System.out.println("Kelvin: " +
                            TemperatureConverter.celsiusToKelvin(temperature));
                    break;

                case 4:
                    System.out.println("Celsius: " +
                            TemperatureConverter.kelvinToCelsius(temperature));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
