import java.util.Scanner;

public class TheMultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {


                if ((i*j)<10)
                {
                    System.out.print(i+" X "+j+" = "+(i*j) +"   |   ");
                }
                else if (j == 10 ) {
                    System.out.println("");
                } else if (i==10) {
                    System.out.print(i+" X "+j+" = "+(i*j) +" |   ");
                } else {

                    System.out.print(i+" X "+j+" = "+(i*j) +"  |   ");
                }


            }
        }

    }
}
