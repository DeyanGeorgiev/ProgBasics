import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {

    public static void main(String[] args) throws IOException {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int numb= Integer.parseInt(in.readLine());

        if (numb <=99){
            System.out.println("Less than 100");
        } else if (numb>=100 && numb<=200){
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
