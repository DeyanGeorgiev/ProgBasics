import java.util.Scanner;

public class fabric {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int number_Desks= Integer.parseInt(in.nextLine());
        double l_Desks_Meters= Double.parseDouble(in.nextLine());
        double w_Desks_Meters= Double.parseDouble(in.nextLine());

        double total_Area_Covers= (double) number_Desks* (l_Desks_Meters+ 2*0.3)* (w_Desks_Meters+ 2*0.3);
        double total_Area_Coach= (double) number_Desks* (l_Desks_Meters/ 2)* (l_Desks_Meters/ 2);

        double priceCoverM= 7.0;
        double priceCoachM= 9.0;

        double priceInUsd= total_Area_Covers* priceCoverM + total_Area_Coach* priceCoachM;
        double priceInBgn= priceInUsd* 1.85;

        System.out.printf("%.2f", priceInUsd);
        System.out.println(" USD");
        System.out.printf("%.2f", priceInBgn);
        System.out.println(" BGN");




    }
}
