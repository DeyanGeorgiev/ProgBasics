import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double dohod = Double.parseDouble(in.nextLine());
        double srUspeh = Double.parseDouble(in.nextLine());
        double minZaplata = Double.parseDouble(in.nextLine());

        double ValueSocStip = Math.floor(minZaplata * 0.35);
        double ValueHighresult = Math.floor(srUspeh * 25);


        if (dohod <= minZaplata && srUspeh > 4.5) {


            if (srUspeh >= 5.5 && (ValueSocStip > ValueHighresult)) {
                System.out.printf("You get a Social scholarship %d BGN", (int) ValueSocStip);
            } else if (srUspeh >= 5.50 && (ValueSocStip < ValueHighresult)) {
                System.out.printf("You get a scholarship for excellent results %d BGN", (int) ValueHighresult);
            } else {
                System.out.printf("You get a Social scholarship %d BGN", (int) ValueSocStip);
            }}


            else if (dohod >= minZaplata && srUspeh >= 5.5) {
                System.out.printf("You get a scholarship for excellent results %d BGN", (int) ValueHighresult);
            }

            else if (dohod >= minZaplata && srUspeh < 4.5) {
                System.out.println("You cannot get a scholarship!");
            } else {
                System.out.println("You cannot get a scholarship!");
            }



        }
    }




