import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DanceHall {

    public static void main(String[] args) throws IOException {

        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        double L= Double.parseDouble(in.readLine());
        double W= Double.parseDouble(in.readLine());
        double A= Double.parseDouble(in.readLine());

        double areaOfHall= (L* 100)* (W* 100);
        double areaPeika = areaOfHall/ 10;
        double areaGarderob = (A*100) * (A*100);


        double realAreaOfHall= areaOfHall- areaGarderob- areaPeika;

        int numDancers = (int) Math.floor(realAreaOfHall/(40+ 7000));



        System.out.println(numDancers);




    }
}
