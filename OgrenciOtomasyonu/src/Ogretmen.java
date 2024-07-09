import java.util.List;
import java.util.Scanner;

public class Ogretmen extends Kullanici {
    private Okul okul;

    public Ogretmen(String kullaniciAdi, String sifre, Okul okul) {
        super(kullaniciAdi, sifre);
        this.okul = okul; // Almadın
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Öğrenci Seç");
            System.out.println("2. Mesajları Görüntüle");
            System.out.println("3. Çıkış");
            int secim = scanner.nextInt();
            scanner.nextLine();  // yeni satır karakterini temizle

            switch (secim) {
                case 1:
                    ogrenciSec();
                    break;
                case 2:
                    mesajlariGoruntule();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private void ogrenciSec() {
        Scanner scanner = new Scanner(System.in); // Burda kalsın

        System.out.println("Öğrenciler:");
        List<Ogrenci> ogrenciler = okul.getOgrenciler();
        for (int i = 0; i < ogrenciler.size(); i++) {
            System.out.println((i + 1) + ". " + ogrenciler.get(i).getKullaniciAdi());
        }
        System.out.print("Öğrenci seçin: ");
        int secim = scanner.nextInt();
        scanner.nextLine();  // yeni satır karakterini temizle

        if (secim > 0 && secim <= ogrenciler.size()) {
            Ogrenci secilenOgrenci = ogrenciler.get(secim - 1);
            dersSec(secilenOgrenci);
        } else {
            System.out.println("Geçersiz seçim.");
        }
    }

    private void dersSec(Ogrenci ogrenci) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dersler:");
        List<Ders> dersler = ogrenci.getDersler();
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println((i + 1) + ". " + dersler.get(i).getAd());
        }
        System.out.print("Ders seçin: ");
        int secim = scanner.nextInt();
        scanner.nextLine();  // yeni satır karakterini temizle

        if (secim > 0 && secim <= dersler.size()) {
            Ders secilenDers = dersler.get(secim - 1);
            notGir(secilenDers);
        } else {
            System.out.println("Geçersiz seçim.");
        }
    }

    private void notGir(Ders ders) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sınav notunu girin: ");
        int sinav1 = scanner.nextInt();
        System.out.print("2. Sınav notunu girin: ");
        int sinav2 = scanner.nextInt();
        System.out.print("Sözlü notunu girin: ");
        int sozlu = scanner.nextInt();

        ders.setNotlar(sinav1, sinav2, sozlu);
        System.out.println("Notlar başarıyla girildi.");
    }

    private void mesajlariGoruntule() {
        List<Mesaj> mesajlar = okul.getMesajlar();
        if (mesajlar.isEmpty()) {
            System.out.println("Görüntülenecek mesaj yok.");
        } else {
            for (Mesaj mesaj : mesajlar) {
                System.out.println(mesaj);
            }
        }
    }
}
