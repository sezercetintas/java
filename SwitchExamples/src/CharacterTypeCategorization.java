import java.util.Scanner;

public class CharacterTypeCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        String category;

        switch (Character.getType(character)) {
            case Character.UPPERCASE_LETTER:
                category = "Uppercase Letter";
                break;
            case Character.LOWERCASE_LETTER:
                category = "Lowercase Letter";
                break;
            case Character.DECIMAL_DIGIT_NUMBER:
                category = "Digit";
                break;
            default:
                category = "Other";
        }

        System.out.println("Character category: " + category);

    }
}
