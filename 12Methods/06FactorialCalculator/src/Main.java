import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        printFactorial(number);
    }


    public static void printFactorial(int num) {

        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println( num + " !: " + factorial);
        }
    }
}