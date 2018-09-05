import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numPasengers = Integer.parseInt(in.nextLine());
        int numStops = Integer.parseInt(in.nextLine());


        int totalPassengers = 0;


        for (int i = 1; i < numStops * 2; i++) {

            int nextSlizat = Integer.parseInt(in.nextLine());
            int nexKachvat = Integer.parseInt(in.nextLine());


            totalPassengers = numPasengers - nextSlizat + nexKachvat;

            if (i % 2 != 0) {
                totalPassengers += 2;

            } else {
                totalPassengers -= 2;
            }


        }

        System.out.println(totalPassengers);


    }
}
