import java.util.Scanner;

public class PCStore {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double priceCPU= Double.parseDouble(in.nextLine());
        double priceVideo= Double.parseDouble(in.nextLine());
        double priceRAM= Double.parseDouble(in.nextLine());

        int countRAM= Integer.parseInt(in.nextLine());

        double discount = Double.parseDouble(in.nextLine());

        double lvCPU= priceCPU*1.57;
        double discCPU= lvCPU- (lvCPU*discount);

        double lvVideo= priceVideo*1.57;
        double discvideo= lvVideo- (lvVideo*discount);

        double lvPAM= (priceRAM*1.57)*countRAM;

        double sum= discCPU+ discvideo+ lvPAM;

        System.out.printf("Money needed - %.2f leva.",sum);


    }
}
