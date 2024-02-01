import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi

        ArrayList<Integer> ages = new ArrayList<>(); //Java 7 ve sonrasi - type inference - tip cikarimi

        ages.add(9);
        ages.add(12);
        ages.add(5);



        ages.add(1,28);
        System.out.println(ages);
    }
}