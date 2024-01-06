import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to TRY");
        System.out.println("4. TRY to USD");
        System.out.println("5. Exit");

        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        double amount, result;

        switch (choice) {
            case 1:
                System.out.print("Enter USD amount: $");
                amount = scanner.nextDouble();
                result = amount * 0.91;
                System.out.println("Equivalent in EUR: €" + result);
                break;
            case 2:
                System.out.print("Enter EUR amount: €");
                amount = scanner.nextDouble();
                result = amount * 1.10;
                System.out.println("Equivalent in USD: $" + result);
                break;
            case 3:
                System.out.print("Enter USD amount: $");
                amount = scanner.nextDouble();
                result = amount * 29.84;
                System.out.println("Equivalent in TL: ₺" );
                break;
            case 4:
                System.out.print("Enter TL amount: ₺");
                amount = scanner.nextDouble();
                result = amount * 0.034;
                System.out.println("Equivalent in USD: $" + result);
                break;
            case 5:
                System.out.println("Exiting the Currency Converter.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

    }
}
