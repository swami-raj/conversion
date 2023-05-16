import java.text.DecimalFormat;
import java.util.Scanner;
public class kms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Welcome to Unit Converter!");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Temperature Converter");
            System.out.println("4. Weight Converter");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount in INR: ");
                    double amountINR = scanner.nextDouble();
                    System.out.println("Choose the currency to convert to:");
                    System.out.println("1. USD");
                    System.out.println("2. Euro");
                    System.out.println("3. Pound");
                    System.out.print("Enter your choice (1-3): ");
                    int currencyChoice = scanner.nextInt();
                    double convertedCurrency = 0.0;
                    switch (currencyChoice) {
                        case 1:
                            convertedCurrency = convertINRToUSD(amountINR);
                            System.out.println("Converted amount in USD: $" + decimalFormat.format(convertedCurrency));
                            break;
                        case 2:
                            convertedCurrency = convertINRToEuro(amountINR);
                            System.out.println("Converted amount in Euro: " + decimalFormat.format(convertedCurrency) + "€");
                            break;
                        case 3:
                            convertedCurrency = convertINRToPound(amountINR);
                            System.out.println("Converted amount in Pound: £" + decimalFormat.format(convertedCurrency));
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter the distance in kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double convertedDistance = convertKmToMiles(kilometers);
                    System.out.println("Converted distance in miles: " + decimalFormat.format(convertedDistance) + " mi");
                    break;
                case 3:
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double convertedTemperature = convertCelsiusToFahrenheit(celsius);
                    System.out.println("Converted temperature in Fahrenheit: " + decimalFormat.format(convertedTemperature) + "°F");
                    break;
                case 4:
                    System.out.print("Enter the weight in kilograms: ");
                    double kilograms = scanner.nextDouble();
                    System.out.println("Choose the weight unit to convert to:");
                    System.out.println("1. Pounds");
                    System.out.println("2. Ounces");
                    System.out.print("Enter your choice (1-2): ");
                    int weightChoice = scanner.nextInt();
                    double convertedWeight = 0.0;
                    switch (weightChoice) {
                        case 1:
                            convertedWeight = convertKgToPounds(kilograms);
                            System.out.println("Converted weight in pounds: " + decimalFormat.format(convertedWeight) + " lbs");
                            break;
                        case 2:
                            convertedWeight = convertKgToOunces(kilograms);
                            System.out.println("Converted weight in ounces:" + decimalFormat.format(convertedWeight) + " oz");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println();
        }
        System.out.println("Thank you for using Unit Converter!");
        
    }
    public static double convertINRToUSD(double amountINR) {
        return amountINR / 82.27;
    }

    public static double convertINRToEuro(double amountINR) {
        return amountINR / 89.5;
    }

    public static double convertINRToPound(double amountINR) {
        return amountINR / 103.5;
    }

    public static double convertKmToMiles(double kilometers) {
        return kilometers * 0.62137119;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertKgToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertKgToOunces(double kilograms) {
        return kilograms * 35.274;
    }
}
