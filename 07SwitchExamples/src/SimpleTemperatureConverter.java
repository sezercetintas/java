import java.util.Scanner;

public class SimpleTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter the temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                System.out.print("Enter the temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            case 3:
                System.out.println("Exiting the Temperature Converter.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }
}
