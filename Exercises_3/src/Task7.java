import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstPlayer= Integer.parseInt(in.nextLine());
        int secondPlayer= Integer.parseInt(in.nextLine());
        int thirdPlayer= Integer.parseInt(in.nextLine());


        int sum = firstPlayer+ secondPlayer+ thirdPlayer;

        if (sum <= 9){
            System.out.println("0:0"+sum);
        } else if (sum <=59){
            System.out.println("0:"+sum);
        } else if (sum <=119){
            if (sum>=60 && sum <= 69){
                System.out.println("1:0"+(sum-60));
            } else {
                System.out.println("1:"+(sum-60));
            }
        } else if (sum <=179){
            if (sum>=120 && sum <= 129){
                System.out.println("2:0"+(sum-120));
            } else {
                System.out.println("2:"+(sum-120));
            }
        }




    }
}
