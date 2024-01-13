import java.util.Scanner;

public class log {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate the natural logarithm: ");
        double logInput = scanner.nextDouble();
        double logResult = Math.log(logInput);
        System.out.println("Natural Logarithm: " + logResult);
    }
}
