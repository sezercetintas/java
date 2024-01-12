public class Main {
    public static void main(String[] args) {

        int[] numbers={13,34,56,76,23,12,64};

        for ( int number: numbers) {
        boolean isPrime=true;

            for (int i = 2; i <number ; i++) {
                if (number % i==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number + "IS PRIME!");
            }
        }


    }
}