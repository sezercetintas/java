import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printSquare(number);
    }


    public static void printSquare(int num) {
        int a=0,i=1;

        while (i<=num)
        {
            a+=num;
            i++;

        }

        System.out.println("("+num+"²) = " + a);
    }
}