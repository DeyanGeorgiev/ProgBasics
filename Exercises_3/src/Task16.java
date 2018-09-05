import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task16 {

    public static void main(String[] args) throws IOException {

        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
       int num= Integer.parseInt(in.readLine());




        if( num== 1){
            System.out.println("one");
        } else if (num== 2){
            System.out.println("two");
        }else if (num== 3){
            System.out.println("three");
        }else if (num== 4){
            System.out.println("four");
        }else if (num== 5){
            System.out.println("five");
        }else if (num== 6){
            System.out.println("six");
        }else if (num== 7){
            System.out.println("seven");
        }else if (num== 8){
            System.out.println("eight");
        }else if (num== 9){
            System.out.println("nine");
        }else if (num== 10){
            System.out.println("ten");
        }else if (num== 11){
            System.out.println("eleven");
        }else if (num== 12){
            System.out.println("twelve");
        }else if (num== 100){
            System.out.println("one hundred");
        }else if (num== 0){
            System.out.println("zero");
        }else if (num== 13){
            System.out.println("thirteen");
        }else if (num== 14){
            System.out.println("fourteen");
        }else if (num== 15){
            System.out.println("fifteen");
        }else if (num== 16){
            System.out.println("sixteen");
        }else if (num== 17){
            System.out.println("seventeen");
        }else if (num== 18){
            System.out.println("eighteen");
        }else if (num== 19){
            System.out.println("nineteen");
        } else if (num >=20 && num <= 99){

            String separ1Digit= String.valueOf(num).substring(0,1);
            String separ2Digit = String.valueOf(num).substring(1,2);

                if (separ1Digit.equals("2")){
                    System.out.print("twenty");
                } else if (separ1Digit.equals("3")){
                    System.out.print("thirty");
                }else if (separ1Digit.equals("4")){
                    System.out.print("forty");
                }else if (separ1Digit.equals("5")){
                    System.out.print("fifty");
                }else if (separ1Digit.equals("6")){
                    System.out.print("sixty");
                }else if (separ1Digit.equals("7")){
                    System.out.print("seventy");
                }else if (separ1Digit.equals("8")){
                    System.out.print("eighty");
                }else if (separ1Digit.equals("9")){
                    System.out.print("ninety");
                }

            if (separ2Digit.equals("2")){
                System.out.println(" two");
            } else if (separ2Digit.equals("3")){
                System.out.println(" three");
            }else if (separ2Digit.equals("4")){
                System.out.println(" four");
            }else if (separ2Digit.equals("5")){
                System.out.println(" five");
            }else if (separ2Digit.equals("6")){
                System.out.println(" six");
            }else if (separ2Digit.equals("7")){
                System.out.println(" seven");
            }else if (separ2Digit.equals("8")){
                System.out.println(" eight");
            }else if (separ2Digit.equals("9")){
                System.out.println(" nine");
            }else if (separ2Digit.equals("1")){
                System.out.println(" one");
            } else{
                System.out.println("");
            }

        }else {
            System.out.println("invalid number");
        }


    }
}
