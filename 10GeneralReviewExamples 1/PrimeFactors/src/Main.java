import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factor = 2;

        System.out.print("Prime factors of " + number + ": ");

        do {

            if (number % factor == 0) {
                System.out.print(factor + " ");
                number /= factor;
            } else {
                factor++;
            }


        } while (number > 1);
    }
}