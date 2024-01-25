public class Substring {
    public static void main(String[] args) {
        String s = "Java is easy";

        String sub1 = s.substring(0, 4);
        System.out.println(sub1); //Java

        String sub2 = s.substring(5, 7);
        System.out.println(sub2); //is

        String sub3 = s.substring(8, 12);
        System.out.println(sub3); //easy

        //example1
        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9)); //gmail

    }
}
