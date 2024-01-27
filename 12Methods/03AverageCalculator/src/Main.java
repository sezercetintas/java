import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double myNumber1=input.nextDouble();
        System.out.print("Enter the second number:  ");
        double myNumber2=input.nextDouble();
        System.out.print("Enter the third number:  ");
        double myNumber3=input.nextDouble();

        calculateAverage(myNumber1,myNumber2,myNumber3);

    }

    public static void calculateAverage( Double number1, Double number2,Double number3) {

//        double result=(number1+number2+number3)/3;
//        System.out.println("Average of entered numbers: " + ((result % 1 == 0) ? (int) result : result));

        BigDecimal result = BigDecimal.valueOf((number1 + number2 + number3) / 3);
        System.out.println("Average of entered numbers: " + ((result.scale() <= 0) ? result.intValue() : result));

    }
}