import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {

            int countNum = Integer.parseInt(in.nextLine());


            if (countNum < min) {
                min = countNum;
            }

        }
        System.out.println(min);
    }
}

