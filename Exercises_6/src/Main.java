import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int hourExam= Integer.parseInt(in.nextLine());
        int minutesExam= Integer.parseInt(in.nextLine());
        int hourArrival= Integer.parseInt(in.nextLine());
        int minutesArrival= Integer.parseInt(in.nextLine());

        int exam= hourExam*60+ minutesExam;
        int arrive= hourArrival*60+ minutesArrival;


        int diff= Math.abs(exam-arrive);

        if (diff >=0 && diff <= 30){
            System.out.println("On time");

            if ( exam<= arrive - 30){
                diff= exam-arrive;
                System.out.printf("%d minutes before the start", diff);
            } else  if (exam< arrive){
                System.out.println("Late");
                diff= Math.abs(arrive- exam);
                if (diff>= 60){
                    int hour = diff/ 60;
                    int min =diff % 60;
                    System.out.printf("%d:%02d minutes after start", hour, min);
                }

            } else if ( exam-30 > arrive){
                System.out.println("Early");
                diff= arrive- exam;
                if (diff>= 60){
                    int hour = diff/ 60;
                    int min =diff % 60;
                    System.out.printf("%d:%02d minutes before start", hour, min);
                }
            }
        }

    }
}
