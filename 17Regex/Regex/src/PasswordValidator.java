import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password.");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;
        boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty();
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;

        if (!digitControl){
            System.out.println("The password must contain at least one digit.");
        }

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if (isValid){
            System.out.println("The password is valid.");
        }else {
            System.out.println("The password is invalid.");
        }
    }
}
