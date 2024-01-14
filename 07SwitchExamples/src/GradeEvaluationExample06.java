public class GradeEvaluationExample {
    public static void main(String[] args) {
        int studentScore = 70;
        char grade;

        switch (studentScore / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Student score: " + studentScore);
        System.out.println("Grade: " + grade);
    }
}
