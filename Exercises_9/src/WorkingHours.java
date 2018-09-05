import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int neobhodimiChasove= Integer.parseInt(in.nextLine());
        int broiRbotnici= Integer.parseInt(in.nextLine());
        int rabotniDni= Integer.parseInt(in.nextLine());

        int rabotniChovekoChasove= 8*rabotniDni*broiRbotnici;


        if ( rabotniChovekoChasove <= neobhodimiChasove){


            int overTime= Math.abs(neobhodimiChasove- rabotniChovekoChasove);


            int penalty = overTime*rabotniDni;

            System.out.println(overTime+" overtime");
            System.out.println("Penalties: "+penalty);
        } else{
            System.out.println(Math.abs(rabotniChovekoChasove- neobhodimiChasove)+" hours left");
        }


    }
}
