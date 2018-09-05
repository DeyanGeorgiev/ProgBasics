import java.util.Scanner;

public class SymbolCombination {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int conuntNum= Integer.parseInt(in.nextLine());

        int sumDigit=0;
        int upperCase=0;
        int lowCase=0;
        int other= 0;

        int maxSum=0;

        String digit= "";
        String max="";

        for (int i = 0; i < conuntNum; i++) {

            char symbol= in.nextLine().charAt(0);

            if (symbol>=48 && symbol<=57){
                sumDigit += symbol;
                digit+=symbol;


                if (maxSum<= sumDigit){
                    maxSum= sumDigit;
                    max= digit;
                }
            } else if( symbol>=65 && symbol<= 90){
                upperCase+=symbol;
                if (maxSum<= upperCase){
                    maxSum= upperCase;
                }
            } else if ( symbol>=97 && symbol<= 122){
                lowCase+= symbol;
                if (maxSum<= lowCase){
                    maxSum= lowCase;
                }
            } else {
                other+=symbol;
                if (maxSum<= other){
                    maxSum= other;
                }
            }

            System.out.println("Biggest ASCII sum is:"+maxSum);

        }


    }
}
