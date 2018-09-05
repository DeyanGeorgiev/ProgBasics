import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number = Double.parseDouble(in.nextLine());
        String input = in.nextLine();
        String output = in.nextLine();

        double m = 1;


        if (input.equals("m")) {
            if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * (m * 1000));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * (m * 100));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * (m * 0.000621371192));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * (m * 39.3700787 ));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * (m * 0.001));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * (m * 3.2808399));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * (m * 1.0936133));
            } else {
                System.out.printf("%.08f mm", number * m);
            }
        } else if (input.equals("mm")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 1000);
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 1000));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 1000));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787  / (m * 1000));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001 / (m * 1000));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399 / (m * 1000));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 1000));
            } else {
                System.out.printf("%.08f mm", number);
            }
        } else if (input.equals("mi")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 0.000621371192);
            } else if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * 1000 / (m * 0.000621371192));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 0.000621371192));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787  / (m * 0.000621371192));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001 / (m * 0.000621371192));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399 / (m * 0.000621371192));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 0.000621371192));
            } else {
                System.out.printf("%.08f mi", number);
            }

        } else if (input.equals("cm")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 100);
            } else if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * 1000 / (m * 100));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 100));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787  / (m * 100));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001 / (m * 100));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399 / (m * 100));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 100));
            } else {
                System.out.printf("%.08f cm", number);
            }
        } else if (input.equals("in")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 39.3700787 );
            } else if (output.equals("mm")) {
                System.out.printf("%.08f", number * 1000 / (m * 39.3700787 ));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 39.3700787 ));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 39.3700787 ));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001 / (m * 39.3700787 ));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399 / (m * 39.3700787 ));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 39.3700787 ));
            } else {
                System.out.printf("%.08f in", number);
            }
        }else if (input.equals("km")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 0.001 );
            } else if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * 1000 / (m * 0.001 ));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 0.001 ));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 0.001 ));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787 / (m * 0.001 ));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399 / (m * 0.001 ));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 0.001 ));
            } else {
                System.out.printf("%.08f km", number);
            }
        }else if (input.equals("ft")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 3.2808399  );
            } else if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * 1000 / (m * 3.2808399  ));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 3.2808399  ));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 3.2808399  ));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787 / (m * 3.2808399  ));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001  / (m * 3.2808399  ));
            } else if (output.equals("yd")) {
                System.out.printf("%.08f yd", number * 1.0936133 / (m * 3.2808399  ));
            } else {
                System.out.printf("%.08f ft", number);
            }
        }else if (input.equals("yd")) {
            if (output.equals("m")) {
                System.out.printf("%.08f m", number / 1.0936133   );
            } else if (output.equals("mm")) {
                System.out.printf("%.08f mm", number * 1000 / (m * 1.0936133  ));
            } else if (output.equals("cm")) {
                System.out.printf("%.08f cm", number * 100 / (m * 1.0936133  ));
            } else if (output.equals("mi")) {
                System.out.printf("%.08f mi", number * 0.000621371192 / (m * 1.0936133  ));
            } else if (output.equals("in")) {
                System.out.printf("%.08f in", number * 39.3700787 / (m * 1.0936133  ));
            } else if (output.equals("km")) {
                System.out.printf("%.08f km", number * 0.001  / (m * 1.0936133  ));
            } else if (output.equals("ft")) {
                System.out.printf("%.08f ft", number * 3.2808399  / (m * 1.0936133  ));
            } else {
                System.out.printf("%.08f yd", number);
            }
        }
    }
}
