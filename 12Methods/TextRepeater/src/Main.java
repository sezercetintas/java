import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userText = scanner.nextLine();
        System.out.print("How many times do you want to repeat the text? ");
        int repeatCount = scanner.nextInt();
        repeatText(userText, repeatCount);
    }

    public static void repeatText(String text, int count) {
        int i=1;
        while (i<=count)
        {
            System.out.println(i+". ==> "+text);
            i++;

        }
    }
}