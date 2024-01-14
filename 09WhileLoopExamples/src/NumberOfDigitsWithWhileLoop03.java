import java.util.Scanner;
public class NumberOfDigitsWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = 0;

        // Take the absolute value considering negative numbers
        number = Math.abs(number);

        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        System.out.println("The entered number has " + digitCount + " digit(s).");


    }
}
