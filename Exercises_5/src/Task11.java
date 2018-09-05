import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num = Double.parseDouble(in.nextLine());


        double OddSum = 0;
        double OddMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenSum = 0;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        for (int i = 1; i <= num; i++) {

            double countNum = Double.parseDouble(in.nextLine());

            // find odd num or even
            if (i % 2 != 0) {
                OddSum += countNum;

                if (OddMax < countNum) {
                    OddMax = countNum;
                }
                if (OddMin > countNum) {
                    OddMin = countNum;
                }


            } else {
                EvenSum += countNum;

                if (EvenMax < countNum) {
                    EvenMax = countNum;
                }
                if (EvenMin > countNum) {
                    EvenMin = countNum;
                }
            }


        }

        NumberFormat df = new DecimalFormat("#.##");

        if (EvenSum==0|| OddSum==0){

            System.out.printf("OddSum= %s,%n", df.format(OddSum));
            System.out.print("OddMin= No,");
            System.out.print("OddMax= No,");
            System.out.printf("EvenSum= %s,%n", df.format(EvenSum));
            System.out.println("EvenMin= No,");
            System.out.println("EvenMax= No");



        } else if (EvenSum==0) {

            System.out.printf("OddSum= %s,%n", df.format(OddSum));
            System.out.printf("OddMin= %s,%n", df.format(OddMin));
            System.out.printf("OddMax= %s,%n", df.format(OddMax));
            System.out.printf("EvenSum= %s,%n", df.format(EvenSum));
            System.out.println("EvenMin= No,");
            System.out.println("EvenMax= No");


        } else if (OddSum==0) {

            System.out.printf("OddSum= %s,%n", df.format(OddSum));
            System.out.println("OddMin= No");
            System.out.println("OddMax= No");
            System.out.printf("EvenSum= %s,%n", df.format(EvenSum));
            System.out.printf("EvenMin= %s,%n", df.format(EvenMin));
            System.out.printf("EvenMax= %s", df.format(EvenMax));

        }else{

            System.out.printf("OddSum= %s,%n ", df.format(OddSum));
            System.out.printf("OddMin= %s,%n", df.format(OddMin));
            System.out.printf("OddMax= %s,%n", df.format(OddMax));
            System.out.printf("EvenSum= %s,%n", df.format(EvenSum));
            System.out.printf("EvenMin= %s,%n", df.format(EvenMin));
            System.out.printf("EvenMax= %s", df.format(EvenMax));


        }
    }
}
