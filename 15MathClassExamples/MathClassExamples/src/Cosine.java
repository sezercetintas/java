import java.util.Scanner;

public class Cosine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the cosine: ");
        double cosInput = scanner.nextDouble();
        double cosResult = Math.cos(cosInput);
        System.out.println("Cosine: " + cosResult);

    }
}
