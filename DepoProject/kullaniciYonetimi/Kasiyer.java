package kullaniciYonetimi;

public class Kasiyer extends Kullanici {


    public Kasiyer(String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre, "Kasiyer");
    }

    @Override
    public void rolYetkileri() {
        System.out.println("Kasiyer Yetkileri" +
                " -Satış Yönetimi" +
                " -Rapor Ve Analiz");
    }
}