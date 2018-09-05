import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double age= Double.parseDouble(in.nextLine());
        char gender = in.nextLine().charAt(0);

        if (gender== 'f'){

            if(age < 16){
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if(age < 16){
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}