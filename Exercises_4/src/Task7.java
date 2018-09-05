import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String town = in.nextLine();
        double sales= Double.parseDouble(in.nextLine());

        double commision= 0;

        if (town.equalsIgnoreCase("sofia")){

            if ( sales >=0 && sales<=500){
                commision= 5/ 100.0;
            } else if ( sales > 500 && sales <= 1000){
                commision = 7 / 100.0;
            } else if ( sales > 1000 && sales <= 10000){
                commision = 8 / 100.0;
            } else if (sales> 10000){
                commision= 12/ 100.0;
            }

        } else if (town.equalsIgnoreCase("plovdiv")){

            if ( sales >=0 && sales<=500){
                commision= 5.5/ 100.0;
            } else if ( sales > 500 && sales <= 1000){
                commision = 8 / 100.0;
            } else if ( sales > 1000 && sales <= 10000){
                commision = 12 / 100.0;
            } else if (sales> 10000){
                commision= 14.5/ 100.0;
            }

        } else if (town.equalsIgnoreCase("Varna")){

            if ( sales >=0 && sales<=500){
                commision= 4.5/ 100.0;
            } else if ( sales > 500 && sales <= 1000){
                commision = 7.5 / 100.0;
            } else if ( sales > 1000 && sales <= 10000){
                commision = 10 / 100.0;
            } else if (sales> 10000){
                commision= 13/ 100.0;
            }

        }


        if (commision != 0) {
            double reward = sales * commision;
            System.out.printf("%.2f", reward);
        } else {
            System.out.println("error");
        }
    }
}
