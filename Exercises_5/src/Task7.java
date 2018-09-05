import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < num; i++) {

            int countNum = Integer.parseInt(in.nextLine());
            leftSum += countNum;

        }

        for (int i = 0; i < num; i++) {
            int countNum = Integer.parseInt(in.nextLine());
            rightSum += countNum;

        }

        if ( rightSum== leftSum){

            System.out.printf("Yes, sum = %d", rightSum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(rightSum-leftSum));
        }


    }
}
