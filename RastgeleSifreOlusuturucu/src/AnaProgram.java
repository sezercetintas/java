

import java.util.Scanner;

public class AnaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifre uzunluğunu giriniz:");
        int uzunluk = scanner.nextInt();

        System.out.println("Büyük harf kullanılsın mı? (true/false):");
        boolean buyukHarf = scanner.nextBoolean();

        System.out.println("Küçük harf kullanılsın mı? (true/false):");
        boolean kucukHarf = scanner.nextBoolean();

        System.out.println("Rakam kullanılsın mı? (true/false):");
        boolean rakam = scanner.nextBoolean();

        System.out.println("Özel karakter kullanılsın mı? (true/false):");
        boolean ozelKarakter = scanner.nextBoolean();

        SifreAyarlar ayarlar = new SifreAyarlar(uzunluk, buyukHarf, kucukHarf, rakam, ozelKarakter);
        SifreOlusturucu olusturucu = new SifreOlusturucu();

        String rastgeleSifre = olusturucu.sifreOlustur(ayarlar);
        System.out.println("Oluşturulan şifre: " + rastgeleSifre);

        scanner.close();
    }
}
