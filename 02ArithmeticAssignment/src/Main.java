public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int result = 0;
        result += number1; // result = result + number1; result = 10
        System.out.println("Result : " + result);

        result -= number2; // result = result - number2; result = -10
        System.out.println("Result : " + result);

        result *= number1; // result = result * number1; result = -100
        System.out.println("Result : " + result);

        result /= number2; // result = result / number2; result = -5
        System.out.println("Result : " + result);


        //Example 1
        double decimalNumber=6.50;
        double exampleResult = 0;


        exampleResult++;
        decimalNumber *= exampleResult;

        System.out.println("Result : " + decimalNumber);

        //Example 2
        int number3 = 10;
        int number4 = 6;

        number3++;
        --number4;

        number3 *= --number4;

        System.out.println("Last value of Number 3: " + number3);
        System.out.println("Last value of Number 4: " + number4);
    }
}