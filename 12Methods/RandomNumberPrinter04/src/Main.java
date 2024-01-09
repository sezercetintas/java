import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random sayı ekrana kaç defa yazılsın? ");
        Scanner input=new Scanner();
        printRandomNumbers(5);
    }

    public static void printRandomNumbers(int count) {
        Random random=new Random();
        System.out.print("Random Numbers: ");
        int number= random.nextInt(100)+1;

        for (int i = 0; i < count; i++) {

        }



    }
}