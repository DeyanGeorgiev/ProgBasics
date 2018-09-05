import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double x1= Double.parseDouble(in.nextLine());
        double y1= Double.parseDouble(in.nextLine());
        double x2= Double.parseDouble(in.nextLine());
        double y2= Double.parseDouble(in.nextLine());
        double x= Double.parseDouble(in.nextLine());
        double y= Double.parseDouble(in.nextLine());


        boolean inOnLeftSide = (x== x1 && y >= y1 && y <= y2 );
        boolean isOnRightSide= ( x==x2 && y >= y1 && y <= y2);
        boolean isOnUpperSide= ( y== y1 && x>= x1 && x <= x2 );
        boolean isDownSide= ( y== y2 && x >= x1 && x <= x2 );

        if ( isDownSide|| isOnRightSide|| isOnUpperSide || inOnLeftSide){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
