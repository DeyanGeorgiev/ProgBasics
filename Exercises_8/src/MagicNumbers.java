import java.util.Scanner;

public class MagicNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());



        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int o = 0; o <= 9; o++) {

                                if (i*j*k*l*m*o== n){
                                    System.out.print(String.format("%d%d%d%d%d%d ", i,j,k,l,m,o));
                                }



                            }

                        }

                    }

                }

            }
            
        }
    }
}
