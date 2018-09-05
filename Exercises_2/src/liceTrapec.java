import java.util.Scanner;

public class liceTrapec {

    public static void main(String[] args) {


                Scanner in = new Scanner(System.in);


                double b1= in.nextDouble();
                double b2= in.nextDouble();
                double h= in.nextDouble();

                double result= (b1 + b2) * h / 2.0;

                System.out.println(result);

            }
        }

