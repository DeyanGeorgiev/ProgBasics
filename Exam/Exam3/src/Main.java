import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pzFormatTraing= in.nextLine();
        int pzNumStudents= Integer.parseInt(in.nextLine());
        String rzFormatTraing= in.nextLine();
        int rzNumStudents= Integer.parseInt(in.nextLine());
        String kzFormatTraing= in.nextLine();
        int kzNumStudents= Integer.parseInt(in.nextLine());

        int capacityHall= 600;


        int sumOnline= 0;
        int sumOnsite= 0;




        switch (pzFormatTraing){
           case "online":
               sumOnline+= pzNumStudents;
               break;
           case "onsite":
               sumOnsite+= pzNumStudents;
               break;
       }

        switch (rzFormatTraing){
            case "online":
                sumOnline+= rzNumStudents;
                break;
            case "onsite":
                sumOnsite+= rzNumStudents;
                break;
        }

        switch (kzFormatTraing){
            case "online":
                sumOnline+= kzNumStudents;
                break;
            case "onsite":
                sumOnsite+= kzNumStudents;
                break;
        }






        int totalStudents = sumOnline+ sumOnsite;

        if (sumOnsite > capacityHall){

            sumOnline+= sumOnsite-capacityHall;
            sumOnsite= sumOnsite -(sumOnsite- capacityHall);

            System.out.println("Online students: "+sumOnline);
            System.out.println("Onsite students: "+sumOnsite);
            System.out.println("Total students: "+totalStudents);
        } else {
            System.out.println("Online students: "+sumOnline);
            System.out.println("Onsite students: "+sumOnsite);
            System.out.println("Total students: "+totalStudents);
        }







    }
}
