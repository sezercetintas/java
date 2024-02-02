import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> a = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); //[J, a, v, a, v]

        List<Character> b = new ArrayList<>();

        for (Character w : a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b); //[J, a, v]



    }
}