import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean anahtar = true;
        boolean denetle = true;
        int sayac = 1;

        int number = 13;

        do {
            while (sayac < number) {
                sayac++;
                denetle = (number % sayac == 0) ? false : true;

                System.out.println((denetle == true) ? sayac + " Asal" : sayac + " Asal Değil");
            }

            anahtar = false;

        } while (anahtar);


    }
}

