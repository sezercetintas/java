import java.util.Scanner;
public class FactorialWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int counter = 1;

        while (counter <= number) {
            factorial *= counter;
            counter++;
        }

        System.out.println(number + "! = " + factorial);
    }
}
