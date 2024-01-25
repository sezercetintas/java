public class ReplaceAll {
    public static void main(String[] args) {

        //example01
        String s = "learn Java earn 1234 money";

        String s3 = s.replaceAll("[0-9]", "*");
        System.out.println(s3); //learn Java earn **** money

        //example02

        int num = s.replaceAll("[^0-9]", "").length();
        System.out.println(num); //4
    }
}
