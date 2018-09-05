import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());


        for (int i = 1; i <= n ; i++) {

            System.out.println(repeatStr("-", (((2*n)+6)/2)-1)+"**"+repeatStr("-", (((2*n)+6)/2)-1));

        }

        for (int i = 1; i <= n-3 ; i++) {
            System.out.println(repeatStr("-", (((2*n)+6)/2)-2)+"****"+repeatStr("-", (((2*n)+6)/2)-2));



        }

        System.out.println(repeatStr("-", (((2*n)+6)/2)-3)+"******"+repeatStr("-", (((2*n)+6)/2)-3));

        for (int i = 1; i <= n-4; i++) {

            System.out.println(repeatStr("-", (((2*n)+6)/2)-3)+"**--**"+repeatStr("-", (((2*n)+6)/2)-3));

        }

        for (int i = 1; i <= n-3; i++) {

            System.out.println(repeatStr("-", (((2*n)+6)/2)-4)+"**----**"+repeatStr("-", (((2*n)+6)/2)-4));

        }


            System.out.println(repeatStr("-", (((2*n)+6)/2)-5)+"**********"+repeatStr("-", (((2*n)+6)/2)-5));

        for (int i = 0; i < n-3; i++) {

            System.out.println(repeatStr("-", ((((2*n)+6)/2)-6)-i)+"**"+repeatStr("-", 8+(2*i))+ "**"+repeatStr("-", ((((2*n)+6)/2)-6)-i));

        }

        System.out.println("***"+ repeatStr("-", 2*n)+"***");





    }

    private static String repeatStr(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + stringToRepeat;

        }

        return text;

    }
}
