import java.util.Scanner;
public class SortingDescendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter the 1st number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        number2 = scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        number3 = scanner.nextInt();


        int temp;

        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 < number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }


        System.out.println("Sorted Numbers (Descending Order):");
        System.out.println(number1 + " " + number2 + " " + number3);


    }
}
