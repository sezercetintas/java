public class Mesaj {
    private String gonderen;
    private String icerik;

    public Mesaj(String gonderen, String icerik) {
        this.gonderen = gonderen;
        this.icerik = icerik;
    }

    @Override
    public String toString() {
        return "Gönderen: " + gonderen + "\nMesaj: " + icerik;
    }
}
