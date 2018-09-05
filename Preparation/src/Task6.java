import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNum= Integer.parseInt(in.nextLine());
        int secNum= Integer.parseInt(in.nextLine());



        for (int i = firstNum; i <= secNum ; i++) {
            for (int j = firstNum; j <= secNum ; j++) {
                for (int k = firstNum; k <= secNum ; k++) {
                    for (int l = firstNum; l <= secNum ; l++) {

                        boolean first= (i % 2 !=0 )&& (l % 2== 0) ||  (i % 2 ==0) && (l % 2!= 0);
                        boolean sec= i>l ;
                        boolean third = (j+k) % 2 ==0 ;

                        if (first && sec && third){

                            System.out.print(String.format("%d%d%d%d ", i, j, k ,l));



                        }

                        }

                    }

                }

            }
            
        }
    }

