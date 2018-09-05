import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numCount = Integer.parseInt(in.nextLine());

        int sum = 0;

        for (int i = 0; i < numCount; i++) {

            int sumNumb = Integer.parseInt(in.nextLine());

            sum = sum + sumNumb;


        }

        System.out.println(sum);
    }
}
