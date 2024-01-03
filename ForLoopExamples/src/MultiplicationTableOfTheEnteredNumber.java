import java.util.Scanner;

public class MultiplicationTableOfTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int myNumber=input.nextInt();
        for (int i = 1; i <=10 ; i++) {

                System.out.println(i + " X "+myNumber+" = "+(i*myNumber));

        }
    }
}
