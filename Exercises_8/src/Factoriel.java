import java.util.Scanner;

public class Factoriel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int fact = 1;

        do{
            fact= fact*n;
            n--;
        } while (n>1);
        System.out.println(fact);


    }
}
