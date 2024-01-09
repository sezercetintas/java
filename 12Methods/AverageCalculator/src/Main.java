import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int myNumber1=input.nextInt();
        System.out.print("Enter the second number:  ");
        int myNumber3=input.nextInt();
        System.out.print("Enter the third number:  ");
        int myNumber2=input.nextInt();

        calculateAverage(myNumber1,myNumber2,myNumber3);

    }

    public static void calculateAverage(int number1, int number2,int number3) {
    double result=(number1+number2+number3)/3;
        System.out.println("Average of entered numbers: " +result);
        

    }
}