package kullaniciYonetimi;

public class Musteri extends Kullanici {

    public Musteri(String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre, "Musteri");
    }

    @Override
    public void rolYetkileri() {

        System.out.println("Musteri İslemleri " +
                "1-Urun Satin Alma" +
                "2-Urun İade " +
                "4- Bildirim Okuma" +
                "4- Sikayet Olusturma");
    }
}
