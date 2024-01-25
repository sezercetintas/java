public class Split {
    public static void main(String[] args) {

        String name = "   ali kERem   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(last); //K

        System.out.println("" + first + last); //AK

    }
}
