import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String typeFig= in.nextLine();

        if (typeFig.equals("square")){
            double lengthSquare= Double.parseDouble(in.nextLine());
            double result = Math.pow(lengthSquare, 2);
            System.out.printf("%.03f", result);
        } else if (typeFig.equals("rectangle")){
            double sizeA= Double.parseDouble(in.nextLine());
            double sizeB= Double.parseDouble(in.nextLine());
            double result= sizeA* sizeB;
            System.out.printf("%.03f", result);
        } else if (typeFig.equals("circle")){
            double radius= Double.parseDouble(in.nextLine());
            double result= Math.PI* Math.pow(radius, 2);
            System.out.printf("%.03f", result);
        } else if (typeFig.equals("triangle")){
            double sizeL= Double.parseDouble(in.nextLine());
            double sizeH= Double.parseDouble(in.nextLine());
            double result= 0.5*sizeH*sizeL;
            System.out.printf("%.03f", result);
        }
    }
}
