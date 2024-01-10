public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;

        while (i < numbers.length) {
            numbers[i] *= 2;
            i++;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}