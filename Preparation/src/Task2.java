import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double hShip= Double.parseDouble(in.nextLine());
        double lShip= Double.parseDouble(in.nextLine());
        double wShip= Double.parseDouble(in.nextLine());

        double hightAustronauts = Double.parseDouble(in.nextLine());


        double volumeShip = hShip*lShip*wShip;

        double volumeOfRoom= (hightAustronauts+ 0.40)*2*2;

        double doTheyHaveSpace= (int) Math.floor(volumeShip/ volumeOfRoom);

        if ( doTheyHaveSpace >= 3 || doTheyHaveSpace<=10 )
            System.out.println(String.format("The spacecraft holds %.0f astronauts.", doTheyHaveSpace));
        else if (doTheyHaveSpace <=2)
        System.out.println("The spacecraft is too small.");
        else if (doTheyHaveSpace>=11)
            System.out.println("The spacecraft is too small.");

    }
}
