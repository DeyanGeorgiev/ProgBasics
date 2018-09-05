import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ThTask {

    public static void main(String[] args) throws IOException {

        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(in.readLine());
        double bonusPoints= 0;


        if (num <=100){
            bonusPoints = 5;
        } else if (num > 101 && num<= 1000){
            bonusPoints= 0.2* num;
        } else if (num > 1000){
            bonusPoints =0.1* num;
        }


        if( num % 2 == 0){
            bonusPoints= bonusPoints+ 1;
        } else if ( num % 10== 5){
            bonusPoints= bonusPoints+ 2;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints+ num);

    }
}
