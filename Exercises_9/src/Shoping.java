import java.util.Scanner;

public class Shoping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget= Double.parseDouble(in.nextLine());
        int numChoko= Integer.parseInt(in.nextLine());
        double qtyMilk= Double.parseDouble(in.nextLine());

        double qtyMandarinas= Math.floor(numChoko- (numChoko*0.35));

        double priceChoko= numChoko*0.65;
        double priceMilk= qtyMilk*2.70;
        double priceMandarina= qtyMandarinas*0.20;

        double totalPrice= priceChoko+ priceMandarina+ priceMilk;

        double diff = Math.abs(totalPrice-budget);

        if( budget>= totalPrice){

            System.out.printf("You got this, %.2f money left!", diff);

        } else{
            System.out.printf("Not enough money, you need %.2f more!", diff);
    }
}}
