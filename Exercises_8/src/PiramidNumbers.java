import java.util.Scanner;

public class PiramidNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int count = 1;


        for (int row = 1; ; row++) {



            for (int col = 0; col < row; col++) {

                System.out.print(count + " ");

                count++;

                if (count == n+1){
                    break;}

            }

            System.out.println();

            if (count == n+1){
                break;}

        }

    }
}

