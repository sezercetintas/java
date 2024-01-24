import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers (e.g., 5 10): ");
        double minMaxInput1 = scanner.nextDouble();
        double minMaxInput2 = scanner.nextDouble();
        double minValue = Math.min(minMaxInput1, minMaxInput2);
        double maxValue = Math.max(minMaxInput1, minMaxInput2);
        System.out.println("Minimum Value: " + minValue);
        System.out.println("Maximum Value: " + maxValue);
    }
}
