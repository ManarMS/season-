
import java.util.Scanner;


public class e5_15 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int month;
    int day;
    String season = null;

    System.out.print("Please enter month : ");
    month = in.nextInt();
    System.out.print("Please enter day: ");
    day = in.nextInt();

    if(1 <= month && month <=3){
        season = "Winter";
    }

    else if (4 <= month && month <=6){
        season = "Spring";
    }

    else if (7 <=month && month <=9){
        season = "Summer";
    }

    else if (10 <= month && month <= 12){
        season = "Fall";
    }
       if ((month % 3 == 0) && (day>=21)){
             
        if (season.equals("Winter")){
            
            season="Spring";
        }

        else if (season.equals("Spring")){
            season = "Summer";
        }

        else if (season.equals("Summer")){
            season = "Fall";
        }

        else {
            season = "Winter";
        }


    }

    System.out.println(season);
}
    }
    
   
