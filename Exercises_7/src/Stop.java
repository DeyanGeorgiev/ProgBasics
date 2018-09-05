import java.util.Scanner;

public class Stop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        // upper part

        int dots = n + 1;
        int underslash = 2 * n + 1;

        String firstAndLast = repeatStr(".", dots) + repeatStr("_", underslash) + repeatStr(".", dots);

        System.out.println(firstAndLast);

        // middle upper part

        int mLeftRighDots = n + 1;
        int bottomdash = 0;
        for (int d = 0; d < n + 1; d++) {
            mLeftRighDots--;

            if (d == 0) {
                bottomdash = 2 * n - 1;
            } else {
                bottomdash += 2;
            }

            if (d >= n) {
                String middleUpperPart = repeatStr(".", mLeftRighDots) + "//" + repeatStr("_", (bottomdash / 2) - 2) + "STOP!" + repeatStr("_", (bottomdash / 2) - 2) + "\\\\" + repeatStr(".", mLeftRighDots);

                System.out.println(middleUpperPart);
            } else {

                String middleUpperPart = repeatStr(".", mLeftRighDots) + "//" + repeatStr("_", bottomdash) + "\\\\" + repeatStr(".", mLeftRighDots);

                System.out.println(middleUpperPart);
            }

        }

        int newLeftRighDots= 0;
        for (int down = 0; down < n; down++) {

            if (down != 0){
                bottomdash -= 2;
                newLeftRighDots+=1;}


            String downPart = repeatStr(".", newLeftRighDots) + "\\\\" + repeatStr("_", bottomdash) + "//" + repeatStr(".", newLeftRighDots);

            System.out.println(downPart);

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
