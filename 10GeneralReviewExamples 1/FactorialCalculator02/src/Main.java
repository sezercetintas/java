import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Number: ");
        int number= input.nextInt();
        int temporary=1;
        boolean key=true;
        int result=0;

        key=(number>0 )?true:false;

        do {

            temporary=(number>=1)?(temporary*=number):(temporary=number);
            number--;
            if (number<=1) {
                key=false;
            }
        }
        while (key);

        System.out.println(number+"!: "+temporary);


    }
}