import java.util.Scanner;

public class PointInFigure {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = Integer.parseInt(in.nextLine());
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());

        boolean inFirstFig = (x>0 && x<h && y >0 && y <h);
        boolean inSecFig = (x>h && x<2*h && y>0 && y <4*h);
        boolean inThirdFig= (x>2*h && x< 3*h && y>0 && y< h);

        boolean border = (x==0 && y >= 0 && y <=h) || (y==h && x>=0 && x <= h)|| (x==h && y>=h && y <=4*h)||
                (y== 4*h && x>=h && x<= 2*h) || (x ==2*h && y >= h && y <= 4*h) || (y==h && x>= 2*h && x<= 3*h)||
                (x==3*h && y>=0 && y<= h)|| (y==0 && x>=0 && x<= 3*h);


        if (inFirstFig || inSecFig || inThirdFig || (inFirstFig&& inSecFig&& inThirdFig)) {
            System.out.println("inside");
        } else if ( border){
           System.out.println("border");
        } else{
            System.out.println("outside");
        }

        }
    }

