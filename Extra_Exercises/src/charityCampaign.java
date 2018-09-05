import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class charityCampaign {

    public static void main(String[] args) throws IOException {

        BufferedReader in= new BufferedReader( new InputStreamReader(System.in));
        int numberDays= Integer.parseInt(in.readLine());
        int numberCookers= Integer.parseInt(in.readLine());
        int numberCakes= Integer.parseInt(in.readLine());
        int numberWaffles= Integer.parseInt(in.readLine());
        int numberPancakes= Integer.parseInt(in.readLine());

        double priceCakes= 45.0;
        double prciceWaffle= 5.80;
        double pricePancake= 3.20;



        double dailyValueCakes=  (double) numberCakes* priceCakes;
        double dailyValueWaffle= (double) numberWaffles* prciceWaffle;
        double dailyValuePancake= (double) numberPancakes* pricePancake;



        double totalValue= ((dailyValueCakes+ dailyValuePancake+ dailyValueWaffle)* numberCookers)* numberDays;
        double valueAftrExpenses= totalValue - (totalValue/8);

        System.out.printf("%.2f", valueAftrExpenses);


    }
}
