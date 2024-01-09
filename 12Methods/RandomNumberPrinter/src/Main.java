import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How many random numbers should be generated? ");
        int enteredNumber=input.nextInt();
        printRandomNumbers(enteredNumber);
    }

    public static void printRandomNumbers(int count) {
        Random random=new Random();
        System.out.println("Random Numbers: ");


        for (int i = 1; i <= count; i++) {
            int number= random.nextInt(100)+1;
            System.out.println(i+" ==> "+number);
        }



    }
}