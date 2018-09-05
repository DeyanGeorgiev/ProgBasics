import java.util.Scanner;

public class cleverLili {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yearLili = Integer.parseInt(in.nextLine());
        double priceWashinMachine = Double.parseDouble(in.nextLine());
        int singlePriceToy = Integer.parseInt(in.nextLine());


        int toySell = 0;
        int moneySavings = 0;
        int momentMoney= 0;
        int cont = 0;




        for (int i = 1; i <= yearLili; i++) {

            if (i % 2 != 0) {
                toySell += singlePriceToy;

            } else {

                moneySavings += (momentMoney*10)+10;
                momentMoney++;

                cont++;

            }

        }


        int actualMoney = toySell + moneySavings-cont;


        double diff = Math.abs(priceWashinMachine - actualMoney);

        if (priceWashinMachine <= actualMoney) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}

