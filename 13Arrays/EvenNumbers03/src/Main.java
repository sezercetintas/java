public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55};

        for (int i = 0; i < numbers.length; i++) {

            System.out.print((numbers[i] % 2 == 0)?(numbers[i] + " "):(" "));

        }


    }
}