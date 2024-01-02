public class Main {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 11;

        System.out.println("Sayı 1 eşit mi Sayi 2 " + (number1==number2));
        System.out.println("Sayı 1 küçük mü Sayi 2 " + (number1 < number2));
        System.out.println("Sayı 1 büyük mü Sayi 2 " + (number1 > number2));
        System.out.println("Sayı 1 küçük eşit Sayi 2 " + (number1 <= number2));
        System.out.println("Sayı 1 büyük eşit Sayi 2 " + (number1 >= number2));
        System.out.println("Sayı 1 eşit değil mi 2 " + (number1 != number2));


        if(number1 < number2){

            System.out.println("number1 is greater than number2");

        }else {
            System.out.println("number1 is greater than number2");
        }

        boolean value1 = true;
        boolean value2 = false;

        System.out.println("value1 and value2 and case: " + (value1 && value2));
        System.out.println("value1 and value2 or (or) status : " + (value1 || value2));

        int myAge=30;
        int hisAge = 25 ;

        if(myAge < 40 && hisAge > 20){

            System.out.println("First statement worked");

        }

        if(myAge < 25 || hisAge> 25){

            System.out.println("Second statement worked");
        }else{
            System.out.println("The other part of the second statement worked");
        }
    }
}