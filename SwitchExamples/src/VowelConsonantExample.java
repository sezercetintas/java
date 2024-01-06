import java.util.Scanner;

public class VowelConsonantExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter is a vowel.");
                break;
            default:
                System.out.println("The letter is a consonant.");
        }

    }
}
