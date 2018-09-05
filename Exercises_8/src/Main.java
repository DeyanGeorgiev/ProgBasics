import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());


        int num = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(num);

            num *= 2;

        }


    }
}
