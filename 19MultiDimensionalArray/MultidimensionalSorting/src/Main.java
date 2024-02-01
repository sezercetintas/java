 public class Main {
    public static void main(String[] args) {


        int[][] ages = {{15, 4}, {12, 43, 21}}; //==> 4 + 43 = 47

        int enKucuk = ages[0][0]; //15
        int enBuyuk = ages[0][0]; //15

        for (int[] w : ages){
            for (int k : w){
                enKucuk = Math.min(enKucuk, k);
                enBuyuk = Math.max(enBuyuk, k);
            }
        }
        System.out.println(enKucuk); //4
        System.out.println(enBuyuk); //43
        System.out.println(enBuyuk + enKucuk); //47

        }
    }
