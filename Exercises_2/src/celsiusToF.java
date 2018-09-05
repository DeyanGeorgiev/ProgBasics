import java.util.Scanner;

public class celsiusToF {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);


        Double celsius = Double.parseDouble(in.nextLine());


        double F= celsius * 1.8 + 32;

        System.out.printf("%.2f", F);


    }
}
