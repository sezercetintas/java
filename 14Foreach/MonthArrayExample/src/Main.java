import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        Scanner input=new Scanner(System.in);
        System.out.print("Which Month? : ");
        int month= input.nextInt();

        System.out.println(months[month-1]);

    }


}