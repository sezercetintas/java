public class Replace {
    public static void main(String[] args) {

        String s = "learn Java earn 1234 money";

        String s1 = s.replace("money", "dollar");
        System.out.println(s1); //learn Java earn dollar

        String s2 = s.replace("e", ""); //""
        System.out.println(s2); //larn Java arn mony

        

    }
}
