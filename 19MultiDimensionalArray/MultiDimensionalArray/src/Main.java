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





    }
}

//Update MultiDimensionalArray