import java.util.Scanner;

public class licePravougulnikRavnina {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        Double x1= Double.parseDouble(in.nextLine());
        Double y1= Double.parseDouble(in.nextLine());
        Double x2= Double.parseDouble(in.nextLine());
        Double y2= Double.parseDouble(in.nextLine());


        double sizeX= Math.max(x1, x2)- Math.min(x1, x2);
        double sizeY= Math.max(y1, y2)- Math.min(y1, y2);

        double area= sizeX*sizeY;
        double perimeter= 2*(sizeX + sizeY);

        System.out.println(area);
        System.out.println(perimeter);


    }
}
