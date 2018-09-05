import java.util.Scanner;

public class Chistograma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int number = Integer.parseInt(in.nextLine());


        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;
        int countFourth = 0;
        int countFifth = 0;

        for (int j = 0; j < number; j++) {

            int num = Integer.parseInt(in.nextLine());



                if (num >= 800) {

                    countFifth++;

                } else if ( num <= 799 && num >=600) {

                    countFourth++;

                } else if (num <= 599 && num >=400) {

                    countThird++;

                } else if (num <= 399 && num >= 200) {

                    countSecond++;

                } else {

                    countFirst++;

                }




        }

        double p1 = (double)countFirst/ (double)number * 100 ;
        double p2 = (double) countSecond / (double)number*100 ;
        double p3 = (double)countThird / (double)number*100 ;
        double p4 = (double)countFourth / (double)number*100 ;
        double p5 = (double)countFifth / (double)number*100;

        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");
        System.out.printf("%.2f", p4);
        System.out.println("%");
        System.out.printf("%.2f", p5);




    }


}


