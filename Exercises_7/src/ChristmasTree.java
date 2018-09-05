import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());


        for (int i = 0; i <= n; i++) {

            String space= repeatStr(" ", n- i );
            String star= repeatStr("*", i );

            System.out.print(space);
            System.out.print(star);
            System.out.print(" | ");
            System.out.print(star);
            System.out.println(space);


        }


    }




private static String repeatStr (String stringToRepeat, int count){
    String text = "";

    for (int i = 0; i < count; i++) {

        text = text + stringToRepeat;

    }

        return  text;

    }
}
