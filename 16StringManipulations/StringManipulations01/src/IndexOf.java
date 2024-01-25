public class IndexOf {
    public static void main(String[] args) {

        String a = "abc@gmail.com";

        int startingIndex = a.indexOf("@") + 1; //4
        int endingIndex = a.indexOf("."); //9

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName);
    }
}
