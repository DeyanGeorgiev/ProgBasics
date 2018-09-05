import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String planet = in.nextLine();
        int days = Integer.parseInt(in.nextLine());


        double distance = 0;

        boolean valid = true;

        int count= 0;


        switch (planet) {
            case "Mercury":


                if (days > 7) {

                    count= 1;
                } else {

                    distance = 0.61;
                }

                break;
            case "Venus":
                if (days > 14) {
                    count= 1;
                } else {

                    distance = 0.28;
                }
                break;
            case "Mars":
                if (days > 20) {
                    count= 1;
                } else {

                    distance = 0.52;
                }
                break;
            case "Jupiter":
                if (days > 5) {
                    count= 1;
                } else {

                    distance = 4.2;
                }
                break;
            case "Saturn":
                if (days > 3) {
                    count= 1;
                } else {

                    distance = 8.52;
                }
                break;
            case "Uranus":
                if (days > 3) {
                    count= 1;
                } else {

                    distance = 18.21;
                }
                break;
            case "Neptune":
                if (days > 2) {
                    count= 1;

                } else {

                    distance = 29.09;
                }
                break;

            default:
                valid = false;
                break;

        }

        if (valid) {

            if (count== 0){

            double totalDistance = 2 * distance;
            double totalDays = 2 * (226 * distance) + days;

            System.out.println(String.format("Distance: %.2f", totalDistance));
            System.out.println(String.format("Total number of days: %.2f", totalDays));}

            if ( count==1)
                System.out.println("Invalid number of days!");
        } else {
            System.out.println("Invalid planet name!");
        }


    }
}
