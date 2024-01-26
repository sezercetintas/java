
public class Main {
    public static void main(String[] args) {



        //Integer Wrapper Class
        Integer number = Integer.valueOf(5);
        System.out.println(number);


        //Double Wrapper Class
        Double decimalNumber = Double.valueOf(3.14);
        System.out.println(decimalNumber);



        //Character Wrapper Class
        Character character = Character.valueOf('A');
        System.out.println(character);

        //Boolean Wrapper Class
        Boolean status = Boolean.valueOf(true);
        System.out.println(status);

        //Byte Wrapper Class
        Byte byteValue = Byte.valueOf((byte) 127);
        System.out.println(byteValue);

        //Short Wrapper Class
        Short shortNumber = Short.valueOf((short) 100);
        System.out.println(shortNumber);

        //Long Wrapper Class
        Long longNumber = Long.valueOf(100000L);
        System.out.println(longNumber);

        //Float Wrapper Class:
        Float floatNumber = Float.valueOf(2.5f);
        System.out.println(floatNumber);

        //Conversion from String to Integer:
        String numberString = "123";
        Integer integerNumber = Integer.valueOf(numberString);
        System.out.println(integerNumber);




    }
}