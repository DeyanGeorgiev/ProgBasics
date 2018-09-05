import java.util.Scanner;

public class FinalConcurs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int broiTanciori= Integer.parseInt(in.nextLine());
        double broiTochki= Double.parseDouble(in.nextLine());
        String sezon= in.nextLine();
        String miasto = in.nextLine();

        double nagrada= 0;
        double razhodi= 0;

        if ( miasto.equals("Abroad")){

            nagrada= (broiTanciori* broiTochki)+ (broiTanciori*broiTochki)*0.5;

            if ( sezon.equals("summer")){

                razhodi= (nagrada*0.1);

            } else {

                razhodi= (nagrada*0.15);

            }

        } else if (miasto.equals("Bulgaria")){

            nagrada= broiTanciori* broiTochki;

            if ( sezon.equals("summer")){

                razhodi= (nagrada*0.05);

            } else {

                razhodi= (nagrada*0.08);

            }

        }

        double moneyLeft= nagrada- razhodi;


        double charity= moneyLeft*0.75;

        double left = moneyLeft- charity;

        double moneyPerDancer = left / broiTanciori;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);




    }
}
