import java.util.Scanner;
public class WhileLoopSumToZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number >= 0) {
            sum += number;
            number--;
        }

        System.out.println("Sum of numbers from the entered number to 0: " + sum);

    }
}
