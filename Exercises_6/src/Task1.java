import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        for (int i = 0; i < num; i++) {

            int firstNum= Integer.parseInt(in.nextLine());
            int secondNum= Integer.parseInt(in.nextLine());


            int sum = 0;
            int secondSum= sum;
            for (int j = 0; j < num; j++) {

                sum = firstNum+ secondNum;
                secondSum += sum;

            }
            System.out.println(sum);
            System.out.println(secondSum);

            // if ( secondSum)
        }


    }
}
