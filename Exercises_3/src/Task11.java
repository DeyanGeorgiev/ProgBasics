import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String firstWord= in.nextLine().toLowerCase();
        String secondWord= in.nextLine().toLowerCase();



        if(firstWord.equals(secondWord)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
