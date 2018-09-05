

    import java.util.Scanner;

    public class Test {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n = Integer.parseInt(in.nextLine());



            int star= 0;

            if ( n== 3){
                System.out.println("-*-");
            }else{


            if  ( n % 2 == 0) {
                star = 2;

                int tiretaLR = (n - 1) / 2;
                int tiretaMid = n - 2 * tiretaLR - 2;


                String firstRaw = repeatStr("-", tiretaLR) + repeatStr("*", star) + repeatStr("-", tiretaLR);
                System.out.println(firstRaw);

                for (int i = 1; i < n/2; i++) {

                    tiretaLR-=1;
                    tiretaMid+=2;
                    star =1;

                    String nextRaws = repeatStr("-", tiretaLR) + repeatStr("*", star)+ repeatStr("-", tiretaMid)+
                            repeatStr("*", star)+ repeatStr("-", tiretaLR);

                    System.out.println(nextRaws);

                }

            } else {

                star = 1;

                int tiretaLR = (n - 1) / 2;
                int tiretaMid = n - 2 * tiretaLR - 2;


                String firstRaw = repeatStr("-", tiretaLR) + repeatStr("*", star) + repeatStr("-", tiretaLR);
                System.out.println(firstRaw);

                for (int i = 0; i < n / 2; i++) {

                    tiretaLR -= 1;
                    tiretaMid += 2;
                    star = 1;

                    String nextRaws = repeatStr("-", tiretaLR) + repeatStr("*", star) + repeatStr("-", tiretaMid) +
                            repeatStr("*", star) + repeatStr("-", tiretaLR);

                    System.out.println(nextRaws);


                }
            }

            // next raws in first part

            int dtiretaMid = (n - 2);
            int dtiretaLR = 0;


            if ( n % 2 == 0){

                // n/2-1

                for (int j = (n/2)-1; j >=1; j--) {

                    dtiretaLR+=1;
                    dtiretaMid-=2;
                    star =1;

                    String nextRaws = repeatStr("-", dtiretaLR) + repeatStr("*", star)+ repeatStr("-", dtiretaMid)+
                            repeatStr("*", star)+ repeatStr("-", dtiretaLR);

                    System.out.println(nextRaws);

                }
            }else {

                String lastRaw = "";
                for (int j = n / 2; j >= 2; j--) {

                    dtiretaLR += 1;
                    dtiretaMid -= 2;
                    star = 1;

                    String nextRaws = repeatStr("-", dtiretaLR) + repeatStr("*", star) + repeatStr("-", dtiretaMid) +
                            repeatStr("*", star) + repeatStr("-", dtiretaLR);

                    System.out.println(nextRaws);

                    lastRaw = repeatStr("-", dtiretaLR + 1) + repeatStr("*", star) + repeatStr("-", dtiretaLR + 1);


                }


                System.out.println(lastRaw);
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