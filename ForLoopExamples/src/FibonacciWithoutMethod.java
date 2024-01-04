import java.util.Scanner;
public class FibonacciWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();

        int previous = 0;
        int current = 1;

        System.out.print("Fibonacci Series: " + previous + ", " + current);

        for (int i = 2; i < limit; i++) {
            int next = previous + current;
            System.out.print(", " + next);

            previous = current;
            current = next;
        }


    }
}
