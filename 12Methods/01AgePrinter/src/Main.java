import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();

        printAge(age);
    }
        public static void printAge(int age) {
        System.out.println("Your age: : " + age);
    }
}