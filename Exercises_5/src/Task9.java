import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        int sum= 0;

        for (int i = 0; i < input.length() ; i++) {

            char currentSymbol = input.charAt(i);

            switch (currentSymbol){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                break;
            }

        }

        System.out.println(sum);
    }
}
