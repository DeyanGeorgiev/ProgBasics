import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int w = 2 * n + 1;
        int h = 8 * n - 8;

        for (int i = 1; i < n - 2; i++) {

            System.out.println(repeatStr(" ", n) + "|");

        }

        System.out.println(repeatStr(" ", n - 1) + "_|_" );


        for (int i = 1; i < n - 2; i++) {


            System.out.println(repeatStr(" ", n - 1) + "|-|" );


        }



        System.out.println(repeatStr(" ", n - 2) + "_|-|_" );

        for (int i = 1; i < n - 2; i++) {


            System.out.println(repeatStr(" ", n - 2) + "|***|" );


        }

        System.out.println(" " + repeatStr("_", n-3)+"|***|"+ repeatStr("_", n-3));


        for (int i = 0; i < 4*n - 1; i++) {


            System.out.println(" " + repeatStr("|", n - 2) + "---" + repeatStr("|", n - 2));


        }
        System.out.println("_" + repeatStr("|", n - 2) + "---" + repeatStr("|", n - 2)+"_");

        for (int i = 0; i < n-2; i++) {

            System.out.println(repeatStr("|", 2*n+1));

        }

    }

    private static String repeatStr(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + stringToRepeat;

        }

        return text;

    }
}

