import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean key=true;
        int sayac=2;
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int gecici1=0;
        int gecici2=0;

        do {
            sayac++;
            while (sayac>number){
                key=(number%sayac==0)?(key=true):(key=false);

            }
            System.out.println((key==false)?"Asal":"Asal Değil");

        }
        while (key);


    }
}