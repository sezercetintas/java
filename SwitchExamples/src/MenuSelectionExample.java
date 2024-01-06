import java.util.Scanner;

public class MenuSelectionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Exit");
         System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
          switch (choice) {
            case 1:
                System.out.println("You selected Option 1.");
                break;
            case 2:
                System.out.println("You selected Option 2.");
                break;
            case 3:
                System.out.println("You selected Option 3.");
                break;
            case 4:
                System.out.println("Exiting the menu.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

    }
}
