import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean anahtar = true;
        boolean asal = true;
        int sayac = 1;

        int number = 13;



        do {
            while (sayac < number) {
                sayac++;
                if (number % sayac == 0 && sayac != 1 && sayac != number) {
                    asal = false;
                    break;
                }
            }

            System.out.println((asal) ? number + " Asal" : number + " Asal Değil");
            anahtar = false;

        } while (anahtar);


    }
}

