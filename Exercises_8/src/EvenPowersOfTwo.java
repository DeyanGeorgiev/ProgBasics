import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i+=2) {

            System.out.println(num);

            num*=4;




        }
    }
}
