import java.util.Scanner;

public class WithForLoop_SquareOfTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number to be Squared");
        int myNumber=input.nextInt();
        int temporary=0;
        for (int i = 0; i < myNumber; i++) {
            temporary = myNumber+temporary;
        }
        System.out.println("Square of the number "+myNumber +": " + temporary);

    }
}
