import java.util.Scanner;
public class ArmstrongNumberWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int digitCount = 0;
        int temp = originalNumber;


        for (temp = originalNumber; temp != 0; temp = temp / 10) {
            digitCount++;
        }
        temp = originalNumber;
        int sum = 0;

        for (temp = originalNumber; temp != 0; temp = temp / 10) {
            int digit = temp % 10;

            // Calculate power without using Math class
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }
            sum += power;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }


    }
}
