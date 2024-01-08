import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number= input.nextInt();
        int temporary=1;
        boolean key=true;
        int result=0;


        key=(number>0 )?true:false;


        do {

            temporary=(number<=1)?(temporary*=number):(temporary=number);
            number--;
        }
        while (true);

        System.out.println(number+"!: "+temporary);




    }
}