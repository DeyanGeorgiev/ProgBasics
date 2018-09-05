import java.util.Scanner;

public class aquarium {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int L= Integer.parseInt(in.nextLine());
        int W= Integer.parseInt(in.nextLine());
        int H= Integer.parseInt(in.nextLine());
        double percent= Double.parseDouble(in.nextLine());

        int volumeCM3= L* W* H;

        double volumeL= (double) volumeCM3* 0.001;

        double percentage= percent/ 100;

        double calculation= volumeL* (1- percentage);

        System.out.printf("%.3f", calculation);


    }
}
