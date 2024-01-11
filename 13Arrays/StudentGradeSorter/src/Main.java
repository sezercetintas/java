public class Main {
    public static void main(String[] args) {

        String[] studentNames = {"Ahmet", "Mehmet", "Ayşe", "Fatma"};
        int[] studentGrades = {75, 90, 65, 80};

        sortStudentsByGrades(studentNames, studentGrades);

        System.out.println("Sorted Student Information:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }
    }

    private static void sortStudentsByGrades(String[] names, int[] grades) {
        int length = grades.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (grades[j] < grades[j + 1]) {
 
                    int tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }


    }
    }