import javax.swing.*;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numSteps= Integer.parseInt(in.nextLine());
        int numDancers= Integer.parseInt(in.nextLine());
        int numDayTrain= Integer.parseInt(in.nextLine());


        double stepsDaily= (((double) numSteps/ (double) numDayTrain)/ (double) numSteps);
        double roundStepsDayly= Math.ceil(stepsDaily*100);
        double percentStepsPerDancer = roundStepsDayly/numDancers;

        if ( roundStepsDayly <= 13){
            System.out.printf("Yes, they will succeed in that goal! %.02f" ,  percentStepsPerDancer);
            System.out.println("%.");
        }else {
            System.out.printf("No, They will not succeed in that goal! Required %.02f" ,  percentStepsPerDancer);
            System.out.println("% steps to be learned per day.");
        }


    }
}
