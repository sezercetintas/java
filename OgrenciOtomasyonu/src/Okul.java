import java.util.ArrayList;
import java.util.List;

public class Okul {
    private List<Ogretmen> ogretmenler;
    private List<Ogrenci> ogrenciler;
    private List<Mesaj> mesajlar;

    public Okul() {
        this.ogretmenler = new ArrayList<>();
        this.ogrenciler = new ArrayList<>();
        this.mesajlar = new ArrayList<>();
    }

    public List<Ogretmen> getOgretmenler() {
        return ogretmenler;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public List<Mesaj> getMesajlar() {
        return mesajlar;
    }

    public void ogretmenEkle(Ogretmen ogretmen) {
        ogretmenler.add(ogretmen);
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }

    public void mesajEkle(Mesaj mesaj) {
        mesajlar.add(mesaj);
    }
}
