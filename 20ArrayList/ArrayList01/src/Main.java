import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi

        ArrayList<Integer> ages = new ArrayList<>(); //Java 7 ve sonrasi - type inference - tip cikarimi

        ages.add(9);
        ages.add(12);
        ages.add(5);



        ages.add(1,28); //[9, 28, 12, 5]
        System.out.println(ages);

        ages.add(3,7);//[9, 28, 12, 7, 5]
        System.out.println(ages);

        ages.add(11);//[9, 28, 12, 7, 5, 11]
        System.out.println(ages);

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);


        ages.addAll(newAges);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11, 1, 2, 3]
        System.out.println(newAges); //[1, 2, 3]

        ages.addAll(0, newAges);
        System.out.println(ages); //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

    }
}