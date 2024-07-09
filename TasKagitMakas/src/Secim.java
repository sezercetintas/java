public enum Secim {
    TAS,
    KAGIT,
    MAKAS;

    public static Secim rastgeleSecim() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static Secim secimDeger(String secim) {
        switch (secim.toUpperCase()) {
            case "TAS":
                return TAS;
            case "KAGIT":
                return KAGIT;
            case "MAKAS":
                return MAKAS;
            default:
                return null;
        }
    }
}
