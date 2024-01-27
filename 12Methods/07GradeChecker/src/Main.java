import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Midterm Grade: ");
        double midtermGrade = scanner.nextDouble();
        System.out.print("Final Exam Grade: ");
        double finalExamGrade = scanner.nextDouble();

        System.out.println(isPassing(calculatePassingGrade(midtermGrade, finalExamGrade)) ? "Congratulations! You passed the course!, Your note: "+calculatePassingGrade(midtermGrade, finalExamGrade) : " Sorry, you did not pass the course, Your note: "+ calculatePassingGrade(midtermGrade, finalExamGrade));

    }

    public static double calculatePassingGrade(double midtermGrade, double finalExamGrade) {
        return (midtermGrade * 0.4) + (finalExamGrade * 0.6);
    }

    public static boolean isPassing(double passingGrade) {
        return passingGrade >= 50;
    }
}