import java.util.Scanner;

public class Sunglasses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());



            String star= repeatStr("*", n*2);
            String space= repeatStr(" ", n);

            System.out.print(star);
            System.out.print(space);
            System.out.println(star);




        for (int i = 0; i < n-2 ; i++) {



           String spacce= repeatStr(" ", n);
            String dash = repeatStr("/", (n*2)-2);
            String pipe = repeatStr("|", n);

            if (i == (n - 1) / 2 - 1){

                System.out.println("*"+dash+"*"+pipe+"*"+dash+"*");

            } else {
                System.out.println("*"+dash+"*"+spacce+"*"+dash+"*");
            }

        }


        System.out.print(star);
        System.out.print(space);
        System.out.println(star);









    }

    private static String repeatStr (String stringToRepeat, int count){
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + stringToRepeat;

        }

        return  text;

    }

}
