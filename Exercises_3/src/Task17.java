import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double priceVacant= Double.parseDouble(in.nextLine());
        int numPuzzel= Integer.parseInt(in.nextLine());
        int numDolls= Integer.parseInt(in.nextLine());
        int numBears= Integer.parseInt(in.nextLine());
        int numMinion= Integer.parseInt(in.nextLine());
        int numLorries= Integer.parseInt(in.nextLine());


        double profit = 0 ;
        double rent= 0;


        double pricePuzzel= 2.60;
        double priceDoll= 3.00;
        double priceBears= 4.10;
        double priceMinon= 8.20;
        double priceLorries= 2.00;


        double sum = (numPuzzel*pricePuzzel)+ (numDolls* priceDoll)+ (numBears* numBears)+ (numMinion*priceMinon)+ (numLorries*priceLorries);

        int totalNum= numBears+ numDolls+ numLorries+ numMinion+ numPuzzel;

        if (totalNum >= 50){

            double discount = 0.25 * sum;
            double endPrice = sum- discount;
            rent = 0.1 * endPrice;
             profit = endPrice- rent;

        } else {
            rent= 0.1 * sum;
            profit= sum- rent;
        }


        if( profit >= priceVacant){

            System.out.printf("Yes! %.2f lv left.", profit- priceVacant);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceVacant-profit);
        }




    }
}
