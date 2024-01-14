import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sum=0;
        int counter=0;



        Scanner read =new Scanner(System.in);
        System.out.println("Enter Upper Value");
        int number= read.nextInt();

        for (int i = 0; i <number ; i++) {

            counter++;
            sum=sum+counter;

            }

        System.out.println("Sum of Numbers" +sum);



    }

}