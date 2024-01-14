public class Main {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 0;

        System.out.print("Fibonacci First 10 terms: ");

        while (count < n) {

            String print= (count<9)?(firstTerm + ","):(firstTerm + "");
            System.out.print(print);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++;
        }
    }
}