import java.util.Scanner;

public class House {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        int countStar = 1;



        if (n % 2 == 0) {
            countStar = 2;
        }
        
        int dash= (n-countStar)/2;

        for (int i = 0; i < (n + 1) / 2 ; i++) {

            String raw= repeatStr("-", dash)+ repeatStr("*", countStar)+
                    repeatStr("-", dash);

            System.out.println(raw);

            dash--;
            countStar+=2;

        }

        int star= n-2;

        for (int i = 0; i <= (n / 2) - 1 ; i++) {



            String secpart= "|"+ repeatStr("*", star)+"|";

            System.out.println(secpart);

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





