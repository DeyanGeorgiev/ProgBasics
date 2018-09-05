import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double priceVacation= Double.parseDouble(in.nextLine());
        int qtyPuzzels= Integer.parseInt(in.nextLine());
        int qtyDolls= Integer.parseInt(in.nextLine());
        int qtyBears= Integer.parseInt(in.nextLine());
        int qtyMinions= Integer.parseInt(in.nextLine());
        int qtyTrucks= Integer.parseInt(in.nextLine());

        double totalValue= qtyPuzzels*2.60+ qtyDolls*3.00+ qtyBears*4.10+ qtyMinions*8.20+ qtyTrucks*2.00;

        int totalQtyToys= qtyBears+ qtyDolls+ qtyMinions+ qtyPuzzels+ qtyTrucks;

        double profit=0;

        if (totalQtyToys>= 50){
            double discount = totalValue*0.25;
            double discountTotalValue= totalValue- discount;

            double rent = discountTotalValue*0.1;

            profit = discountTotalValue- rent;

        }else{
            double rent = totalValue*0.1;
            profit = totalValue- rent;
        }

        if (profit >= priceVacation){
            double restMoney = profit- priceVacation;
            System.out.printf("Yes! %.2f lv left.", restMoney);
        } else{
            double needMoney = priceVacation- profit;
            System.out.printf("Not enough money! %.2f lv needed.", needMoney);
        }



    }
}
