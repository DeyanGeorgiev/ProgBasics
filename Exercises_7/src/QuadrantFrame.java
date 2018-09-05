import java.util.Scanner;

public class QuadrantFrame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());


        //1

        System.out.print("+");

        for (int r = 0; r < n-2 ; r++) {

            System.out.print(" -");
        }

        System.out.println(" +");

        //2

        for (int r = 0; r < n-2 ; r++) {


            System.out.print("|");

            for (int c = 0; c < n - 2; c++) {
                System.out.print(" -");

            }

            System.out.println(" |");

        }


        //3

        System.out.print("+");

        for (int r = 0; r < n-2 ; r++) {

            System.out.print(" -");
        }

        System.out.print(" +");

    }
}
