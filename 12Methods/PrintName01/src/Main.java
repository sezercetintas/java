import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        printName(name);
    }

    public static void printName(String name) {

        System.out.println("Hello, " + name + "! Welcome!");
    }
}