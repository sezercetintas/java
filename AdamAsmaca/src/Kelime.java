import java.util.Random;

public class Kelime {
    private String[] kelimeler = {"programlama", "java", "nesne", "yazilim", "bilgisayar"};
    private String kelime;

    public Kelime() {
        Random random = new Random();
        kelime = kelimeler[random.nextInt(kelimeler.length)];
    }

    public String getKelime() {
        return kelime;
    }
}
