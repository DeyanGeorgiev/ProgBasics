import java.util.Scanner;

public class PrimePairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1= Integer.parseInt(in.nextLine());
        int num2= Integer.parseInt(in.nextLine());

        boolean isPrime = true;



        if ((num1>=10 && num1<=90) && (num2>=10 && num2<=90) ){


            int limNum1= Integer.parseInt(in.nextLine());
            int limNum2= Integer.parseInt(in.nextLine());

            int sumNum1= num1+ limNum1;
            int sumNum2= num2+ limNum2;




            for (int i = num1; i <= sumNum1 ; i++) {


                for (int j = num2; j <= sumNum2 ; j++) {

                    String printa= "";

                        while (j <= sumNum2 / 2 && i <= sumNum1/2) {
                            if (j % sumNum2!= 0 && i % sumNum1!= 1) {
                                String secNum= String.valueOf(j);
                                String firstNum = String.valueOf(i);
                                printa+=firstNum+secNum;
                                System.out.print(printa+ " ");

                            }
                            j++;
                            i++;
                        }

//
//                        if (isPrime) {
//
//
//                            String secNum= String.valueOf(j);
//                            String firstNum = String.valueOf(i);
//                            printa+=firstNum+secNum;
//                            System.out.print(printa+ " ");
//                        }



                }

            }
        }



    }
}
