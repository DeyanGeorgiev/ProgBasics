import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = Integer.parseInt(in.nextLine());


        int fib0= 1;
        int fib1=1;

        int sum= fib0+ fib1;

        if ( n == 1 || n == 0){
            System.out.println("1");
        } else {


        while (n>2){

            fib0= fib1;
            fib1=sum;
            sum= fib1+fib0;

            n--;

        }

        System.out.println(sum);}






    }
}
