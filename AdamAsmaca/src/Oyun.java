import java.util.Scanner;

public class Oyun {
    private Kelime kelime;
    private OyunDurumu durum;

    public Oyun() {
        kelime = new Kelime();
        durum = new OyunDurumu(kelime.getKelime().length());
    }

    public void baslat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adam Asmaca Oyununa Hoşgeldiniz!");

        while (!durum.oyunBittiMi()) {
            durum.durumGoster();
            System.out.print("Harf giriniz: ");
            char harf = scanner.next().charAt(0);
            if (!durum.harfTahminEt(harf, kelime.getKelime())) {
                System.out.println("Yanlış tahmin!");
            }
        }

        if (durum.kazandinizMi()) {
            System.out.println("Tebrikler, kazandınız!");
        } else {
            System.out.println("Maalesef kaybettiniz. Kelime: " + kelime.getKelime());
        }
    }

    public static void main(String[] args) {
        Oyun oyun = new Oyun();
        oyun.baslat();
    }
}
