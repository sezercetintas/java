import java.util.Scanner;

public class DivisorsUpToLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor limit: ");
        int divisorLimit = scanner.nextInt();
        System.out.println("Divisors of " + number + " up to " + divisorLimit + ":");

        for (int i = 1; i <= divisorLimit; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}