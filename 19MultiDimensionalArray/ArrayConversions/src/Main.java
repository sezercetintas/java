import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] numbers = {{5, 4}, {2, 3, 2}};


        //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim

        int toplamElamanSayisi=0;
        for(int[] w:numbers) {
            toplamElamanSayisi=toplamElamanSayisi+w.length;
        }

        System.out.println("toplamElamanSayisi = " + toplamElamanSayisi);







        //2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim

         int[] newArr= new int[toplamElamanSayisi];
        // System.out.println(Arrays.toString(newArr));


        //3.adim: Iki boyutlu Array’deki elemanlari tek boyutlu Array’e transfer edelim

        int idx = 0;

        for (int[] w : numbers){
            for (int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}

//Create ArrayConversions