import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());





        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i ; j--) {
                for (int k = 0; k <=9 ; k++) {
                    for (int l = 9; l >= k ; l--) {

                        int sum= i+j+k+l;
                        int proizvedenie= i*j*k*l;

                        int del= proizvedenie/sum;



                        if (sum == proizvedenie && (n % 10 ==5)){
                            System.out.print(String.format("%d%d%d%d", i,j,k,l));
                            return;
                        }

                        if (del ==3 && (n % 3== 0)){
                            System.out.print(String.format("%d%d%d%d", l,k,j,i));
                            return;
                        }
                        
                    }
                    
                }
                
            }
            
        }


        System.out.println("Nothing found");

    }

}
