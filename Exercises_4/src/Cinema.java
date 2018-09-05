import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String type = in.nextLine();
        int numberRows = Integer.parseInt(in.nextLine());
        int numberColums = Integer.parseInt(in.nextLine());

        double price = 0.0;


        switch (type) {

            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price= 5.00;


        }
        double sum = numberColums * numberRows * price;
        System.out.printf("%.2f leva", sum);
    }
}
