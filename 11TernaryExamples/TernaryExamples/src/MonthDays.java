import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        int days = (month == 2) ? 28 :
                   (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;

        System.out.println("The month has " + days + " days.");
    }
}
