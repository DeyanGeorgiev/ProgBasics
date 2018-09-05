import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alcoMarket {

    public static void main(String[] args) throws IOException {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

        double priceUiski= Double.parseDouble(in.readLine());
        double qtyBeer= Double.parseDouble(in.readLine());
        double qtyVino= Double.parseDouble(in.readLine());
        double qtyRakiq= Double.parseDouble(in.readLine());
        double qtyUiski= Double.parseDouble(in.readLine());

        double priceRakiq= (1.0/2.0)* priceUiski;
        double priceVino= priceRakiq- (0.4* priceRakiq);
        double priceBeer= priceRakiq- (0.8* priceRakiq);

        double valueUiski= priceUiski* qtyUiski;
        double valueBeer= priceBeer* qtyBeer;
        double valueRakiq= priceRakiq* qtyRakiq;
        double valueVino= priceVino* qtyVino;

        double totalPrice= valueBeer+ valueRakiq+ valueUiski+ valueVino;

        System.out.printf("%.2f", totalPrice);






    }
}
