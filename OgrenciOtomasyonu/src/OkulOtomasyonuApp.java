import java.util.Scanner;

public class OkulOtomasyonuApp {
    public static void main(String[] args) {
        Okul okul = new Okul();

        // Öğretmen ve öğrencileri ekleyelim
        Ogretmen ogretmen = new Ogretmen("ogretmen1", "sifre123", okul);
        okul.ogretmenEkle(ogretmen);

        Ogrenci ogrenci1 = new Ogrenci("ogrenci1", "sifre123", okul);
        Ogrenci ogrenci2 = new Ogrenci("ogrenci2", "sifre123", okul);
        okul.ogrenciEkle(ogrenci1);
        okul.ogrenciEkle(ogrenci2);

        // Öğrencilere dersler ekleyelim
        ogrenci1.dersEkle(new Ders("Matematik"));
        ogrenci1.dersEkle(new Ders("Türkçe"));
        ogrenci2.dersEkle(new Ders("Matematik"));
        ogrenci2.dersEkle(new Ders("Fizik"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Kullanıcı adı: ");
            String kullaniciAdi = scanner.nextLine();
            System.out.println("Şifre: ");
            String sifre = scanner.nextLine();

            boolean girisBasarili = false;

            for (Ogretmen ogretmen1 : okul.getOgretmenler()) {
                if (ogretmen1.getKullaniciAdi().equals(kullaniciAdi) && ogretmen1.getSifre().equals(sifre)) {
                    ogretmen1.menu();
                    girisBasarili = true;
                    break;
                }
            }

            if (!girisBasarili) {
                for (Ogrenci ogrenci : okul.getOgrenciler()) {
                    if (ogrenci.getKullaniciAdi().equals(kullaniciAdi) && ogrenci.getSifre().equals(sifre)) {
                        ogrenci.menu();
                        girisBasarili = true;
                        break;
                    }
                }
            }

            if (!girisBasarili) {
                System.out.println("Kullanıcı adı veya şifre yanlış. Lütfen tekrar deneyin.");
            }
        }
    }
}
