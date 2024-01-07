import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user=input.nextLine();
        System.out.println("\n");
        System.out.print("Enter Your Password: ");
        String password=input.nextLine();

        if (user.equals("admin") && password.equals("1234!") ) {

            System.out.println("Login successful");

        }
        else {

            System.out.println("Login Not Successful");
        }

    }
}
