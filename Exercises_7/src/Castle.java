import java.util.Scanner;

public class Castle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());


        int dash = 0;
        int chavka = 1;

        for (int i = 3; i < n; i++) {


            if (i % 2 != 0) {
                chavka++;
            }

            if (i % 2 == 0) {
                dash++;
            }


        }


        String firstPart = "/" + repeatStr("^", chavka) + "\\" +
                repeatStr("_", dash) + repeatStr("_", dash) + "/" + repeatStr("^", chavka) + "\\";
        System.out.println(firstPart);

        for (int k = 0; k < n - 3; k++) {


            System.out.print("|");

            for (int j = 0; j < n * 2 - 2; j++) {

                System.out.print(" ");
            }

            System.out.println("|");
        }



        int secDownDsh = 0;
        int secEmtySpace = 1;
        for (int r = 3; r < n; r++) {

            if (r % 2 != 0) {
                secEmtySpace++;
            }

            if (r % 2 == 0) {
                secDownDsh++;
            }


        }


        String uperBottom= "|" + repeatStr(" ", secEmtySpace) + " " +
                repeatStr("_", secDownDsh) + repeatStr("_", secDownDsh) + " " + repeatStr(" ", secEmtySpace) + "|";

        System.out.println(uperBottom);

        //


        int empty = 0;
        int downDash = 1;

        for (int i = 3; i < n; i++) {


            if (i % 2 != 0) {
                downDash++;
            }

            if (i % 2 == 0) {
                empty++;
            }


        }


        String secPart = "\\" + repeatStr("_", downDash) + "/" +
                repeatStr(" ", empty) + repeatStr(" ", empty) + "\\" + repeatStr("_", downDash) + "/";
        System.out.println(secPart);


    }

    private static String repeatStr(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + stringToRepeat;

        }

        return text;

    }
}
