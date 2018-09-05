import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numDays= Integer.parseInt(in.nextLine());


        double totalDistance=0;
        int totalMinutes=0;
        int cals= 0;



        for (int i = 0; i < numDays ; i++) {

            int timeRunPerDay= Integer.parseInt(in.nextLine());
            double distancePerDAy= Double.parseDouble(in.nextLine());
            String mE = in.nextLine();

            if ( mE.equals("m")){
                totalDistance+= distancePerDAy/1000.00;
                totalMinutes+= timeRunPerDay;
                cals += (400*timeRunPerDay)/ 20;
            } else{
                totalDistance+= distancePerDAy;
                totalMinutes+= timeRunPerDay;
                cals += (400*timeRunPerDay)/ 20;
            }




        }


        System.out.printf("He ran %.2fkm for %d minutes and burned %d calories.", totalDistance, totalMinutes, cals);




    }
}
