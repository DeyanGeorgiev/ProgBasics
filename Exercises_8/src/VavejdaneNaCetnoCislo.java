import java.util.*;

public class VavejdaneNaCetnoCislo {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;


        try {
            num = Integer.parseInt(in.nextLine());

        } catch (Exception e) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(in.nextLine());
        }

        while (num % 2 != 0) {

            System.out.println("The number is not even.");
            num = Integer.parseInt(in.nextLine());


        }
        System.out.println("Even number entered: "+ num);


    }
}
