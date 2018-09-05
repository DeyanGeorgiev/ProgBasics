import java.util.Scanner;

public class TableNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());


        for (int r = 1; r <= n; r++) {

            System.out.print(r+" ");

            for (int c = 0; c < n-1; c++) {

                int num = r + c + 1;

                if ( num <= n){

                System.out.print(num+" ");}
                else{
                    num=  2*n - num;

                    System.out.print(num+ " ");

                }


            }

            System.out.println();
            
        }
    }
}
