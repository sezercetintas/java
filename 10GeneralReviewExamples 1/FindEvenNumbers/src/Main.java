public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {

            String number= (i%2==0)?i+" Even number":i+" Odd number";

            System.out.println(number);

        }
    }
}