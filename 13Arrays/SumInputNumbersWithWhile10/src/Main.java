import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;

        System.out.println("Enter numbers to sum (enter 0 to finish):");

        while (true) {
            userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }

            sum += userInput;
        }

        System.out.println("Sum: " + sum);
    }
}