import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double record= Double.parseDouble(in.nextLine());
        double distanseM = Double.parseDouble(in.nextLine());
        double timeSforM= Double.parseDouble(in.nextLine());

        double needToRecord= distanseM* timeSforM;
        double resistence= Math.floor((distanseM/15))*12.5;

        double timeTotal= resistence+ needToRecord;


        if(record <= timeTotal){
            double restTime=  Math.abs(record-  timeTotal);

            System.out.printf("No, he failed! He was %.2f seconds slower.", restTime);

        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeTotal);
        }



    }
}
