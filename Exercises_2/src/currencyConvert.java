import java.util.Scanner;

public class currencyConvert {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        double number = Double.parseDouble(in.nextLine());
        String inputCurrency = in.nextLine();
        String outputCurrency= in.nextLine();

        double vUSD = 1.79549;
        double vEUR = 1.95583;
        double vGBP = 2.53405;
        double vBGN = 1.0;

        if (inputCurrency.equals("BGN")){
            if (outputCurrency.equals("USD")){
                System.out.printf ("%.2f",number / vUSD);
            } else if (outputCurrency.equals("EUR")){
                System.out.printf ("%.2f",number / vEUR);
            }else {
                System.out.printf ("%.2f",number / vGBP);
            }

    } else if (inputCurrency.equals("EUR")){
            if (outputCurrency.equals("USD")){
                System.out.printf ("%.2f",(number * vEUR)/vUSD);
            } else if (outputCurrency.equals("BGN")){
                System.out.printf ("%.2f",(number * vEUR)/ vBGN);
            }else {
                System.out.printf ("%.2f",(number * vEUR)/ vGBP);
            }

        } else if(inputCurrency.equals("USD")){
            if (outputCurrency.equals("EUR")){
                System.out.printf ("%.2f",(number * vUSD)/vEUR);
            } else if (outputCurrency.equals("BGN")){
                System.out.printf ("%.2f",(number * vUSD)/ vBGN);
            }else {
                System.out.printf ("%.2f",(number * vUSD)/ vGBP);
            }
        }else {
            if (outputCurrency.equals("EUR")){
                System.out.printf ("%.2f",(number * vGBP)/vEUR);
            } else if (outputCurrency.equals("BGN")){
                System.out.printf ("%.2f",(number * vGBP)/ vBGN);
            }else {
                System.out.printf ("%.2f",(number * vGBP)/ vUSD);
            }
        }
}}
