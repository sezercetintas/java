import java.util.Scanner;
public class DigitCountWithForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        boolean negative = number < 0;


        if (negative) {
            number = -number;
        }

        int digitCount = 0;


        for (int tempNumber = number; tempNumber > 0; tempNumber /= 10) {
            digitCount++;
        }

        System.out.println("The number of digits in the entered number: " + digitCount);

    }
}