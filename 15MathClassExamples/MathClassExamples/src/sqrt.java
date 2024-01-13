import java.util.Scanner;

public class sqrt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate the square root: ");
        double squareRootInput = scanner.nextDouble();
        double squareRootResult = Math.sqrt(squareRootInput);
        System.out.println("Square Root: " + squareRootResult);
    }
}
