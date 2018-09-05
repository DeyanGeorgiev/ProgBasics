import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {


        boolean isPrime = true;

        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());


        if ( num>1) {


            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }


            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        } else {

        System.out.println("Not prime");}





    }
}
