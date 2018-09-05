
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());



        int firstSum= 0;
        int firstNum= 0;
        int secNum= 0;
        int secSum = 0;

        for (int i = 0; i <= num; i++) {


            firstNum = Integer.parseInt(in.nextLine());
            secNum = Integer.parseInt(in.nextLine());

            firstSum = firstNum + secNum;




            for (int j = 0; j <= num; j++) {

                secSum = firstNum + secNum + firstSum;

            }
        }

            int difference= secSum- firstSum;

            if (secSum!= firstSum){
                System.out.println("haa");
            }



        }


        }














