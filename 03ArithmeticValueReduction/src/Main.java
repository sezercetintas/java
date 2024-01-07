public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = ++number1;
        int number3 = number1--;

        System.out.println("Result : " + ((number1)+(--number2)+(number3++)));

        System.out.println("Sezer " + "Çetintaş");
        System.out.println(number1 + number2);
        System.out.println("Sezer " + (number1 + number2));

     
    }
}