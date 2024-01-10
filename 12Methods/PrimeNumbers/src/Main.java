import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers:");

        int i = 2;
        while (i <= upperLimit) {
            i++;
            if (isPrime(i)) System.out.print(i + " ");
    
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}