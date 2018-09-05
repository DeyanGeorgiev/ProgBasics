import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String gender= in.nextLine();
        double weight = Double.parseDouble(in.nextLine());
        double hight = Double.parseDouble(in.nextLine());
        int old= Integer.parseInt(in.nextLine());
        String levelFisicalConditions= in.nextLine();


        double coef= 0;

        if ( levelFisicalConditions.equals("sedentary")){
            coef= 1.20;
        } else if (levelFisicalConditions.equals("lightly active")){
            coef= 1.375;
        } else if (levelFisicalConditions.equals("moderately active")){
            coef= 1.55;
        } else if ( levelFisicalConditions.equals("very active")){
            coef= 1.725;
        }


        int result=0;

        if ( gender.equals("m")){

            double mBHM= 66 + (13.7 * weight) + (5 * (hight*100.0)) - (6.8 * old);



            result= (int)Math.ceil(mBHM* coef);

        } else{

            double fBHM= 655 + (9.6* weight) + (1.8* (hight*100.0)) - (4.7 * old);

            result= (int)Math.ceil(fBHM* coef);

        }

        System.out.printf("To maintain your current weight you will need %d calories per day.", result);


    }
}
