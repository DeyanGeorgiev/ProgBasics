import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());


        int maxNum = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 0; i < num; i++) {

            int countNum = Integer.parseInt(in.nextLine());

            sum += countNum;

            if (countNum >= maxNum) {
                maxNum = countNum;
            }


        }

        if ((sum-maxNum)!= maxNum) {
            int sumMin = sum - maxNum;
            int result = Math.abs(maxNum - sumMin);
            System.out.println("No");
            System.out.printf("Diff = %d", result);
        } else {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        }


    }
}

