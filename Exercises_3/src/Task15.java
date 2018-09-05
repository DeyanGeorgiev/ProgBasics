import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1= Integer.parseInt(in.nextLine());
        int num2= Integer.parseInt(in.nextLine());
        int num3= Integer.parseInt(in.nextLine());


        if (num1== num2 &&num1 == num3){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
