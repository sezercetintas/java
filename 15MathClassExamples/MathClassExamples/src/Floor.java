import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate the floor value: ");
        double floorInput = scanner.nextDouble();
        double floorResult = Math.floor(floorInput);
        System.out.println("Floor Value: " + floorResult);

    }
}
