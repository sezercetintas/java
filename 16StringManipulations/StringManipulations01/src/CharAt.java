public class CharAt {
    public static void main(String[] args) {
        String s = "Java is easy";


        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11); //Static Code
        System.out.println(lastChar); //y

        char lastChar2 = s.charAt(s.length()-1); //Dynamic Code
        System.out.println(lastChar2);





    }
}
