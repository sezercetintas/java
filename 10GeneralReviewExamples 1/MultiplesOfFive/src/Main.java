public class Main {
    public static void main(String[] args) {
        boolean key=true;
        int i=0;
        int result;
        int temporary;

        do {
            i++;
            key=(i>=50)?(key=false):(key=true);
            result=(i%5==0)?(result=i):(temporary=i);

            System.out.println(result);




        }
        while (true);
    }
}