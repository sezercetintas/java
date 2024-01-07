public class ExampleTwo {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = new int(3);

        Boolean t = true;
        Boolean f = false;

        System.out.println(a == b); //TRUE
        System.out.println(a == c); //FALSE
        System.out.println(a.equals(b)); //TRUE
        System.out.println(a.equals(c)); //TRUE

        System.out.println(t == f);//FALSE
        System.out.println(t.equals(f));//FALSE
        System.out.println(t.equals(true));//TRUE
    }
}
