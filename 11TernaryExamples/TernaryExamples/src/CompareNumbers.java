import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        String result = (num1 > num2) ? "First number is greater" :
        (num1 < num2) ? "Second number is greater" : "Numbers are equal";

        System.out.println(result);
    }
}
