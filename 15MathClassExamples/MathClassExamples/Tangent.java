import java.util.Scanner;

public class Tangent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the tangent: ");
        double tanInput = scanner.nextDouble();
        double tanResult = Math.tan(tanInput);
        System.out.println("Tangent: " + tanResult);


    }
}
