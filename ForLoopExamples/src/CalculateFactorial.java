import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        //Calculate the factorial of a user-input number.

        Scanner input= new Scanner(System.in);
        int myNumber=input.nextInt();
        int counter=1;

        for (int i = 1; i <=myNumber ; i++) {
         counter=counter*i;
        }
        System.out.println(myNumber+"! ==>" + counter);


    }


}
