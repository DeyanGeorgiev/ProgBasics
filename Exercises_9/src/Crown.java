import java.util.Scanner;

public class Crown {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());

        if ( n>=8 && n<=50 ){

            System.out.println("@"+ repeatStr(" ", (((2 * n)-1)/2)-1)+"@"+ repeatStr(" ", (((2 * n)-1)/2)-1)+"@");
            System.out.println("**"+ repeatStr(" ", (((2 * n)-1)/2)-2)+"*"+ repeatStr(" ", (((2 * n)-1)/2)-2)+"**");




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
