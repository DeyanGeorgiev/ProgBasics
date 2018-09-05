import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b= Integer.parseInt(in.nextLine());

        int t = 0;

        while (b != 0){
            t = b;
            b = a % b;
            a = t;
        }


        System.out.println(a);
    }
}
