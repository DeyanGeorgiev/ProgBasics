import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {

            int countNum = Integer.parseInt(in.nextLine());


            if (countNum > max) {
                max = countNum;
            }

        }
        System.out.println(max);
    }
}
