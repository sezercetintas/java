import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number to cube: ");
        int myNumber=input.nextInt();
        int cube=0;

        for (int i = 0; i < myNumber; i++) {
            for (int j = 0; j < myNumber; j++) {
                cube=cube+myNumber;
            }
        }

        System.out.println("Cube of number " +myNumber+": "+cube);

    }
}