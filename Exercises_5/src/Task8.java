import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int oddNum = 0;
        int evenNum = 0;

        for (int i = 1; i <= num; i++) {

            int currentNum = Integer.parseInt(in.nextLine());

            if( i % 2 !=0){
                oddNum +=currentNum;
            } else {
                evenNum +=currentNum;
            }

        }

        if ( oddNum== evenNum){

            System.out.printf("Yes, sum = %d", oddNum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(evenNum- oddNum));
        }

    }
}
