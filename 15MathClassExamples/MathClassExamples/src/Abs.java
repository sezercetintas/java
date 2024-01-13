import java.util.Scanner;
public class Abs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double absoluteInput = scanner.nextDouble();
        double absoluteResult = Math.abs(absoluteInput);
        System.out.println("Absolute Value: " + absoluteResult);

    }
}
