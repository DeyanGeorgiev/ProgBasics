import java.util.Scanner;

public class Mask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        //up






            int leftEmpty=n-2;

            int leftNextEmpty= 0;


            for (int j = 1; j <= n-1; j++) {

                String upperPart = repeatStr(" ", leftEmpty)+ "/"+ repeatStr(" ", leftNextEmpty)+"|  |"
                        + repeatStr(" ", leftNextEmpty)+"\\"+repeatStr(" ", leftEmpty);
                System.out.print(upperPart);
                System.out.println();


                        leftEmpty= leftEmpty-1;
                        leftNextEmpty= leftNextEmpty+1;





            }

            String tireta= repeatStr("-",(2*n) +2);
        System.out.println(tireta);

        System.out.println("|"+ repeatStr(" ", n/2-1)+"_"+ repeatStr(" ", n+1)+"_"+ repeatStr(" ", n/2-1)+"|");
        System.out.println("|"+ repeatStr(" ", n/2-1)+"@"+ repeatStr(" ", n+1)+"@"+ repeatStr(" ", n/2-1)+"|");

        for (int i = 0; i < n/2 ; i++) {


            System.out.println("|" + repeatStr(" ", n / 2 - 1) + " " + repeatStr(" ", n + 1) + " " + repeatStr(" ", n / 2 - 1) + "|");
        }

        System.out.println("|"+ repeatStr(" ", n-1)+"OO"+  repeatStr(" ", n-1)+"|");
        System.out.println("|"+ repeatStr(" ", n-2)+"/  \\"+  repeatStr(" ", n-2)+"|");
        System.out.println("|"+ repeatStr(" ", n-2)+"||||"+  repeatStr(" ", n-2)+"|");



        for (int i = 1; i <= n; i++) {

            System.out.println(repeatStr("\\", i)+repeatStr("`", ((2*n)+2)-(2*i))+  repeatStr("/", i));

        }

        System.out.println(repeatStr("\\", n+1)+  repeatStr("/", n+1));









    }

    private static String repeatStr(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + stringToRepeat;

        }

        return text;

    }
}
