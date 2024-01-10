public class Main {
    public static void main(String[] args) {

        int[] numbers={34,46,85,11,33};
        int max=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max) {
                max=numbers[i];
            }
        }
        System.out.println("Max: " +max);
    }
}