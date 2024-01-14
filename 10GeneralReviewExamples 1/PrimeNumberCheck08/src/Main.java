import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean key = true;
        boolean prime = true;
        int counter = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        do {
            while (counter < number) {
                counter++;
                prime = (number % counter == 0 && counter != 1 && counter != number) ? false : prime;
            }
            System.out.println((prime) ? number + " is a Prime Number." : number + " is not a Prime Number.");
            key = false;

        } while (key);

    }
}

