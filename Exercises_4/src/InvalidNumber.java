import java.util.Scanner;

public class InvalidNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = Integer.parseInt(in.nextLine());

        if ( number!= 0 &&  number < 100 || number > 200 ){
            System.out.println("invalid");
        }
    }
}
