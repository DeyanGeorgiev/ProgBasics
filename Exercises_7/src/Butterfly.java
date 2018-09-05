import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());



        for (int i = 0; i < n-2 ; i++) {

            if (i % 2 == 0){

                String someRow= repeatStr("*", n-2)+ "\\"+" "+"/"+ repeatStr("*", n-2);
                System.out.println(someRow);
            } else {
                String someRow= repeatStr("-", n-2)+ "\\"+" "+"/"+ repeatStr("-", n-2);
                System.out.println(someRow);
            }

        }

        String body = repeatStr(" ", n-1);
        System.out.println(body+"@");

        for (int i = 0; i < n-2 ; i++) {

            if (i % 2 == 0){

                String someRow= repeatStr("*", n-2)+ "/"+" "+"\\"+ repeatStr("*", n-2);
                System.out.println(someRow);
            } else {
                String someRow= repeatStr("-", n-2)+ "/"+" "+"\\"+ repeatStr("-", n-2);
                System.out.println(someRow);
            }

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
