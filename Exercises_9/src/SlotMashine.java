import java.util.Scanner;

public class SlotMashine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char one = in.nextLine().charAt(0);
        int numOne= Integer.parseInt(in.nextLine());
//        char two = in.nextLine().charAt(0);
//        int numTwo= Integer.parseInt(in.nextLine());
//        char three = in.nextLine().charAt(0);
//        int numThree= Integer.parseInt(in.nextLine());

        char chOne= (char) (numOne + one);
//        int chTwo=  numTwo+ two;
//        int chTree=  numThree+ three;
//
//
//        System.out.printf( String.format("%c%c%c", chOne, chTwo, chTree));

        System.out.println(chOne);

    }
}
