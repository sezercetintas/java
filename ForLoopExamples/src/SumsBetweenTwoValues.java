import java.util.Scanner;

public class SumsBetweenTwoValues {

    public static void main(String[] args) {
        //Total sum between two values coming from the user

        Scanner input= new Scanner(System.in);
        System.out.println("Starting Value ");
        int initialValue=input.nextInt()+1;
        System.out.println("End Value");
        int finalValue=input.nextInt();
        int total=0;
        for (int i = initialValue; i < finalValue; i++) {
            System.out.println(i);
            total=total+i;

        }
        System.out.println("Sum of Numbers Between X and Y: " + total);
    }
}
