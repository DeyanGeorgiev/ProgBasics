import java.util.Scanner;

public class ChiloDiapazon0do100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        System.out.println("Еnter a number in the range [1...100]:");

        while (n< 1 || n> 100){

            System.out.println("Invalid number!");
            n= Integer.parseInt(in.nextLine());
        }
        System.out.println("The number is: "+n);

    }
}
