import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String word= in.nextLine();

        if (word.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
