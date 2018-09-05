import java.util.Scanner;

public class liceTriagalnik {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);



        Double a= Double.parseDouble(in.nextLine());
        Double h= Double.parseDouble(in.nextLine());

        double area= a * h / 2;


        System.out.printf("%.2f", area);

    }
}
