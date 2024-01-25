public class PriceReader {
    public static void main(String[] args) {
        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice); //1332.98
    }
}
