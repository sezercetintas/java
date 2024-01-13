import java.util.Scanner;

public class sin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sine: ");
        double sinInput = scanner.nextDouble();
        double sinResult = Math.sin(sinInput);
        System.out.println("Sine: " + sinResult);
    }
}
