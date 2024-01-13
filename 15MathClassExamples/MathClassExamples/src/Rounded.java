import java.util.Scanner;

public class Rounded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double roundInput = scanner.nextDouble();
        long roundedValue = Math.round(roundInput);
        System.out.println("Rounded Value: " + roundedValue);

    }
}
