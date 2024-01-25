//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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