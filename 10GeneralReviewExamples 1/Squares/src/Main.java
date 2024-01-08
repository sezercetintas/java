public class Main {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Squares of numbers between 1 and 50 (Included):");

        do {
            int square = number * number;
            System.out.println("( " + number + "²): " + square);
            number++;
        } while (number <= 50);
    }
}