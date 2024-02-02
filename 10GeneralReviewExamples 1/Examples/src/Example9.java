public class Example9 {
    public static void main(String[] args) {
        int i = 758;

        int s = 0;


        do {


            s = s + i % 10;

            i = i / 10;


        } while (i != 0);


        System.out.println(s);
    }
}
