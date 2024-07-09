package kullaniciYonetimi;

public class Admin extends Kullanici {


    public Admin(String kullaniciAdi, String sifre) {
        super(kullaniciAdi, sifre,"Admin");


    }

    @Override
    public void rolYetkileri() {
        System.out.println("Admin Yetkileri :" +
                " -Ürün Yönetimi" +
                " -Kulanıcı Yönetimi" +
                " -Satış Yönetimi" +
                " -Rapor Ve Bildirim");

    }
}