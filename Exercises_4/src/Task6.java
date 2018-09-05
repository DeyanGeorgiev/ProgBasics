import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String product = in.nextLine();
        String dayOfWeek = in.nextLine();
        double quantity = Double.parseDouble(in.nextLine());

        double price = 0;

        if (dayOfWeek.equalsIgnoreCase("saturday") ||
                dayOfWeek.equalsIgnoreCase("sunday")) {


            if (product.equalsIgnoreCase("banana")) {
                price = 2.70;
            } else if (product.equalsIgnoreCase("apple")) {
                price = 1.25;
            } else if (product.equalsIgnoreCase("orange")) {
                price = 0.9;
            } else if (product.equalsIgnoreCase("grapefruit")) {
                price = 1.6;
            } else if (product.equalsIgnoreCase("kiwi")) {
                price = 3.0;
            } else if (product.equalsIgnoreCase("pineapple")) {
                price = 5.60;
            } else if (product.equalsIgnoreCase("grapes")) {
                price = 4.20;
            }

        }else if ( dayOfWeek.equalsIgnoreCase("monday") || dayOfWeek.equalsIgnoreCase("tuesday") ||
                dayOfWeek.equalsIgnoreCase("wednesday") ||
             dayOfWeek.equalsIgnoreCase("thursday") ||
            dayOfWeek.equalsIgnoreCase("friday")) {



                if (product.equalsIgnoreCase("banana")) {
                    price = 2.50;
                } else if (product.equalsIgnoreCase("apple")) {
                    price = 1.20;
                }else if (product.equalsIgnoreCase("orange")) {
                    price = 0.85;
                }else if (product.equalsIgnoreCase("grapefruit")) {
                    price = 1.45;
                }else if (product.equalsIgnoreCase("kiwi")) {
                    price = 2.7;
                }else if (product.equalsIgnoreCase("pineapple")) {
                    price = 5.50;
                }else if (product.equalsIgnoreCase("grapes")) {
                    price = 3.85;
                }

       }

            double sum = price * quantity;
            if (sum == 0) {
                System.out.println("error");
            } else {
                System.out.printf("%.2f", sum);
            }

        }
    }
