public class ReplaceAll {
    public static void main(String[] args) {

        String s = "learn Java earn 1234 money";

        String s3 = s.replaceAll("[0-9]", "*");
        System.out.println(s3); //learn Java earn **** money

        
    }
}
