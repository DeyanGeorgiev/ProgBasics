import java.util.Scanner;

public class usdToBGN {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        double input = Double.parseDouble(in.nextLine());

        double USD= 1.79549;

        double cinvert = input* USD;

        System.out.printf("%.2f", cinvert);

    }
}
