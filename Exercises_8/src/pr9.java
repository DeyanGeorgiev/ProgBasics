import java.util.Scanner;

public class pr9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());


        int sum = 0;

        while (n>0){

            sum = sum + ( n % 10);
            n= n/ 10;




        }

        System.out.println(sum);
    }
}
