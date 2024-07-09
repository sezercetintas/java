import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci extends Kullanici {
    private List<Ders> dersler;
    private Okul okul;

    public Ogrenci(String kullaniciAdi, String sifre, Okul okul) {
        super(kullaniciAdi, sifre);
        this.okul = okul;
        this.dersler = new ArrayList<>();
    }

    public List<Ders> getDersler() {
        return dersler;
    }

    public void dersEkle(Ders ders) {
        dersler.add(ders);
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Ders Seç ve Notları Görüntüle");
            System.out.println("2. Öğretmene Mesaj Gönder");
            System.out.println("3. Çıkış");
            int secim = scanner.nextInt();
            scanner.nextLine();  // yeni satır karakterini temizle

            switch (secim) {
                case 1:
                    dersSecVeNotGor();
                    break;
                case 2:
                    mesajGonder();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private void dersSecVeNotGor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dersler:");
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println((i + 1) + ". " + dersler.get(i).getAd());//BURAYI KOYMADIN
        }
        System.out.print("Ders seçin: ");
        int secim = scanner.nextInt();
        scanner.nextLine();  // yeni satır karakterini temizle

        if (secim > 0 && secim <= dersler.size()) {
            Ders secilenDers = dersler.get(secim - 1);
            System.out.println(secilenDers);
        } else {
            System.out.println("Geçersiz seçim.");
        }
    }

    private void mesajGonder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesajınızı girin: ");
        String mesajMetni = scanner.nextLine();
        Mesaj mesaj = new Mesaj(getKullaniciAdi(), mesajMetni);
        okul.mesajEkle(mesaj);
        System.out.println("Mesaj başarıyla gönderildi.");
    }
}
