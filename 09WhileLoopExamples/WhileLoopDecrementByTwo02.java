import java.util.Scanner;
public class WhileLoopDecrementByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number -= 2;
        }

    }
}
