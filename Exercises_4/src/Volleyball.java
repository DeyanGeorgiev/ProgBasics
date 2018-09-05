import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String whatTypeOfYear= in.nextLine();
        int holydays = Integer.parseInt(in.nextLine());
        int numbWeeksendsNotInSofia= Integer.parseInt(in.nextLine());



        double plaingSathurdayInSofiq = (48- numbWeeksendsNotInSofia)* (3.0/4.0);
        double playindInHolydays= holydays* (2.0/3.0);


        double totalPlaingGames= plaingSathurdayInSofiq + numbWeeksendsNotInSofia + playindInHolydays;

        double plusAdditionalPlayng= 0;

        switch (whatTypeOfYear){

            case "leap":

                plusAdditionalPlayng= Math.floor(totalPlaingGames+ (0.15* totalPlaingGames));
                break;

            case"normal":

                plusAdditionalPlayng= Math.floor(totalPlaingGames);
                break;

        }

        System.out.println((int) plusAdditionalPlayng);
    }
}
