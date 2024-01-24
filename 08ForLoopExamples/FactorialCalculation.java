import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number to be Calculated with Factorial:");
        int myNumber = input.nextInt();
        int result = 1;
        for (int i = 1; i <= myNumber; i++) {
          System.out.println(i + "!: " + (result *= i));
         }


    }
}
