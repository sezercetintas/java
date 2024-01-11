import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();

        double sphereVolume = calculateSphereVolume(sphereRadius);
        System.out.println("Volume of the sphere: " + sphereVolume);
    }


    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}