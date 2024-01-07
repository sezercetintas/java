import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random r = new Random();
        int number = r.nextInt(100);
        Scanner read = new Scanner(System.in);

        System.out.println("**************************\n" +
                " Hello, this is a number guessing game. \n" +
                " It chooses a number between 0-100 and gives you 5 chances to guess the number." +
                "\n*********************");


        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".Enter Your Prediction: ");
            int tahmin = read.nextInt();

            if (tahmin == number) {
                System.out.println("Congratulations you won. The number was: " + number);
                break;

            } else {
                if (i < 5) {

                    if (tahmin > number) {
                        System.out.println("Down!, You Have " + (5 - i) + " Rights Left");

                    } else {
                        System.out.println("Up!,You Have " + (5 - i) + " , You Have ");
                    }
                }

            }


        }

        System.out.println("You lost, the number was: " + number);


    }
}