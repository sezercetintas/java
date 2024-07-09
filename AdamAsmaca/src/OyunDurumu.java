public class OyunDurumu {
    private char[] tahminler;
    private int kalanHak;
    private int dogruTahminSayisi;

    public OyunDurumu(int kelimeUzunlugu) {
        tahminler = new char[kelimeUzunlugu];
        for (int i = 0; i < kelimeUzunlugu; i++) {
            tahminler[i] = '_';
        }
        kalanHak = 6;
        dogruTahminSayisi = 0;
    }

    public boolean harfTahminEt(char harf, String kelime) {
        boolean dogruTahmin = false;
        // Şu an false

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == harf) {
                tahminler[i] = harf;
                dogruTahmin = true;

                // true
                dogruTahminSayisi++;
            }
        }

        // artık true...


        if (!dogruTahmin) {
            // false == !'den dolayı true
            // true ==  !'den dolayı false
            kalanHak--;
        }

        return dogruTahmin;
    }

    public boolean oyunBittiMi() {
        return kalanHak <= 0 || dogruTahminSayisi == tahminler.length;
    }

    public boolean kazandinizMi() {
        return dogruTahminSayisi == tahminler.length;
    }

    public void durumGoster() {
        for (char harf : tahminler) {
            System.out.print(harf + " ");
        }
        System.out.println("\nKalan hak: " + kalanHak);
    }
}
