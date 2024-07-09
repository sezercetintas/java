

import java.security.SecureRandom;

public class SifreOlusturucu {
    private static final String BUYUK_HARFLER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KUCUK_HARFLER = "abcdefghijklmnopqrstuvwxyz";
    private static final String RAKAMLAR = "0123456789";
    private static final String OZEL_KARAKTERLER = "!@#$%^&*()-_=+<>?";

    private SecureRandom secureRandom = new SecureRandom();

    public String sifreOlustur(SifreAyarlar ayarlar) {
        StringBuilder karakterHavuzu = new StringBuilder();
        if (ayarlar.isBuyukHarf()) {
            karakterHavuzu.append(BUYUK_HARFLER);
        }
        if (ayarlar.isKucukHarf()) {
            karakterHavuzu.append(KUCUK_HARFLER);
        }
        if (ayarlar.isRakam()) {
            karakterHavuzu.append(RAKAMLAR);
        }
        if (ayarlar.isOzelKarakter()) {
            karakterHavuzu.append(OZEL_KARAKTERLER);
        }

        if (karakterHavuzu.length() == 0) {
            throw new IllegalArgumentException("En az bir karakter türü seçilmelidir!");
        }

        StringBuilder sifre = new StringBuilder(ayarlar.getUzunluk());
        for (int i = 0; i < ayarlar.getUzunluk(); i++) {
            int index = secureRandom.nextInt(karakterHavuzu.length());
            sifre.append(karakterHavuzu.charAt(index));
        }

        return sifre.toString();
    }
}
