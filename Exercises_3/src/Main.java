import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double grade= Double.parseDouble(in.nextLine());


        if (grade >= 5.5){
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }


    }
}
