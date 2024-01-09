import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        printNumbersInRange(num1, num2);



    }

    public static void printNumbersInRange(int start, int end) {
        System.out.println("Numbers in the range: ");
        int i=start;

        while (i <= end){

            System.out.print((i<=9)?(i + ", "):(i + " "));
            i++;



        }
    }
}