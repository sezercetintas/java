import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]

        for (String w : r){
            if (w.contains("a")){
                r.remove(w);
            }
        }
        System.out.println(r);


    }
}