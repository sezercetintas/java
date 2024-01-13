import java.util.Scanner;
public class Ceil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the ceiling value: ");
        double ceilInput = scanner.nextDouble();
        double ceilResult = Math.ceil(ceilInput);
        System.out.println("Ceiling Value: " + ceilResult);
    }
}
