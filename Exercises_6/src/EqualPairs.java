import java.util.Scanner;

public class EqualPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());


        int firstNum = Integer.parseInt(in.nextLine());
        int secNum = Integer.parseInt(in.nextLine());

        int sumFirstPair = firstNum + secNum;
        int sumSecPair = 0;


        int diff = 0;
        int maxDiff = 0;

        int comparison= 0;


        for (int i = 0; i < n - 1; i++) {
            int firstPNum = Integer.parseInt(in.nextLine());
            int secPNum = Integer.parseInt(in.nextLine());

            sumSecPair = firstPNum + secPNum;

            if (sumFirstPair - sumSecPair == 0 ) {

                comparison= 0;
            } else {

                comparison=1;

                diff = sumFirstPair - sumSecPair;
                maxDiff = maxDiff+ diff;

                if (maxDiff > diff) {
                    diff = 0;
                }
            }

            sumFirstPair = sumSecPair;

        }


        if ( comparison== 0  ){
            System.out.println("Yes, value="+ sumFirstPair);
        }else{
        System.out.println("No, maxdiff="+ Math.abs(diff));}


    }
}
