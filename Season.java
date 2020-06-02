import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //create a scanner
        int inputDay;
        String inputMonth;
        //System.out.println("Enter Month date");
        inputMonth = scnr.next();
        inputDay = scnr.nextInt(); //read the value for userNum
        
        if( 
          (inputMonth.equals("March") && inputDay >= 20 && inputDay <= 31) || 
          (inputMonth.equals("April") && inputDay >= 1 && inputDay <= 30) || 
          (inputMonth.equals("May") && inputDay >= 1 && inputDay <= 31) ||
          (inputMonth.equals("June") && inputDay >= 1 && inputDay <= 20)
          )
            System.out.println("Spring");
        else if (          
                (inputMonth.equals("June") && inputDay >= 21 && inputDay <= 30) || 
                (inputMonth.equals("July") && inputDay >= 1 && inputDay <= 31) || 
                (inputMonth.equals("August") && inputDay >= 1 && inputDay <= 31) ||
                (inputMonth.equals("September") && inputDay >= 1 && inputDay <= 21)
          )
                System.out.println("Summer");
             else if (
                    (inputMonth.equals("September") && inputDay >= 22 && inputDay <= 30) || 
                    (inputMonth.equals("October") && inputDay >= 1 && inputDay <= 31) || 
                    (inputMonth.equals("November") && inputDay >= 1 && inputDay <= 30) ||
                    (inputMonth.equals("December") && inputDay >= 1 && inputDay <= 20)
                 )
                    System.out.println("Autumn");
                  else if (
                            (inputMonth.equals("December") && inputDay >= 21 && inputDay <= 31) || 
                            (inputMonth.equals("January") && inputDay >= 1 && inputDay <= 31) || 
                            (inputMonth.equals("February") && inputDay >= 1 && inputDay <= 29) ||
                            (inputMonth.equals("March") && inputDay >= 1 && inputDay <= 19)
                      )
                    System.out.println("Winter");
                  else
                    System.out.println("Invalid");
    }
}