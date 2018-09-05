import java.util.Scanner;

public class NameGroup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char one= in.nextLine().toUpperCase().charAt(0);
        char two= in.nextLine().toLowerCase().charAt(0);
        char three= in.nextLine().toLowerCase().charAt(0);
        char four= in.nextLine().toLowerCase().charAt(0);
        int n= Integer.parseInt(in.nextLine());


        int count=-1;

        for (char i = 'A'; i <= one ; i++) {
            for (char j = 'a'; j <= two ; j++) {
                for (char k = 'a'; k <= three ; k++) {
                    for (char l = 'a'; l <= four ; l++) {
                        for (int m =0; m<= n ; m++) {

                            count+=1;






                        }

                    }

                }

            }

        }
        System.out.println(count);
      //  System.out.println(num-1);
    }
}
