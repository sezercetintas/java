public class Ders {
    private String ad;
    private int sinav1;
    private int sinav2;
    private int sozlu;
    private double ortalama;

    public Ders(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setNotlar(int sinav1, int sinav2, int sozlu) {
        this.sinav1 = sinav1;
        this.sinav2 = sinav2;
        this.sozlu = sozlu;
        hesaplaOrtalama();
    }

    private void hesaplaOrtalama() {
        this.ortalama = (sinav1 + sinav2 + sozlu) / 3.0;
    }

    @Override
    public String toString() {
        return ad + " - 1. Sınav: " + sinav1 + ", 2. Sınav: " + sinav2 + ", Sözlü: " + sozlu + ", Ortalama: " + ortalama;
    }
}
