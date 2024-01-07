import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Value");
        int number1 = input.nextInt();
        System.out.println("End Value");
        int number2 = input.nextInt();

        for (int i = number1; i < number2; i++) {
            boolean control = false;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    control = true;
                }

            }
            if (control == false) {
                System.out.println(i);
            }
        }
    }
}
