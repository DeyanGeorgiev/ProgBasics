import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        switch (input){

            case "dog":
                System.out.println("mammal");
                break;
            case  "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
                default:
                    System.out.println("unknown");

        }
    }
}
