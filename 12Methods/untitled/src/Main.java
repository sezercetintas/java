import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the triangle sides:");

        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Calling the method to determine the type of triangle
        String triangleType = determineTriangleType(side1, side2, side3);

        // Displaying the result
        System.out.println("This is a " + triangleType + " triangle.");


    }

    public static String determineTriangleType(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "invalid"; 
        } else if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "equilateral";
            } else if (a == b || a == c || b == c) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "invalid";
        }


     }
    }