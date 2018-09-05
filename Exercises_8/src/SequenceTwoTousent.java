import java.util.Scanner;

public class SequenceTwoTousent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());


        int count= 1;

      while (count<= n){
          System.out.println(count);
          count= count*2+1;


      }




    }
}


