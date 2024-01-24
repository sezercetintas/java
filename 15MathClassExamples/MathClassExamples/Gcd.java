import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers (e.g., 36 48): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcdResult = gcd(num1, num2);
        System.out.println("Greatest Common Divisor (GCD): " + gcdResult);

        scanner.close();
    }
     private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
