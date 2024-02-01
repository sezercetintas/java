import java.util.Arrays;

  public class Main {
    public static void main(String[] args) {
        int[][] a = new int[3][2]; //3 distaki, 2 icteki eleman sayisi
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 5;


        System.out.println(Arrays.deepToString(a));

        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};
        System.out.println(Arrays.deepToString(students));

        //Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int toplam=0;

        for (String[] w:students) {
        toplam = toplam+w.length;
        }
        System.out.println(students.length);

        //Ornek 2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz
        for (String[] w : students){
            for (String k : w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

    }
}

//Update MultiDimensionalArray
//Example1 MultiDimensionalArray