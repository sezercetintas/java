import java.util.Scanner;

public class Pow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate the square: ");
        double powerInput = scanner.nextDouble();
        double powerResult = Math.pow(powerInput, 2);
        System.out.println("Square of the Number: " + powerResult);
    }
}
