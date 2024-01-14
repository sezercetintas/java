public class Main {
    public static void main(String[] args) {
        boolean key=true;
        int i=0;
        int result;
        int temporary=0;
        int others=0;
        String text;

        do {
            i++;
            key=(i>=50)?(key=false):(key=true);
            result=(i%5==0)?(temporary=i):(others=i);
            System.out.println((result == temporary) ? "=>"+temporary : others);

        }
        while (key);
    }
}