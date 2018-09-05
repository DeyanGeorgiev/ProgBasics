import java.util.Scanner;

public class Futbol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kapacitet = Integer.parseInt(in.nextLine());
        int broiFenove= Integer.parseInt(in.nextLine());

        double counA= 0.0;
        double countB=0.0;
        double countV= 0.0;
        double countG= 0.0;

        for (int i = 0; i < broiFenove ; i++) {

            String sector= in.nextLine().toUpperCase();

            switch (sector){

                case "A":
                    counA++;
                    break;
                case "B":
                    countB++;

                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
            }


        }





        double percentA= (counA/ broiFenove)*100.0;
        double percentB= (countB/ broiFenove)*100.0;
        double percentV= (countV/ broiFenove)*100.0;
        double percentG= (countG/ broiFenove)*100.0;
        double kapacit = (broiFenove*1.0/kapacitet*1.0)*100.0;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", kapacit);

    }
}
