import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        double time1br= Double.parseDouble(in.nextLine());
        double time2br= Double.parseDouble(in.nextLine());
        double time3br= Double.parseDouble(in.nextLine());
        double timeFishFather= Double.parseDouble(in.nextLine());

        double totalTime= 1 / (1/time1br+1/time2br+1/time3br);

        double ttWithRest= totalTime+(totalTime*0.15);

        System.out.print( "Cleaning time: ");
        System.out.printf("%.02f", ttWithRest);
        System.out.println();


        double suprice = timeFishFather- ttWithRest;
        double suprise1= Math.floor(suprice);
        double suprice2= Math.abs(Math.floor(suprice));

        if ( suprice> 0){
            System.out.println("Yes, there is a surprise - time left -> "+(int) suprise1+" hours.");
        } else {
            System.out.println("No, there isn't a surprise - shortage of time -> "+(int) suprice2+" hours.");
        }
    }
}
