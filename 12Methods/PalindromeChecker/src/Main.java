import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println((isPalindrome(text)==true)?("This text is a palindrome."):("This text is not a palindrome"));
    }
    public static boolean isPalindrome(String str) {
        String cleanText = str.toLowerCase().replaceAll("\\s", "");
        String reversedText = new StringBuilder(cleanText).reverse().toString();

        return cleanText.equals(reversedText);
    }
}