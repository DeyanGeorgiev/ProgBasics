import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double speed= Double.parseDouble(in.nextLine());
        double fuel= Double.parseDouble(in.nextLine());

        double totalL= 384400*2;

        double totalTime= Math.ceil(totalL/ speed);

        int totalTimeWithRest= (int) totalTime + 3;

        int fueljsj= (int) (totalL* fuel)/100;

        System.out.println(totalTimeWithRest);
        System.out.println(fueljsj);
    }
}
