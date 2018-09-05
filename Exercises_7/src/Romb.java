import java.util.Scanner;

public class Romb {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer n= Integer.parseInt(in.nextLine());

        int spaceCount=n-1;
        int starscount=0;

        for (int r = 0; r < n; r++) {

            for (int s = 0; s < spaceCount; s++) {
                System.out.print(" ");

                
            }
            System.out.print("*");

            for (starscount = 0; starscount < r; starscount++) {
                System.out.print(" *");

            }
            spaceCount--;
            System.out.println();

        }


        spaceCount=1;
        starscount= starscount-1;

        for (int r = 0; r < n-1; r++) {

            for (int s = 0; s < spaceCount; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < starscount; s++) {
                System.out.print("* ");
            }

            System.out.println("*");
            spaceCount++;
            starscount-=1;

        }



    }
}
