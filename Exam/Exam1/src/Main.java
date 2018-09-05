import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pricePrint = Double.parseDouble(in.nextLine());
        double priceKorica= Double.parseDouble(in.nextLine());
        int percentDiscount= Integer.parseInt(in.nextLine());
        double valueToPay= Double.parseDouble(in.nextLine());
        int percentTotalValue= Integer.parseInt(in.nextLine());

        double bookPrice= (pricePrint* 899.00)+ (priceKorica*2.00);
        double withDiscount= bookPrice* (1-(percentDiscount/100.0));

        double needToPay= withDiscount+ valueToPay;

        double total= needToPay* (1-percentTotalValue/100.0);

        System.out.printf("Avtonom should pay %.2f BGN.", total);


    }
}
