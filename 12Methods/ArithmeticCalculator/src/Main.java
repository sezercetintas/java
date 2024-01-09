import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

         performArithmeticOperations(num1, num2);
    }
    public static void performArithmeticOperations(double num1, double num2) {
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        double quotient = (num2 != 0) ? (num1 / num2) : 0;

        System.out.println("Sum: " + sum);
        System.out.println((num1>num2)?("Difference: " + difference):("Difference: " + (Math.abs(difference))));
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}