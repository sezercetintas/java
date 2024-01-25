public class StartsWithANDEndsWith {
    public static void main(String[] args) {
        String s = "Java is easy";
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); //true

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd); //true

    }
}
