import java.util.Scanner;

public class DelenieBezOstatak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int devToTwo = 0;
        int devToThree = 0;
        int devToFour = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(in.nextLine());

            if (number % 4 == 0) {
                devToFour += 1;
            }
            if (number % 3 == 0) {
                devToThree += 1;
            }

            if (number % 2 == 0) {
                devToTwo += 1;
            }

        }


        double p1= (double)devToTwo/ (double)n*100.0;
        double p2= (double)devToThree/(double) n*100.0;
        double p3= (double) devToFour/ (double) n*100.0;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}