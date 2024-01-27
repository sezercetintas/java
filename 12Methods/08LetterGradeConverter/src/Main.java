import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        double grade = scanner.nextDouble();

        System.out.println("Letter Grade: " + convertToLetterGrade(grade));


    }
    public static String convertToLetterGrade(double not) {
        if (not < 0 || not > 100) {
            return "Invalid grade";
        } else if (not >= 90) {
            return "AA";
        } else if (not >= 80) {
            return "BA";
        } else if (not >= 70) {
            return "BB";
        } else if (not >= 60) {
            return "CB";
        } else if (not >= 50) {
            return "CC";
        } else if (not >= 40) {
            return "DC";
        } else {
            return "FF";
        }
    }
}