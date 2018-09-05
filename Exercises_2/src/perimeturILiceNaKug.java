import java.util.Scanner;

public class perimeturILiceNaKug {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        Double r= Double.parseDouble(in.nextLine());

        Double area= Math.PI * Math.pow(r, 2);
        Double perimeter= 2 * Math.PI * r;

        System.out.println(area);
        System.out.println(perimeter);




    }




}
