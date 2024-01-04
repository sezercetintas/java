import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int gcd = 1;

        // Calculating GCD
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i; // Update the greatest common divisor
            }
        }

        int lcm = 1;
        for (int i = 1; i <= number1 * number2; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                lcm = i; // Update the least common multiple
                break; // Terminate the loop after finding LCM
            }
        }

        System.out.println("GCD(" + number1 + ", " + number2 + ") = " + gcd);
        System.out.println("LCM(" + number1 + ", " + number2 + ") = " + lcm);

    }

    }

