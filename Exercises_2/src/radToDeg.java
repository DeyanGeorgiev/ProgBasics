import java.util.Scanner;

public class radToDeg {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double rad= Double.parseDouble(in.nextLine());


        double deg= rad * (180/ Math.PI);

        double newDeg = Math.round(deg);

        System.out.println(newDeg);

    }
}
